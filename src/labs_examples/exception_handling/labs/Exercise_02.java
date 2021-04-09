package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
class Ex2{
    public static void main(String[] args) {
        int[] exampleArr = {2, 3, 4, 5, 0};
        try {
            System.out.println(exampleArr[2]/exampleArr[0]);
            System.out.println(exampleArr[5]);
            // third example does not print since first item caused exception.
            System.out.println(exampleArr[2]/exampleArr[4]);
            // first catch statement passed over as 2nd output does not throw this exception
        } catch (ArithmeticException exc) {
            System.out.println("Could not complete event");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect index selection");
        }
    }
}

