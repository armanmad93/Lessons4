package com.company;

import java.util.Random;

public class Lesson4_10 {

    public static void main(String[] args) {

        //find the second largest element in an array.

        int[] arr = new int[10];

        Random random = new Random();

        int box;

        System.out.print("array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
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

        System.out.print("new array: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
        System.out.println("second maxsimum element is: " + arr[arr.length - 2]);

    }
}

