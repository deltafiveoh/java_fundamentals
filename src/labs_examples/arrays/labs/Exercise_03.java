package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int x = 0; x < array.length; x++){
            for (int y = 0; y < array[x].length; y++){
                array[x][y] = 3 + x*15 + y*3;
            }
        }

        for (int[] outer : array){
            for (int result : outer){
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
