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

p.s кстаті, в класі 'Task8v2' я зробив все набагато меньшою кількістю коду :) але і це не хотів видаляти бо потратив кучу часу)))

1. перебрати кожен символ починаючи з першого
2. якщо символ кома, то виводимо всі значення від попередньої коми.
   якщо перше Ім'я то відповідно виводимо починаючи від початку стрінга
3. змінна 'l' відповідатиме за початок наступного імені в нашому основному стрінгу
4. при наступному находженні коми, виводимо найдене Ім'я від нашої змінної 'l' і до початку найденої коми.
5. якщо цикл на останній ітерації, значить пора вивести останнє Ім'я, але оскільки 'i' це в нас передостанній симлвол то ми виведемо з 'l до i + 1'
  */
public class Task8 {
    public static void main(String[] args) {
        String str = "Den, John, Will, Kate, Adam, Robin";
        char a;
        String b;
        int l = 0;

        for (int i = 0; i < str.length(); i++) {
            a = str.charAt(i);
            b = Character.toString(a);
            if (b.equals(",")){
                b = str.substring(l, i);
                l = i + 2;
                System.out.println(b);
            }
            if (i == str.length() - 1) {
                b = str.substring(l, i + 1);
                System.out.println(b);
            }

        }

    }
}
