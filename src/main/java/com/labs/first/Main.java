package com.labs.first;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arraySort1 = new int[]{1, 2, -3, 4};
        int[] arraySort2 = new int[]{9, -13, 3};

        ArraysWork.sortCustom(arraySort1);
        ArraysWork.sortCustom(arraySort2);
        System.out.println(Arrays.toString(arraySort1));
        System.out.println(Arrays.toString(arraySort2));

        int[] arrayHappy = new int[]{1, 2, 3, 7, -1, 2, 7, 3, 3};
        System.out.println("Count happy number(3) = "
                + ArraysWork.getCountHappyNumbers(arrayHappy, 3));

        int[] arrayMaxes = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(ArraysWork.sumFirstMaxAndLastMax(arrayMaxes));
    }
}
