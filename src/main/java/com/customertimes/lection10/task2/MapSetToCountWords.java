package com.customertimes.lection10.task2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MapSetToCountWords {
    public static void main(String[] args) throws Exception {

        // Create a scanner to add word that need to be counted in the text file
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the Word that you want to count");
        String wordToCount = sc.nextLine();


        //find a path to imported file:
        final String sp = File.separator;
        final Path srcPath = Paths.get
                (System.getProperty("user.dir"));
        String pathToInFile =
                srcPath + sp + "src" + sp + "main" + sp + "java" + sp + "com" + sp + "customertimes" + sp + "lection10" + sp + "alice.txt";
        Path inPath = Paths.get(pathToInFile);

        //import text line by line in to the String List:
        List<String> lines = Files.readAllLines(inPath);

        //add List that will contain word by word from the text
        ArrayList<String> arrList = new ArrayList<>();

        //add Map to count words
        Map<String, Integer> counts = new HashMap<>();

        //Get all words to the list
        for (String linesWithWords : lines) {
            Collections.addAll(arrList, linesWithWords.split("\\W+"));
        }

        //count words with map
        for (String separateWords : arrList) {
            counts.put(separateWords, counts.getOrDefault(separateWords, 0) + 1);
        }

        //sout results :)
        System.out.println(counts.get(wordToCount) + " matches of " + "'"+wordToCount+"'");

    }
}

