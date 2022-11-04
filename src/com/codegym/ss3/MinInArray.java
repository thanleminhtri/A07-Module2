package com.codegym.ss3;
import java.util.Scanner;
public class MinInArray {
    public static void main(String[] args) {
        int n, x;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử mảng");
            n = input.nextInt();
        } while (n <= 0);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + (i + 1));
            arr[i] = input.nextInt();
        }

    }
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
//            if (array[i] > array[index]) max
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }


}
