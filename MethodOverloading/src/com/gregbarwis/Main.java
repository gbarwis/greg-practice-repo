package com.gregbarwis;

public class Main {

    public static void main(String[] args) {
        calculateScore("Tim", 500);
        calculateScore(750);
        calculateScore();

        calcFeetAndInchesToCentimeters(6d, 2d);
        calcFeetAndInchesToCentimeters(74);
    }

    public static int calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches >= 12) {
            System.out.println("Invalid parameters supplied.");
            return -1;
        }
        double centimeters = (feet * 12 * 2.54 + inches * 2.54);
        System.out.println(feet + "'" + inches + "\" = " + centimeters + "cm");
        return 0;
    }

    public static int calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid parameters supplied.");
            return -1;
        }
        double centimeters = inches * 2.54;
        int finalFeet = (int)inches / 12;
        int finalInches = (int)inches % 12;

        System.out.println((int)inches + "\"= " + finalFeet + "'" + finalInches + "\" = " + centimeters + "cm." );
        return 0;
        }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + ", score was " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown Player, score was " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no score.");
        return -1;
    }

    // Create a method called calcFeetAndInchesToCentimeters
    // Needs two parameters: 'Feet' and 'Inches'.
    //
    // Validate that 'feet' is a number >= 0
    // Validate that 'inches is a number >=0, and <= 12
    // return -1 from the method if either of the above is not true
    //
    // Create a second method of the same name but with only one parameter
    // inches is the parameter
    // validate that it's >= 0
    // return -1 if it's not true
    //
    // hints: Use double for number datatypes
    // 1 inch = 2.54 cm and one foot = 12 inches

}
