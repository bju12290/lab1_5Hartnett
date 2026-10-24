/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Represents a motorcycle wheel and its diameter in inches.
 * Course: IST 242
 * Author: Brian P. Hartnett Jr.
 * Date Developed: 10/24/2026
 * Last Date Changed: 10/24/2026
 * Revision: 1.0
 */
public class Wheel {
    private double diameterInches;

    public Wheel(double diameterInches) {
        this.diameterInches = diameterInches;
    }

    public double getDiameterInches() {
        return diameterInches;
    }

    public void setDiameterInches(double diameterInches) {
        this.diameterInches = diameterInches;
    }
}
