package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NameGenerator {

    public String generateRandomName() {
        String name = null;
        List<Name> firstNames = getNames("src/main/resources/names.csv");
        List<String> lastNames = getSurnames("src/main/resources/surnames.txt");
        //TODO: Finish


        return name;
    }

    public List<Name> getNames(String path) {
        Path namesPath = Paths.get(path);
        List<Name> names = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(namesPath, StandardCharsets.UTF_8)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(";");
                Name name = new Name(Integer.parseInt(fields[0]), fields[1], fields[2]);
                names.add(name);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return names;
    }

    public List<String> getSurnames(String path) {
        Path surnamesPath = Paths.get(path);
        List<String> surnames = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(surnamesPath, StandardCharsets.UTF_8)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                surnames.add(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return surnames;
    }

}
