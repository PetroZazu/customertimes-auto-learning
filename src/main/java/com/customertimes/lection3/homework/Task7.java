package com.customertimes.lection3.homework;

/*
Given a user's email address: john_smith@example.com.
Create two strings "login" and "domain" which will be substrings of full email address.
The First Name and Last Name of the user should be in the following format: "Name Surname".
 */
public class Task7 {
    public static void mailCut(String str) {
        //john_smith@example.com
        int d = str.indexOf("@"); //identify index of '@' element
        int t = str.indexOf("_"); //identify index of '_' element

        String domain = str.substring(d + 1); //assign all string content after '@' to the 'domain' variable'

        String firstName = str.substring(0, t); //assign string part till the '_' symbol to the 'firstName' variable
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);//firstName first char convert to the uppercase
        String lastName = str.substring(t + 1, d);//assign string part after the '_' symbol to the 'lastName' variable
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);//lastName first char convert to the uppercase
        String login = firstName + " " + lastName;//concatenate 'firstName' + 'lastName' and assign to the 'login variable;

        System.out.println("domain is: " + domain);
        System.out.println("Login is: " + login);

    }

    public static void main(String[] args) {
        mailCut("john_smith@example.com");
    }
}
