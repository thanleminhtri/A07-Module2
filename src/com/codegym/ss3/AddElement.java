package com.codegym.ss3;
import java.util.Scanner;
public class AddElement {
    public static void main(String[] args) {
        int n,x;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử mảng");
            n = input.nextInt();
        }while (n<=0);
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Phần tử thứ "+(i+1));
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng vừa nhập");
        for (int j=0; j<arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
        System.out.println("Nhập số cần chèn");
        x = input.nextInt();
        System.out.println("Nhập vào vị trí");
        int y = input.nextInt();
        for (int k=arr.length-1; k>y;k--){
            arr[k] = arr[k-1];
        }
        arr[y] = x;
        System.out.println("Mảng sau khi chen");
        for (int j=0; j<arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
    }
}