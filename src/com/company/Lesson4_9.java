package com.company;

import java.util.Random;

public class Lesson4_9 {

    public static void main(String[] args) {

        //remove duplicate elements from an array.

        int[] arr = new int[10];

        Random random = new Random();

        System.out.print("array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        int arrayLength = arr.length;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[arrayLength - 1];
                    arrayLength--;
                    j--;
                }
            }
        }

        int[] newArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = arr[i];
            System.out.print(newArray[i] + ", ");
        }

    }
}

