package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> stringy = new ArrayList<String>();

        stringy.add("I");
        stringy.add("will");
        stringy.add("never");
        stringy.add("scoop");
        stringy.add("cat");
        stringy.add("poop");
        stringy.add("again");

        System.out.println(stringy.indexOf("cat"));
        System.out.println(stringy.get(4));

        stringy.set(4, "dog");

        System.out.println(stringy.get(4));
    }
}
