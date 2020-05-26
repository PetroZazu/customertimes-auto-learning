package com.customertimes.lection3.homework;
/*
Given a string "Den, John, Will, Kate, Adam, Robin". Print all the names from the following string each from a new line.
   Example:
   Den
   John
   Will
   Kate
   ...

   спосіб імплементації:

1. перебрати кожен символ починаючи з першого
2. якщо символ кома, то робимо просто прінт лайн та до 'і' добавляємо + 1
3. else, виводити кожен символ в рядок

 */
public class Task8v2 {
    public static void main(String[] args) {
        String str = "Den, John, Will, Kate, Adam, RobinHood:)";
        char a;
        String b;
        for (int i = 0; i < str.length(); i++) {
            a = str.charAt(i);
            b = Character.toString(a);
            if (b.equals(",")) {
                System.out.println();
                i++;
            } else {
                System.out.print(b);
            }
        }
    }

}
