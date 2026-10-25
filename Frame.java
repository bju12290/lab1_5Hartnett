/**
 * Project: Lab 1.5 - Motorcycle
 * Purpose Details: Represents the material of a motorcycle frame.
 * Course: CMPSC 221
 * Author: Brian P. Hartnett Jr.
 * Date Developed: 10/24/2026
 * Last Date Changed: 10/24/2026
 * Revision: 1.0
 */
public class Frame {
    private Material material;

    public Frame(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
