package com.company;

import java.util.Random;

public class Lesson4_7 {

    public static void main(String[] args) {

        //find the duplicate values of an array of integer values.

        int[] arr = new int[10];

        Random random = new Random();

        System.out.print("array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if
                (arr[i] == arr[j]) {
                    System.out.println("dublicate values is: " + arr[j]);
                }
            }

        }
    }
}
