package com.company;

import java.util.Random;

public class Lesson4_1 {

    public static void main(String[] args) {

        //sum values of an array.

        int sum = 0;
        int[] arr = new int[10];

        Random random = new Random();

        System.out.print("array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            sum += arr[i];
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
        System.out.println("sum values of array: " + sum);

    }
}
