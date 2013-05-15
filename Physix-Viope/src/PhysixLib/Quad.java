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
    
    public float Area(){
        return width*height;
    }
    
    public float Perimeter(){
        return 2*(width+height);
    }
}
