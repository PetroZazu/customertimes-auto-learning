package com.customertimes.lection9;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        final String sp = File.separator;
        Path srcPath = Paths.get
                (System.getProperty("user.dir"));

        Path pathInput = Paths.get
                (srcPath + sp + "src" + sp + "main" + sp + "java" + sp + "com" + sp + "customertimes" + sp + "lection9" + sp + "inputData.txt");

        Path pathOutput = Paths.get
                (srcPath + sp + "src" + sp + "main" + sp + "java" + sp + "com" + sp + "customertimes" + sp + "lection9" + sp + "outputData.txt");

        List<String> lines = Files.readAllLines(pathInput);
        List<String> outputLines = new ArrayList<>();
        for (int i = lines.size() - 1; i >= 0; i--) {
            if (!lines.get(i).endsWith("5")) {
                outputLines.add(lines.get(i));
            }
        }
        Files.write(pathOutput, outputLines);

        byte[] bytes = Files.readAllBytes(pathOutput);
        System.out.print(new String(bytes));


    }
}
