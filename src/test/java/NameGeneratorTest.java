import org.example.Name;
import org.example.NameGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class NameGeneratorTest {
    private final NameGenerator nameGenerator = new NameGenerator();

    @Test
    public void getNamesTest() {
        //arrange
        String testNamesPath = "src/test/resources/testNames.csv";

        //act
        List<Name> actualNames = nameGenerator.getNames(testNamesPath);

        //assert
        List<Name> expectedNames = List.of(
                new Name(13, "Aaron", "m"),
                new Name(1, "Aathiran", "m"),
                new Name(1, "Abbas", "m")
        );
        Assertions.assertEquals(expectedNames.get(2).getName(), actualNames.get(2).getName());
        Assertions.assertEquals(3, actualNames.size());
        Assertions.assertEquals("m", actualNames.get(1).getGender());
        Assertions.assertEquals(13, actualNames.get(0).getAmount());
    }

    @Test
    public void getSurnamesTest() {
        //arrange
        String testSurnamesPath = "src/test/resources/testSurnames.txt";

        //act
        List<String> actualSurnames = nameGenerator.getSurnames(testSurnamesPath);

        //assert
        List<String> expectedSurnames = List.of("Müller", "Schmidt", "Schneider");
        Assertions.assertEquals(expectedSurnames.get(0), actualSurnames.get(0));
    }

}
