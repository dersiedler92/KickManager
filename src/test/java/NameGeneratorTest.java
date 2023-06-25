import org.example.player.Name;
import org.example.player.NameGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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

    @Test
    public void randomNameGenerationTest() {
        //arrange
        String testNamesPath = "src/test/resources/testNames.csv";
        String testSurnamesPath = "src/test/resources/testSurnames.txt";

        //act
        String randomName = nameGenerator.generateRandomName(testNamesPath, testSurnamesPath);

        //assert
        List<String> expectedRandomNames = new ArrayList<>();
        List<String> expectedNames = List.of("Aaron", "Aathiran", "Abbas");
        List<String> expectedSurnames = List.of("Müller", "Schmidt", "Schneider");
        for (String firstName : expectedNames) {
            for (String surname : expectedSurnames) {
                expectedRandomNames.add(firstName + " " + surname);
            }
        }
        Assertions.assertTrue(expectedRandomNames.contains(randomName));
    }

}
