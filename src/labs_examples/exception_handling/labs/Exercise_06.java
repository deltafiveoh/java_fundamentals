package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Ex5 {
    public static void main(String[] args) {
        Ex5 example = new Ex5();
        example.methodOne();
    }

    void methodOne(){
        System.out.println("inside method 1,calling method 2 in try block");
        try {
            methodTwo();
        } catch (ArithmeticException e) {
            System.out.println("inside method 1 catch statement after method 2 throws exception");
            System.out.println("error: division " + e.getMessage());
        }
    }

    void methodTwo() throws ArithmeticException{
        System.out.println("inside method 2");
        System.out.println(2/0);
    }
}