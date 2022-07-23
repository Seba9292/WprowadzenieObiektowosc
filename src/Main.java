public class Main {
    public static void main(String[] args) {

        Car ford = new Car("Black", 5, "Puma", true);
        System.out.println(ford.getautomaticGearbox());
       ford.setAutomaticGearbox(false);
        System.out.println(ford.getautomaticGearbox());
    }
}
