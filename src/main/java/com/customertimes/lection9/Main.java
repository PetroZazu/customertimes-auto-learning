package com.customertimes.lection9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Path pathInput = Paths.get("C:\\Users\\petro.zazuliak\\Desktop\\inteliihProjects\\customertimes-auto-learning\\src\\main\\java\\com\\customertimes\\lection9\\inputData.txt");
        Path pathOutput = Paths.get("C:\\Users\\petro.zazuliak\\Desktop\\inteliihProjects\\customertimes-auto-learning\\src\\main\\java\\com\\customertimes\\lection9\\outputData.txt");

        List<String> lines = Files.readAllLines(pathInput);
        List<String> outputLines = new ArrayList<>();
        for (int i = lines.size() - 1; i >= 0; i--) {
            if (!lines.get(i).endsWith("5")) {
                outputLines.add(lines.get(i));
            }
        }

        Files.write(pathOutput, outputLines);


    }
}
