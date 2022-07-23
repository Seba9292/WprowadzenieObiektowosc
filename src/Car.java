public class Car {
    private String colour;
    private int doors;
    private String brand;
    private boolean automaticGearbox;

    public Car(String colour, int doors, String brand, boolean automaticGearbox){
        this.colour = colour;
        this.doors = doors;
        this.brand = brand;
        this.automaticGearbox = automaticGearbox;
    }

    public void setAutomaticGearbox(boolean automaticGearbox) {
        this.automaticGearbox = automaticGearbox;

    }
    public boolean getautomaticGearbox (){
        return automaticGearbox;
    }
}
