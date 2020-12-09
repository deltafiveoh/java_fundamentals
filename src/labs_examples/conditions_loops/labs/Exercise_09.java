package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int x = 1000;
        while (x > 0) {
            System.out.println(x);
            x -= 100;
            if (x == 800){
                break;
            }
        }
    }
}
