package labs_examples.input_output.labs;

import labs_examples.input_output.examples.csv_parser.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        ArrayList<Dog> dogList = new ArrayList<>();

        String filePath = "src/labs_examples/input_output/files/dogs.csv";
        String filePath2 = "src/labs_examples/input_output/files/dogsWritten.txt";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                dogList.add(mapValues(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Read and creation complete");

        try (FileWriter fw = new FileWriter(filePath2))
        {
            for (int x = 0; x < dogList.size(); x++){
                String line = dogList.get(x).getName() + "," + dogList.get(x).getSpecies() + "," + dogList.get(x).getWeight() + "," + dogList.get(x).getAge();
                fw.write(line + "\r\n");
            }

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
        System.out.println("Write complete");
    }

    private static Dog mapValues(String[] values) {

        Dog dog = new Dog();

        dog.setSpecies(values[0]);
        dog.setName(values[1]);
        dog.setAge(Integer.parseInt(values[2]));
        dog.setWeight(Integer.parseInt(values[3]));

        return dog;

    }

}