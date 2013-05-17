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

    private float radius;

    public Circle(float r) {
        this.radius = r;
    }
    

    //Returns the float value of the area of the circle using PI 
    public float Area(){
        return MathUtils.PI * radius * radius;
    }
    
    //Returns the float value of the circumference of the circle     
    public float Circumference(){
        return 2 * MathUtils.PI * radius;
    }
}
