package com.customertimes.lection10.task1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class HashSetUniqueWordsContainer {
    public static void main(String[] args) throws Exception {

            //find a path to imported file:
            final String sp = File.separator;
            final Path srcPath = Paths.get
                    (System.getProperty("user.dir"));
            String pathToInFile =
                    srcPath + sp + "src" + sp + "main" + sp + "java" + sp + "com" + sp + "customertimes" + sp + "lection10" + sp + "alice.txt";
            Path inPath = Paths.get(pathToInFile);

            //import text line by line in to the String List:
            List<String> lines = Files.readAllLines(inPath);
            ArrayList<String> arrList = new ArrayList<>();

        //Get all words and print the amount to console
        for (String temp : lines) {
            arrList.addAll(Arrays.asList(temp.split("\\W+")));
            //or
            //Collections.addAll(arrList, temp.split("\\W+"));
        }
        System.out.println(arrList.size() + " - real size of the Array List");



        //Get all unique words and print the amount to console
        HashSet<String> uniqueWords = new HashSet<>();
        for (String temp : lines) {
            uniqueWords.addAll(Arrays.asList(temp.split("\\W+")));
            //or
            //Collections.addAll(uniqueWords, temp.split("\\W+"));
        }
        System.out.println(uniqueWords.size() + " - real size of the Hash Set");
    }
}
