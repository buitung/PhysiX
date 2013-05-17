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

    private float radius;

    public Sphere(float r) {
        radius = r;
    }

    //Returns the float value of the area of the sphere 
    public float Area() {
        return 4*MathUtils.PI*radius*radius;
    }

    //Returns the float value of the volume of the sphere 
    public float Volume() {
        return 4 / 3 * MathUtils.PI * radius * radius * radius;
    }
}
