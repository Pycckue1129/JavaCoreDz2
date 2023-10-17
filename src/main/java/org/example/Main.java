package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};
        int[] arr4 = {1, 3, 5, 2, 0};
        int[] arr5 = {0, 3, 0, 0, 1};

        System.out.println("Кол-во четный элементов в массиве arr1 = " + Function.evenCheck(arr1));
        System.out.println("Кол-во четный элементов в массиве arr2 = " + Function.evenCheck(arr2));
        System.out.println("Кол-во четный элементов в массиве arr3 = " + Function.evenCheck(arr3));

        System.out.println("Разница между max и min = " + Function.difArr(arr1));

        System.out.println(Function.zeroZero(arr4));
        System.out.println(Function.zeroZero(arr5));
    }
}