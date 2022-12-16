package com.codegym.ss3;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.print("Elements in array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value you want to delete: ");
        int input = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) index = i;
        }

        if (index == -1) {
            System.out.print("Value not found in array!");
        } else {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            System.out.print("New array: ");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
