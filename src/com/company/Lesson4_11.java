package com.company;

import java.util.Random;

public class Lesson4_11 {

    public static void main(String[] args) {

        //Create an array with length 10
        //Initialize with random ints (10 - 99)
        //print it
        //sort it in asc order
        //print the sorted

        int[] arr = new int[10];

        Random random = new Random();

        int box;

        System.out.print("array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(89) + 10;
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    box = arr[i];
                    arr[i] = arr[j];
                    arr[j] = box;
                }
            }
        }

        System.out.print("sort array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }


    }
}
