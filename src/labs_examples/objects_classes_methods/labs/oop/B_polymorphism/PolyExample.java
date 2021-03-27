package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

interface addMethods{
    void addOne();
}

class BasicAdd implements addMethods{
    int a;
    int b;

    BasicAdd() {
        this.a = 0;
        this.b = 0;
    }

    BasicAdd(int a, int b){
        this.a = a;
        this.b = b;
    }

    int add(int a, int b){
        return a+b;
    }

    int add(int a){
        return a+1;
    }

    int add(){
        return 1;
    }

    @Override
    public void addOne() {
        a++;
        b++;
    }
}

class multiAdd extends BasicAdd implements addMethods{
    int a; int b; int c;

    multiAdd(int a, int b, int c){
        this.a = a; this.b = b; this.c = c;
    }

    @Override
    int add(int a, int b){
        return a+b+c;
    }

    @Override
    public void addOne() {
        a++;
        b++;
        c++;
    }
}

public class PolyExample {
    public static void main(String[] args) {
        multiAdd example = new multiAdd(2, 4, 5);

        InterfaceDependentExample ex = new InterfaceDependentExample(example);
        
        System.out.println(example.a + example.b + example.c);
        ex.test();
        System.out.println(example.a + example.b + example.c);
    }
}
