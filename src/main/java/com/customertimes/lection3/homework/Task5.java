package com.customertimes.lection3.homework;
/*
Given a string "ABCDEFGHIJK".
You need to make this string lowercased and remove all vowels.

steps:)

1) робимо ловеркейс
2) перепровіряємо кожну букву стрінга завдяки циклу
3) стрінговій змінній 'а' присвоюємо поточну букву (букви варіюються від ітерації до ітерації масиву)
4) якщо 'a' є голосна буква тоді до результативного стрінга добавляється пустота - "";
    якщо a не є голосно то добавляємо до результатисвного стрінга поточну букву "a";
 */


public class Task5 {
    public static void main(String[] args) {
        String str = "ABCDEFGIJK";
        String resStr = "";
        str = str.toLowerCase();
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);
            String a = Character.toString(b);

            if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {
                resStr = resStr + "";

            } else {
                resStr = resStr + a;
            }
        }
        System.out.println(resStr);
    }

}
