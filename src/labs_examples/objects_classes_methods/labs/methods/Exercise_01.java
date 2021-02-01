package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {
        int[] arr = {52, 32, 4, 6, 7};
        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println(multiply(2,5));
        System.out.println(divide(80,4));
        joke();
        System.out.println(yearsToSeconds(5));
        System.out.println(numArgs(arr));
    }

    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a*b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a/b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke() {
        System.out.println("Knock knock");
        System.out.println("Who's there?");
        System.out.println("Jack Goff");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearsToSeconds(int years) {
        int seconds = (years*365 + (years/4)) * 24 * 60 * 60;
        return seconds;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int numArgs(int... args) {
        int counter = 0;
        for (int x : args) {
            counter++;
        }
        return counter;
    }





}
