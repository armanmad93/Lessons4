package com.company;

import java.util.Random;

public class Lesson4_8 {

    public static void main(String[] args) {

        //find the common elements between two arrays (String values)

        String[] firstStringArrqay = new String[10];
        String[] secondStringArray = new String[10];

        Random random = new Random();

        System.out.print("first array: ");
        for (int i = 0; i < firstStringArrqay.length; i++) {
            firstStringArrqay[i] = String.valueOf(random.nextInt(30));
            System.out.print(firstStringArrqay[i] + ", ");
        }

        System.out.println();

        System.out.print("second array: ");
        for (int i = 0; i < secondStringArray.length; i++) {
            secondStringArray[i] = String.valueOf(random.nextInt(30));
            System.out.print(secondStringArray[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < firstStringArrqay.length; i++) {
            for (int j = 0; j < secondStringArray.length; j++) {
                if (firstStringArrqay[i].equals(secondStringArray[j])) {
                    System.out.println("common element between two arrays: " + firstStringArrqay[i]);
                }
            }
        }
    }
}
