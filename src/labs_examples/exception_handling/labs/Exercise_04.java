package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class Ex4{
    public static void main(String[] args) {
        int[] exampleArr = {2, 3, 4, 5, 0};
        try {
            System.out.println(exampleArr[2]/exampleArr[0]);
            System.out.println(exampleArr[5]);
        } catch (Throwable exc) {
            try {
                System.out.println("Unexpected error");
                System.out.println(exampleArr[4]/exampleArr[3]);
                System.out.println(exampleArr[4]/exampleArr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Could not complete event");
            }
        }
    }
}
