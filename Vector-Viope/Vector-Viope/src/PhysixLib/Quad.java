/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PhysixLib;

/**
 *
 * @author duyb
 */
public class Quad {
    private float width,height;
    public Quad(float width,float height){
        this.width = width;
        this.height = height;
    }
    
    //Returns the float value of the area of the quad
    public float Area(){
        return width*height;
    }
    
    //Returns the float value of the perimeter of the quad
    public float Perimeter(){
        return 2*(width+height);
    }
}
