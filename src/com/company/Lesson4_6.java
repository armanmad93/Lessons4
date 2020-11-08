package com.company;

import java.util.Random;

public class Lesson4_6 {

    public static void main(String[] args) {

        //find the minimum value of an array.

        int[] arr = new int[10];

        Random random = new Random();

        System.out.print("array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + ", ");
        }

        //first array number
        int firstArr = arr[0];

        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            if (firstArr > arr[i]) {
                firstArr = arr[i];
            }
        }
        System.out.println("minimum value of array numbers is: " + firstArr);
    }
}
