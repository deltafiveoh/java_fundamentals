package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {
    public static void main(String[] args) {
        int x = methodOverloading();
        int y = methodOverloading(2);

        System.out.println(x + " " + y);
        System.out.println(largestNumber(1, 3, 2, 1));
        System.out.println(numOfConsonants("abcdedde"));
        System.out.println(printArt());
        System.out.println("Is the number a prime?: " + isPrime(11));

        int[] numArrEx = {2, 1, 2, 3, 9, 5, 7};
        int[] numAnswer = endNums(numArrEx);
        for (int i = 0; i < numAnswer.length; i++){
            System.out.println(numAnswer[i]);
        }

        System.out.println("The number of divisible numbers is " + divisibleNums(20, 2, 4).size());

        int[] toBeReversed = {1,2,3,4,5,6,7,8};
        int[] newRevArr = reverseArray(toBeReversed);
        for (int i = 0; i < newRevArr.length; i++){
            System.out.print(newRevArr[i] + " ");
        }
    }

    public static int methodOverloading(){
        return 0;
    }

    public static int methodOverloading(int num){
        return num*num;
    }

    public static int largestNumber(int num1, int num2, int num3, int num4){

        if (num1 > num2 && num1 > num3 && num1 > num4){
            return num1;
        } else if (num2 > num3 && num2 > num4){
            return num2;
        } else if (num3 > num4){
            return num3;
        } else {
            return num4;
        }
    }

    public static int numOfConsonants(String str) {
        int result = str.length();
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';

        char[] strArr = str.toCharArray();
        for (char letter : strArr){
            if (Character.compare(letter, a) == 0 || Character.compare(letter, e) == 0 || Character.compare(letter, i) == 0 || Character.compare(letter, o) == 0 || Character.compare(letter, u) == 0){
                result--;
            }
        }

        return result;
    }

    public static String printArt(){
        String art = "    o /    \n" +
                     "   /|/     \n" +
                     "  / |      \n" +
                     "    |      \n" +
                     "   / |     \n" +
                     "  /  |     \n" +
                     " /   |     ";

        return art;
    }

    public static boolean isPrime(int num){
        boolean isPrime = true;
        int numCheck = num;
        for (int i = 2; i <= num/2; i++){
            numCheck = num % i;
            if (numCheck == 0){
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }

        return isPrime;
    }

    public static int[] endNums(int[] numArr){
        int[] endArr = new int[2];
        endArr[0] = numArr[0];
        endArr[1] = numArr[numArr.length - 1];

        for (int i = 0; i < numArr.length; i++){
            if (endArr[0] > numArr[i]){
                endArr[0] = numArr[i];
            }
            if (endArr[1] < numArr[i]){
                endArr[1] = numArr[i];
            }
        }

        return endArr;
    }

    public static ArrayList<Integer> divisibleNums(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i = 1; i <= maxNum; i++){
            if (i % divisor1 == 0 && i % divisor2 == 0){
                answer.add(i);
            }
        }

        return answer;
    }

    public static int[] reverseArray(int[] numArr){
        int temp;
        for (int i = 0; i < (numArr.length) / 2; i++){
            temp = numArr[i];
            numArr[i] = numArr[numArr.length - 1 - i];
            numArr[numArr.length - 1 - i] = temp;
        }

        return numArr;
    }

}


