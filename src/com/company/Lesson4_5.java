package com.company;

import java.util.Random;

public class Lesson4_5 {

    public static void main(String[] args) {

        //copy an array by iterating the array.

        int[] firstArr = new int[10];
        int[] secondArr = new int[firstArr.length];
        Random random = new Random();

        System.out.print("first array is: ");
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = random.nextInt(100);
            System.out.print(firstArr[i] + ", ");
        }

        System.out.println();

        System.out.print("second array is: ");
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = firstArr[i];
            System.out.print(secondArr[i] + ", ");
        }
    }
}
