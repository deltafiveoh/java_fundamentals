package labs_examples.static_nonstatic.labs;

public class Static2 {

    Static2(){

    }

    public void nonstaticMethod(){
        Static1 ex = new Static1();
        System.out.println("static 2 class, non-static method");
        Static1.staticMethod(); // method called from another class' static method inside a non-stat method (requires reference to the class but not an object creation, like when calling Math.methods).
        ex.nonstaticMethod(); // non-static method requires object creation to be called from another class
    }

    public static void staticMethod(){
        Static1 ex = new Static1();
        System.out.println("static 2 class, static method");
        Static1.staticMethod(); // method called from another class' static method (requires reference to the class but not an object creation)
        ex.nonstaticMethod(); // non-static method requires object creation to be called from another class
    }

    public static void main(String[] args) {
        Static2.staticMethod();
        System.out.println("");
        Static2 example = new Static2();
        example.nonstaticMethod();
    }

}
