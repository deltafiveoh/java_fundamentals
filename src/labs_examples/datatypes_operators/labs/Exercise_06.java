package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        float radius = 3.14f;
        float height = 5.0f;
        float diameter = radius*2.0f;

        float volume = 0.0f;
        float surArea = 0.0f;

        volume = (float) (Math.PI*(radius*radius)*height);

        System.out.println("Volume is " + volume);

        surArea = (float) ((2.0*Math.PI*radius*height) + (2.0*Math.PI*(radius*radius)));

        System.out.println("Surface Area is " + surArea);

    }
}