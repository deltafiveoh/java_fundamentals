package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        String filePath = "C:\\Coding\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files/char_data.txt";
        File file = new File(filePath);
        System.out.println("file path is " + file.getAbsolutePath());
        try (BufferedInputStream bi = new BufferedInputStream(new FileInputStream(filePath))) {

            // this will hold the collection of bytes that we read at once
            byte[] buffer = new byte[5];
            int bytesRead = 0;

            // this while loop will read the file 5 bytes at a time
            while ((bytesRead = bi.read(buffer)) != -1){
                // print out bytes read to console
                System.out.print(new String(buffer, 0, bytesRead));
                System.out.println(": 5 bytes read and printed");
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}