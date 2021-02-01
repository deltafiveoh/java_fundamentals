package labs_examples.objects_classes_methods.labs.objects;

class ExampleAirplane {
    public static void main (String[] args){

        Wings newWings = new Wings();

        newWings.setWings(true, "elevated");

        PlaneEngine newEngine = new PlaneEngine();

        newEngine.setPlaneEngine(200.0);

        LandingGear newLG = new LandingGear();

        newLG.setLandingGear(true);

        Radar newRadar = new Radar();

        newRadar.setRadar(true, 101.5f);

        AirplaneExample newAirplane = new AirplaneExample(newRadar, newLG, newWings, newEngine, 12000, 11000.0);

        System.out.println("New aircraft 1 is taking off with engines set to " + newAirplane.planeEngine.getEngine() + " with the landing gear down as " + newAirplane.landingGear.getWheels() + ", flaps " +
                newAirplane.wings.isFlaps() + ", ailerons " + newAirplane.wings.getAilerons() + ", and remaining fuel of " + newAirplane.currentFuelLevel + " of " + newAirplane.fuelCapacity + " lbs total.");

        System.out.println(newAirplane.toAirplaneString());
    }
}


class PlaneEngine {

    private static double enginePower;

    public void setPlaneEngine(double enginePower){
        this.enginePower = enginePower;
    }

    public static double getEngine(){
        return enginePower;
    }

    @Override
    public String toString(){
        return "engines = " + enginePower;
    }
}

class Wings {

    private static boolean flaps;
    private String ailerons;

    public static boolean isFlaps() {
        return flaps;
    }

    public String getAilerons(){
        return ailerons;
    }

     public void setWings(boolean flaps, String ailerons){
        this.flaps = flaps;
        this.ailerons = ailerons;
    }

    @Override
    public String toString() {
        return "flaps = " + flaps +
                "\n ailerons = " + ailerons;
    }
}

class LandingGear {

    private static boolean wheels;

    public boolean getWheels(){
        return wheels;
    }

    public void setLandingGear(boolean wheels){
        this.wheels = wheels;
    }
}

class Radar {

    private float frequency;
    private boolean radarOn;

    public float getFrequency(){
        return frequency;
    }

    public boolean getRadarOn(){
        return radarOn;
    }

    public void setRadar(boolean radarOn, float frequency){
        this.radarOn = radarOn;
        this.frequency = frequency;
    }
}

public class AirplaneExample {

    Radar radar;

    LandingGear landingGear;

    Wings wings;

    PlaneEngine planeEngine;

    int fuelCapacity;

    double currentFuelLevel;

    public AirplaneExample(Radar radar, LandingGear landingGear, Wings wings, PlaneEngine planeEngine, int fuelCapacity, double currentFuelLevel){
        this.radar = radar;
        this.landingGear = landingGear;
        this.wings = wings;
        this.planeEngine = planeEngine;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public String toAirplaneString(){
        return "Airplane { " +
                planeEngine.toString() + "\n" +
                wings.toString() +
                "\n fuel capacity = " + fuelCapacity;
    }
}
