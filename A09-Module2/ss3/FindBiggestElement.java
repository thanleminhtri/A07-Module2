package com.codegym.ss3;

public class FindBiggestElement {
    public static class FindBiggestNumber extends Array2dTemplate {
        public int find_max(){
            int max = arr[0][0];
            for (int[] ints : arr) {
                for (int j = 0; j < ints.length; j++) {
                    if (ints[j] > max) {
                        max = ints[j];
                    }
                }
            }
            return max;
        }
        public static void main(String[] args) {
            FindBiggestNumber a = new FindBiggestNumber();
            a.input();
            a.creat_2dArray();
            a.display();
            int max = a.find_max();
            System.out.println("Max la: " + max);
        }
    }
}
