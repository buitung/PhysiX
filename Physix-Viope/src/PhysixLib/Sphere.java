/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PhysixLib;

/**
 *
 * @author duyb
 */
public class Sphere {

    float radius;

    public Sphere(float r) {
        radius = r;
    }

    public float Area() {
        return 4*MathUtils.PI*radius*radius;
    }

    public float Volume() {
        return 4 / 3 * MathUtils.PI * radius * radius * radius;
    }
}
