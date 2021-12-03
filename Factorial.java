/*
* The "factorial" program
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2021-11-30
*/

import java.util.Scanner;

/**
* This is factorial program.
*/
final class Factorial {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    *
    */
    private Factorial() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting calculate  number function.
    *
    * @param number  is a number
    *
    * @return factorial of number
    */
    public static int factorial(final int number) {
        final int finalvalue;
        if (number == 0) {
            finalvalue = 1;
        } else if (number > 0) {
            finalvalue = number * factorial(number - 1);
        } else {
            finalvalue = number * factorial(number + 1);
        }
        return finalvalue;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer:");
        final String input = scanner.nextLine();

        try {
            final int inputInt = Integer.valueOf(input);
            final int result = factorial(inputInt);
            System.out.println(
                  "The factorial of " + input + " is " + result + ".");
        } catch (java.lang.NumberFormatException error) {
            System.out.println("Only integer numbers are allowed .");
        }

        System.out.println("\nDone.");
    }
}
