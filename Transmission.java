/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Represents a motorcycle transmission and gear count.
 * Course: IST 242
 * Author: Brian P. Hartnett Jr.
 * Date Developed: 10/24/2026
 * Last Date Changed: 10/24/2026
 * Revision: 1.0
 */
public class Transmission {
    private String type;
    private int gearCount;

    public Transmission(String type, int gearCount) {
        this.type = type;
        this.gearCount = gearCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }
}
