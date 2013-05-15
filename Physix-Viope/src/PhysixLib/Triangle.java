/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PhysixLib;

/**
 *
 * @author duyb
 */
public class Triangle {
    private float a,b,c;
    
    public Triangle(float a,float b,float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public float Perimeter(){
        return a+b+c;
    }
    
    public float Area(){
        float p = Perimeter();
        return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
