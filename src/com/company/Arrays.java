package com.company;

public class Arrays {

    public static void main(String[] args) {
        int[] myArray = {5, 3, 7, 6, 2, 8};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
            System.out.println();
        }
        for (int innerVar : myArray)
            System.out.println(innerVar);
        {
            System.out.println();
        }
        int b = 0;
        while (b < myArray.length) {
            System.out.println(myArray[b]);
            b++;
        }
        System.out.println();
        int c = 0;
        do {
            System.out.println(myArray[c]);
            c++;
        } while (c < myArray.length);
    }
}


