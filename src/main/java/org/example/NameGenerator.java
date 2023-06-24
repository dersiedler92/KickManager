package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NameGenerator {

    public String generateRandomName(String firstNamePath, String surnamePath) {
        List<Name> firstNames = getNames(firstNamePath);
        List<String> surnames = getSurnames(surnamePath);

        Random random = new Random();
        // actually a weighted first name selection would be cooler, but then again, surnames are random, too.
        String randomFirstName = firstNames.get(random.nextInt(firstNames.size())).getName();
        String randomSurname = surnames.get(random.nextInt(surnames.size()));

        return randomFirstName + " " + randomSurname;
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
