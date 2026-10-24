/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Represents a motorcycle and its major components.
 * Course: IST 242
 * Author: Brian P. Hartnett Jr.
 * Date Developed: 10/24/2026
 * Last Date Changed: 10/24/2026
 * Revision: 1.0
 */
public class Motorcycle {
    private String make;
    private String model;
    private int year;
    private String color;
    private Frame frame;
    private Wheel frontWheel;
    private Wheel rearWheel;
    private Engine engine;
    private Transmission transmission;

    public Motorcycle(
            String make,
            String model,
            int year,
            String color,
            Frame frame,
            Wheel frontWheel,
            Wheel rearWheel,
            Engine engine, Transmission transmission
    ) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.frame = frame;
        this.frontWheel = frontWheel;
        this.rearWheel = rearWheel;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public void setFrontWheel(Wheel frontWheel) {
        this.frontWheel = frontWheel;
    }

    public Wheel getRearWheel() {
        return rearWheel;
    }

    public void setRearWheel(Wheel rearWheel) {
        this.rearWheel = rearWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void start() {
        System.out.println("Motorcycle started.");
    }

    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}
