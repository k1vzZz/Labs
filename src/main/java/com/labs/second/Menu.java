package com.labs.second;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    public void showMenu() {
        Random random = new Random(System.currentTimeMillis());
        Multiple multiple = new Multiple();
        while (true) {
            int numberOne = random.nextInt(9) + 1;
            int numberTwo = random.nextInt(9) + 1;
            System.out.println("Enter " + numberOne + " * " + numberTwo + ": ");
            try {
                Scanner scanner = new Scanner(System.in);
                int result = scanner.nextInt();
                switch (result) {
                    case 0:
                        System.out.println(multiple.toString());
                        System.out.println("Rating = " + multiple.rating());
                        return;
                    default:
                        multiple.validation(numberOne, numberTwo, result);
                }
            } catch (Exception e) {
                System.out.println("Argument not validate");
            }
        }
    }
}
