package com.learn;

/**
 * @author anthonylee
 */
public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        return new int[] { humanYears, catYears(humanYears), dogYears(humanYears) };
    }

    private static int catYears(int humanYears) {
        if (humanYears == 1) {
            return 15;
        } else if (humanYears == 2) {
            return 24;
        } else {
            return 24 + (humanYears - 2) * 4;
        }
    }

    private static int dogYears(int humanYears) {
        if (humanYears == 1) {
            return 15;
        } else if (humanYears == 2) {
            return 24;
        } else {
            return 24 + (humanYears - 2) * 5;
        }
    }
}
