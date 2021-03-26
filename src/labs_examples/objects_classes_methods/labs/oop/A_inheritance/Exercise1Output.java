package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

class SeaCreatures {
    int o2Use;
    int foodConsumption;

    SeaCreatures(int o2, int food){
        this.o2Use = o2;
        this.foodConsumption = food;
    }

    void eats(){
        System.out.println("The creature eats");
    }
}

class Fish extends SeaCreatures {
    boolean hasScales;
    boolean meatEater;

    Fish(int o2, int food, boolean scaly, boolean carnivore) {
        super(o2, food);
        this.hasScales = scaly;
        this.meatEater = carnivore;
    }

    @Override
    void eats(){
        System.out.println("The fish eats");
        foodConsumption++;
    }

    void swims(){
        System.out.println("The fish swims");
    }
}

class Crustaceans extends SeaCreatures {
    boolean hasClaws;
    boolean amphibious;

    Crustaceans(int o2, int food, boolean claws, boolean amphibious) {
        super(o2, food);
        this.hasClaws = claws;
        this.amphibious = amphibious;
    }

    void crawls(){
        System.out.println("The crustacean crawls");
    }


}

class Sharks extends Fish{
    String species;
    boolean mustSwim;

    Sharks(int o2, int food, boolean scaly, boolean carnivore, String type, boolean swimmer) {
        super(o2, food, scaly, carnivore);
        this.species = type;
        this.mustSwim = swimmer;
    }

    @Override
    void eats(){
        System.out.println("The shark is eating");
        foodConsumption += 2;
    }

    void eating(Crab creature){
        System.out.println("The shark eats a " + creature.species);
        creature.alive = false;
    }

    @Override
    void swims(){
        System.out.println("The shark swims");
        foodConsumption += 2;
    }

    void bites(){
        System.out.println("The shark is biting its prey");
    }

}

class Crab extends Crustaceans{
    String species;
    boolean prefersWater;
    boolean alive;

    Crab(int o2, int food, boolean claws, boolean amphibious, String type, boolean waterBased,boolean living) {
        super(o2, food, claws, amphibious);
        this.species = type;
        this.prefersWater = waterBased;
        this.alive = living;
    }

    @Override
    void crawls(){
        System.out.println("The crab crawls");
    }

    void grabs(){
        System.out.println("The crab grabs something with its claws");
    }
}


public class Exercise1Output {
    public static void main(String[] args) {
        Sharks hammerShark = new Sharks(300,100, false, true, "Hammerhead Shark", true);
        Fish tuna = new Fish(200, 50, true, false);
        Crab kingCrab = new Crab(20, 10, true, true, "King Crab", true, true);

        tuna.eats();
        tuna.swims();

        kingCrab.crawls();
        kingCrab.grabs();
        System.out.println("The crab's living status is " + kingCrab.alive);

        hammerShark.swims();
        hammerShark.bites();
        hammerShark.eating(kingCrab);
        hammerShark.eats();

        System.out.println("The crab's living status is " + kingCrab.alive);

    }
}

/*
        3) Create at least three methods that override a method in one or more parent classes.

        4) Create a controller class/method that will create objects of your hierarchy and demonstrate how you use this labs_examples.inheritance
        hierarchy. Demonstrate that your subclasses have set the variables in the parent classes, that you have called the parameterized
        super constructors from sub-classes, that you are indeed overriding methods.
 */