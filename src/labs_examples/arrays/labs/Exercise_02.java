package labs_examples.arrays.labs;
import java.util.Scanner;
/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);
        int entry = 1;

        do {
            if (entry < 1 | entry > 10){
                System.out.println("Input not valid");
            }
            System.out.print("Enter a number between 1 and 10: ");
            entry = scanner.nextInt();
        } while (entry < 1 | entry > 10);


            System.out.println("The number at the selected position " + entry + " is: " + array[entry - 1]);

    }
}