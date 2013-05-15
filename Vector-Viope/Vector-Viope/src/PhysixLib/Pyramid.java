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

    private float baseside1, baseside2, baseside3, height;
    private Triangle t;

    public Pyramid(float baseside1, float baseside2,
            float baseside3, float height) {
        this.baseside1 = baseside1;
        this.baseside2 = baseside2;
        this.baseside3 = baseside3;
        this.height = height;
        t = new Triangle(baseside1, baseside2, baseside3);
    }

    public float Area() {
//        return t.Area()+(float)0.5*t.Perimeter()*slantheight;
        float s = (float)0.5*(baseside1+baseside2+baseside3);
        float ir = (float)Math.sqrt((s-baseside1)*(s-baseside2)*(s-baseside3)/s);
        float sh = MathUtils.Pythagore2D(height, ir);
        return t.Area() + (float)0.5*t.Perimeter()*sh;
    }
    
    public float Volume(){
        return t.Area()*height/3;
    }
}
