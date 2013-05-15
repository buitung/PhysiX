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
    float width,height,len;
    public Brick(float width,float height,float len){
        this.width = width;
        this.height = height;
        this.len = len;
    }
    
    public float Area(){
        return 2*width*height + 2*width*len + 2*height*len;
    }
    
    public float Volume(){
        return width*height*len;
    }
}
