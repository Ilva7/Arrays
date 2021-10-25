package com.company;

public class Arrays {

    public static void main(String[] args) {
        int[] myArray = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        negative(myArray);
        odd(myArray);
        sameValue(myArray);
        eachSecond(myArray);
        averageValue(myArray);
    }

    public static void negative(int[] myArray) {
        int i = 0;
        System.out.println("Negative elements are: ");
        for (; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                System.out.println(myArray[i]);
            }
        }
    }

    public static void odd(int[] myArray) {
        System.out.println("Odd elements are: ");
        int odd = 0;
        for (int i = 0; i < 10; i++)
            if (myArray[i] % 2 != 0) {
                System.out.println(myArray[i]);
                odd++;
            }
        System.out.println("Number of odd elements: " + odd);
    }

    public static void sameValue(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == (myArray[j])) {
                    System.out.println("Elements with the same value are: " + myArray[i]);
                }
            }
        }
    }

    public static void eachSecond(int[] myArray) {
        System.out.println("Each second element are: ");
        for (int i = 1; i < myArray.length; i = i + 2) {
            System.out.println(myArray[i]);
        }
    }

    public static void averageValue(int[] myArray) {
        float total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total = total + myArray[i];
        }
        float average = total / myArray.length;
        {
            System.out.format("The average value of the array: %.2f", average);
        }
        System.out.println();
        System.out.println("Number of elements smaller than average value are: ");
        int numberOfAver = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < average) {
                numberOfAver++;
            }
        }
            System.out.println(numberOfAver);
        }
    }



