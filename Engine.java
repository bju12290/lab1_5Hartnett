/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Represents engine displacement and cylinder count.
 * Course: CMPSC 221
 * Author: Brian P. Hartnett Jr.
 * Date Developed: 10/24/2026
 * Last Date Changed: 10/24/2026
 * Revision: 1.0
 */
public class Engine {
    private int displacementCc;
    private int cylinderCount;

    public Engine(int displacementCc, int cylinderCount) {
        this.displacementCc = displacementCc;
        this.cylinderCount = cylinderCount;
    }

    public int getDisplacementCc() {
        return displacementCc;
    }

    public void setDisplacementCc(int displacementCc) {
        this.displacementCc = displacementCc;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }
}
