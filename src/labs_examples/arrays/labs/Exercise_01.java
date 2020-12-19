package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers");

        for (int x = 0; x < 10 ; x++){
            System.out.print("Enter number " + (x + 1) + ": ");
            numbers[x] = scanner.nextInt();
        }

        System.out.print("The average of the user entered numbers: ");

        for (int y = 0; y <= 9; y++){
            if (y == 9){
                System.out.print(numbers[y] + " = ");
            } else {
                System.out.print(numbers[y] + " + ");
            }
        }
        int ave = 0;
        for (int c = 0; c < 10; c++){
            ave += numbers[c];
        }
        System.out.println(ave/numbers.length);
    }
}