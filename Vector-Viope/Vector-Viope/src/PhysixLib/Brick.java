/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PhysixLib;

/**
 *
 * @author duyb
 */
public class Brick {
    private float width,height,len;

    public Brick(float width,float height,float len){
        this.width = width;
        this.height = height;
        this.len = len;
    }
    
    //Returns the float value of the area of the quad.
    public float Area(){
        return 2*width*height + 2*width*len + 2*height*len;
    }
    
    //Returns the float value of the volume of the quad.
    public float Volume(){
        return width*height*len;
    }
}
