package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner (System.in);
        // 2) prompt user
        System.out.print("If the day of the week was a number with Sunday being 1 and Saturday being 7, what day of the week is it? : ");
        // 3) assign input to variable as int
        int num = scanner.nextInt();

        // 4) write completed code here
        if (num > 7 || num < 1) {
            System.out.println("Other");
        } else {
            if (num == 1) {
                System.out.println("Sunday");
            }
            if (num == 2){
                System.out.println("Monday");
            }
            if (num == 3){
                System.out.println("Tuesday");
            }
            if (num == 4){
                System.out.println("Wednesday");
            }
            if (num == 5){
                System.out.println("Thursday");
            }
            if (num == 6){
                System.out.println("Friday");
            }
            if (num == 7){
                System.out.println("Saturday");
            }
        }
    }
}
