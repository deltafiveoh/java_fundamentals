package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();

        int x = 0;
        char vowel = word.charAt(x);
        int index = 0;
        String allVowels = "aeiou";
        char indexVowel = allVowels.charAt(index);

            while (vowel != indexVowel){
                vowel = word.charAt(x);
                while (index < allVowels.length()-1 & vowel != indexVowel) {
                    index++;
                    indexVowel = allVowels.charAt(index);
                }
                x++;
                index = 0;
            }
        System.out.println("The word is " + word + " and the first vowel is " + vowel);
        }
    }
