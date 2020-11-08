package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson4_3 {

    public static void main(String[] args) {

        //find the index of an array element. if the nomber is not present print wrong number, please try again

        int userIndex;
        boolean answer = true;
        int[] arr = new int[10];

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.print("array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        System.out.print("plz input number: ");
        while (answer) {
            userIndex = scanner.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (userIndex == arr[i]) {
                    System.out.println("Index of this number is: " + i);
                    answer = false;
                    break;
                }
            }
            if (answer) {
                System.out.println("wrong number, please try again. ");
            }
        }

    }
}
