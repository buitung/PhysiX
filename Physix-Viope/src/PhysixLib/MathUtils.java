/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PhysixLib;

/**
 *
 * @author duyb
 */
public class MathUtils {
    final static float PI = (float) Math.PI; 
    
    public static float power(float a,int b){
        return (float) Math.pow(a, b);
    }
    
    public static float Pythagore2D(float a,float b){
        return (float) Math.sqrt(a*a+b*b);
    }
    
    public static float Pythagore3D(float a,float b,float c){
        return (float) Math.sqrt(a*a+b*b+c*c);
    }
    
    public static float Deg2Rad(float deg){
        return (deg*PI)/180;
    }
    
    public static float Rag2Deg(float rag){
        return (rag*180)/PI;
    }
    
    public static float OppositeSide(float a,float b){
        return b * (float)Math.sin(a);
    }
    
    public static float SinAngle(float a,float b){
        return (float)Math.asin(a/b);
    }
    
    public static float AdjacentSide(float a,float b){
        return b * (float)Math.cos(a);    
    }
    
    public static float CosAngle(float a,float b){
        return (float)Math.acos(a/b);
    }
    
    public static float TanAngle(float a,float b){
        return (float)Math.atan(a/b);
    }

    // public static void main(String[] args){
    //     System.out.println(Rag2Deg(CosAngle((float) Math.sqrt(2),2)));
    // }
}
