package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Ex1{
    public static void main(String[] args) {
        try {
            System.out.println(2/1);
            System.out.println(2/0);
        } catch (ArithmeticException exc) {
            System.out.println("Could not complete event");
        }
    }
}
