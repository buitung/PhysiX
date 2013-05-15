/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PhysixLib;

/**
 *
 * @author duyb
 */
public class Pyramid {

    private float baseside1, baseside2, baseside3, height, slantheight;
    private Triangle t;

    public Pyramid(float baseside1, float baseside2,
            float baseside3, float height, float slantheight) {
        this.baseside1 = baseside1;
        this.baseside2 = baseside2;
        this.baseside3 = baseside3;
        this.height = height;
        this.slantheight = slantheight;
        t = new Triangle(baseside1, baseside2, baseside3);
    }

    public float Area() {
        return t.Area()+(float)0.5*t.Perimeter()*slantheight;
    }
    
    public float Volume(){
        return t.Area()*height/3;
    }
}
