package labs_examples.static_nonstatic.labs;

public class Static1 {

    Static1(){

    }

    public void nonstaticMethod(){
        System.out.println("static 1 class, non-static method");
        staticMethod(); //static method called inside non-static
        internalNonstaticMethod(); //non-static method called inside non-static
    }

    public void internalNonstaticMethod(){
        System.out.println("static 1 class, non-static method 2");
        staticMethod(); //static called inside non-statc
    }

    public static void staticMethod(){
        System.out.println("static 1 class, static method");
    }

    static void internalStaticMethod(){
        Static1 ex = new Static1(); // object creation require to call non-static methods
        staticMethod(); // static method called inside static method
        System.out.println("Method called from another static method inside internalStaticMethod");
        ex.nonstaticMethod(); //non-static method called inside static
        System.out.println("requires object creation since it is a static method calling a non-static method");
    }

    public static void main(String[] args) {
        internalStaticMethod();
        System.out.println("previous lines all called from internalStaticMethod without object creation");
        Static1 example = new Static1();
        System.out.println("");
        example.nonstaticMethod();
        System.out.println("method called requiring object creation, but does not require an object inside the nonStaticMethod to call staticMethod or internalNonstaticMethod");
    }

}
