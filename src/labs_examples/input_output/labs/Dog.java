package labs_examples.input_output.labs;

public class Dog {
    private String species;
    private String name;
    private int age;
    private int weight;

    public Dog(String species, String name, int age, int weight) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Dog(){

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
