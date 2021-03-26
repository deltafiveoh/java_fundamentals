package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer:
 * It prints in this specific order based on the inheritance structure of the object c.
 * Since the print event is not a method but is part of the classes constructor, it is automatically invoked upon creation of the object.
 * A is the first parent, takes precedence, and so is invoked first , then B is invoked, and finally C is invoked as the lowest
 * inheritor.
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
    }
}
