package com.codegym.ss10;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0, 4);
        arrayList.add(1, 4);
        arrayList.add(2, 4);
        arrayList.add(3, 4);
        arrayList.add(4, 4);
        arrayList.add(5, 4);
        arrayList.add(6, 5);
//        arrayList.size();
//        arrayList.remove(2);
        arrayList.clone();
//        arrayList.contains(4);
//        arrayList.indexOf(4);
//        arrayList.add(2,2);
//        arrayList.ensureCapacity(3);
//        arrayList.get(2);
//        arrayList.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("array" +arrayList.get(i));
        }
//        System.out.println("size" +arrayList.size());
//        arrayList.remove(2);
        ArrayList<Integer> arrayList1 =new ArrayList<>();
        arrayList1.clone();
        arrayList1.add(0,5);
        for (int j = 0; j < arrayList1.size(); j++) {
            System.out.println("clone la " +arrayList1.clone().get(j));

        }
    }
}