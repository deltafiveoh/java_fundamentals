package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int x = 0; x < array.length; x++){
            array[x] = x;
        }
        for (int y : array){
            System.out.println(y);
        }
        System.out.println("Every other from top to bottom");
        for (int x = array.length - 1; x > 0; x -= 2){
            System.out.println(array[x]);
        }
    }
}
