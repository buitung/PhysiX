/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PhysixLib;

/**
 *
 * @author duyb
 */
public class Circle {

    float radius;

    public Circle(float r) {
        this.radius = r;
    }
    
    public float Area(){
        return MathUtils.PI * radius * radius;
    }
    
    public float Circumference(){
        return 2 * MathUtils.PI * radius;
    }
}
