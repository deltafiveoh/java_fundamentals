package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class Ex3{
    public static void main(String[] args) {
        int[] exampleArr = {2, 3, 4, 5, 0};
        try {
            System.out.println(exampleArr[2]/exampleArr[0]);
            System.out.println(exampleArr[5]);
        } catch (ArithmeticException exc) {
            System.out.println("Could not complete event");
        } finally {
            System.out.println("Problem not resolvable. This prints even though the exception wasn't caught");
        }
    }
}
