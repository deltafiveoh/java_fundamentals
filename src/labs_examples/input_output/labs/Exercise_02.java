package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise2 {
    public static void main(String[] args) {

            int i;

            String fileReadPath = "src/labs_examples/input_output/files/char_data.txt";
            String fileWritePath = "src/labs_examples/input_output/files/encrypted_data.txt";

            String decryptReadPath = "src/labs_examples/input_output/files/encrypted_data.txt";
            String decryptWritePath = "src/labs_examples/input_output/files/decrypted_data.txt";

            try (FileInputStream fin = new FileInputStream(fileReadPath);
                 FileOutputStream fout = new FileOutputStream(fileWritePath))
            {
                do {
                    i = fin.read();
                    if(i != -1)
                        if ((char) i == 'a'){
                            fout.write('-');
                        } else if ((char) i == 'e'){
                            fout.write('~');
                        } else {
                            fout.write(i);
                        }
                } while(i != -1);
                System.out.println("File encrypted");
            } catch(IOException exc) {
                System.out.println("I/O Error: " + exc);
            }

            try (FileInputStream fin = new FileInputStream(decryptReadPath);
                 FileOutputStream fout = new FileOutputStream(decryptWritePath))
            {
                do {
                    i = fin.read();
                    if(i != -1)
                        if ((char) i == '-'){
                            fout.write('a');
                        } else if ((char) i == '~'){
                            fout.write('e');
                        } else {
                            fout.write(i);
                        }
                } while(i != -1);
                System.out.println("File decrypted");
            } catch(IOException exc) {
                System.out.println("I/O Error: " + exc);
            }
    }
}