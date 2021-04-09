package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
class Ex6 {
    public static void main(String[] args) {
        try {
            methodOne();
        } catch (ArithmeticException newE){
            System.out.println("You couldn't use that method. It threw an exception");
        }
    }

    public static int methodOne(){
        try {
            return 5/0;
        } catch (ArithmeticException e) {
            throw e;
        }
    }
}