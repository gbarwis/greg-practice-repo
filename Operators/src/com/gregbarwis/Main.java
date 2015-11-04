package com.gregbarwis;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);


        boolean isAlien = false;

        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore <= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;

        // 1. Create a double variable with the value 20
        // 2. Create a second double variable with the value 80
        // 3. Add both numbers up and multiplpy by 25
        // 4. Calculate the remainder of the total and 2,300
        // 5. Write an "if" statement that displays a message
        //    "Total was over the limit" if the remaining total is
        //    equal to 200 or less

        double firstVariable = 20d;
        double secondVariable = 80d;
        double newResult = (firstVariable + secondVariable) * 25;
        newResult %= 2300;
        if (newResult <= 200)
            System.out.println("Total was over the limit");

    }
}
