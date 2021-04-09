package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class Ex7 {
    public static void main(String[] args) {
        int[] exampleArr = {5,2,3,4,5,0,0,1,7};

        try {
            for (int x = 0; x < 12; x++){
                if (x > exampleArr.length - 1){
                    throw new CustomExc(x);
                } else {
                    System.out.println("The number at index " + x + " is " + exampleArr[x]);
                }
            }
        } catch (CustomExc e) {
            System.out.println(e.toString());
        }
    }
}

class CustomExc extends Exception {
    int num;

    CustomExc(int index){
        this.num = index;
    }

    @Override
    public String toString(){
        return "The index of " + num + " is outside of the array's size. You can't do that! Process terminated!";
    }
}