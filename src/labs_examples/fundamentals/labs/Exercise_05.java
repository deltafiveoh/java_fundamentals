package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int x = str.length();
        System.out.println("hello! length = " + x);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean Strequals = str.equals(str2);
        System.out.println("str is equal to str2?: " + Strequals);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        System.out.println("str3 is: " + str3);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String substr = str.substring(0,4);
        String replaces = str.replaceAll(str, "hi");
        String newstring = str.concat(str2);

        System.out.println(substr + ", " + replaces + ", " + str + ", " + str.codePointAt(3));

        System.out.println(newstring + ", " + str.contains("e"));

        String example = "whatever you want";
        String example2 = example.replaceAll("\\s","");

        System.out.println(example2);

    }


}