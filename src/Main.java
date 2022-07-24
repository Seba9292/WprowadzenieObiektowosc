public class Main {
    public static void main(String[] args) {

        Car ford = new Car("Black", 5, "Puma", true);
        System.out.println(ford.getautomaticGearbox());
       ford.setAutomaticGearbox(false);
        System.out.println(ford.getautomaticGearbox());

        Car suzuki = new Car("Blue",3, "Jimny", true);
        System.out.println(suzuki.getColour());
        suzuki.setColour("Green");
        System.out.println(suzuki.getColour());

    }
}
