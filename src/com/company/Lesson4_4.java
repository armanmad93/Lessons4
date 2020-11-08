package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson4_4 {

    public static void main(String[] args) {

        //remove a specific element from an array. if the nomber is not present print wrong number, please try again

        int userElement;
        int j = 0;
        boolean answer = true;
        int[] arr = new int[10];
        int[] newArray = new int[arr.length - 1];

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.print("array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
        System.out.print("please input element: ");
        while (answer) {
            userElement = scanner.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (userElement == arr[i]) {
                    for (int k = 0; k < arr.length; k++) {
                        if (userElement == arr[k]) {
                            continue;
                        }

                        newArray[j] = arr[k];
                        System.out.print(newArray[j] + ", ");
                        j++;
                    }
                    answer = false;
                }
            }
            if (answer) {
                System.out.println("wrong number please try again. ");
            }
        }

    }
}
