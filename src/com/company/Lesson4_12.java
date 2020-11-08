package com.company;

import java.util.Random;

public class Lesson4_12 {

    public static void main(String[] args) {

        //Check if string is Palindrome;

        String[] str = new String[5];

        Random random = new Random();

        System.out.print("String array: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(random.nextInt(5));
            System.out.print(str[i] + ", ");
        }

        System.out.println();

        int stringLength = str.length;
        boolean answer = true;

        for (int i = 0; i < stringLength; i++) {
            if (str[i].equals(str[stringLength - 1])) {
                stringLength--;
                continue;
            }
            System.out.println("not Palindrome");
            answer = false;
            break;
        }
        if (answer) {
            System.out.println("Palindrome");
        }
    }

}
