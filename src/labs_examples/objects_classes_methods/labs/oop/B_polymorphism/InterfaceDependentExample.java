package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class InterfaceDependentExample {

    addMethods add;

    InterfaceDependentExample(addMethods add){
        this.add = add;
    }

    void test(){
        add.addOne();
    }
}
