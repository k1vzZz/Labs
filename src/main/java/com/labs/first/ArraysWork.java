package com.labs.first;

public class ArraysWork {

    public static void sortCustom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            int max = array[i];
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                //even elements (since the indices begin with 0)
                if (i % 2 == 1) {
                    if (array[j] < min) {
                        min = array[j];
                        minIndex = j;
                    }
                } else {
                    if (array[j] > max) {
                        max = array[j];
                        maxIndex = j;
                    }
                }
            }
            if (i != minIndex) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
            if (i != maxIndex) {
                int tmp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = tmp;
            }
        }
    }

    public static int getCountHappyNumbers(int[] array, int numberHappy) {
        int count = 0;
        for (int number : array) {
            if (number == numberHappy) count++;
        }
        return count;
    }

    public static int sumFirstMaxAndLastMax(int[] array) {
        if (array.length == 0) throw new IllegalArgumentException();
        int maxFirst = array[0];
        int maxLast = array[0];
        int maxLastIndex = 0;
        //search last max
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= maxLast) {
                maxLast = array[i];
                maxLastIndex = i;
            }
        }
        //search first max
        for (int i = array.length - 1; i >= 1; i--) {
            if (array[i] >= maxFirst && i != maxLastIndex) {
                maxFirst = array[i];
            }
        }
        return maxFirst + maxLast;
    }
}
