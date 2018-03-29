package com.labs.second;

public class Multiple {
    public static final int RATING_FIVE = 80;
    public static final int RATING_FOUR = 60;
    public static final int RATING_THREE = 40;

    private int countTrue = 0;
    private int countFalse = 0;

    public void validation(int numberOne, int numberTwo, int result) {
        if (numberOne * numberTwo == result)
            countTrue++;
        else countFalse++;
    }

    public int rating() {
        double ratio = (double) countTrue / (countFalse + countTrue);
        int rating = (int) (ratio * 100);
        System.out.println(rating);
        if (rating >= RATING_FIVE) {
            return 5;
        } else {
            if (rating >= RATING_FOUR && rating < RATING_FIVE) {
                return 4;
            } else {
                if (rating >= RATING_THREE && rating < RATING_FOUR) {
                    return 3;
                } else {
                    return 2;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Multiple{" +
                "countTrue=" + countTrue +
                ", countFalse=" + countFalse +
                '}';
    }
}
