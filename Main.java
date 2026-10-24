/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Creates three motorcycle objects and prints all their properties using getters.
 * Course: IST 242
 * Author: Brian P. Hartnett Jr.
 * Date Developed: 10/24/2026
 * Last Date Changed: 10/24/2026
 * Revision: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle(
                "Honda", "Rebel 500", 2024, "Black",
                new Frame(Material.STEEL),
                new Wheel(16.0), new Wheel(16.0),
                new Engine(471, 2),
                new Transmission("Manual", 6)
        );

        Motorcycle motorcycle2 = new Motorcycle(
                "Kawasaki", "Ninja 400", 2023, "Green",
                new Frame(Material.STEEL),
                new Wheel(17.0), new Wheel(17.0),
                new Engine(399, 2),
                new Transmission("Manual", 6)
        );

        Motorcycle motorcycle3 = new Motorcycle(
                "Yamaha", "MT-07", 2024, "Blue",
                new Frame(Material.STEEL),
                new Wheel(17.0), new Wheel(17.0),
                new Engine(689, 2),
                new Transmission("Manual", 6)
        );

        printMotorcycleDetails(motorcycle1);
        printMotorcycleDetails(motorcycle2);
        printMotorcycleDetails(motorcycle3);
    }

    private static void printMotorcycleDetails(Motorcycle motorcycle) {
        System.out.println("------------------------------");
        System.out.println("Make: " + motorcycle.getMake());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYear());
        System.out.println("Color: " + motorcycle.getColor());
        System.out.println("Frame material: " + motorcycle.getFrame().getMaterial());
        System.out.println("Front wheel diameter: " + motorcycle.getFrontWheel().getDiameterInches() + " inches");
        System.out.println("Rear wheel diameter: " + motorcycle.getRearWheel().getDiameterInches() + " inches");
        System.out.println("Engine displacement: " + motorcycle.getEngine().getDisplacementCc() + " cc");
        System.out.println("Engine cylinders: " + motorcycle.getEngine().getCylinderCount());
        System.out.println("Transmission type: " + motorcycle.getTransmission().getType());
        System.out.println("Transmission gears: " + motorcycle.getTransmission().getGearCount());
        motorcycle.start();
        motorcycle.stop();
        System.out.println();
    }
}
