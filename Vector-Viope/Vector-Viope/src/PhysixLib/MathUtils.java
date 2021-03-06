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
    //The PI value
    final static float PI = (float) Math.PI; 
    
    /**
     *
     * @param a float
     * @param b int
     * @return parameter a to the power of b
     */
    
    public static float power(float a,int b){
        return (float) Math.pow(a, b);
    }
    
    /**
     *
     * @param a float
     * @param b float
     * @return the float value from the square root of a squared and b squared
     */
    
    public static float Pythagore2D(float a,float b){
        return (float) Math.sqrt(a*a+b*b);
    }
    
    /**
     *
     * @param a float
     * @param b float
     * @param c float
     * @return the float value from the square root of a squared, b squared and c squared
     */
    
    public static float Pythagore3D(float a,float b,float c){
        return (float) Math.sqrt(a*a+b*b+c*c);
    }
    
    /**
     *
     * @param deg in degree
     * @return a float value of the conversion into radians.
     */
    
    public static float Deg2Rad(float deg){
        return (deg*PI)/180;
    }
    
    /**
     *
     * @param rag in radian
     * @return a float value of the conversion into degrees.
     */
    
    public static float Rag2Deg(float rag){
        return (rag*180)/PI;
    }

    /**
     *
     * @param a float
     * @param b float
     * @return the float value of the length of the opposite side providing a for angle  and b for hypotenuse. 
     */
    
    public static float OppositeSide(float a,float b){
        return b * (float)Math.sin(a);
    }
    
    /**
     *
     * @param a float
     * @param b float
     * @return the float value of the angle providing a for opposite and b for hypotenuse. 
     */
    
    public static float SinAngle(float a,float b){
        return (float)Math.asin(a/b);
    }
    
    /**
     *
     * @param a float
     * @param b float
     * @return the float value of the length of the adjacent side providing a for angle  and b for hypotenuse.
     */
    public static float AdjacentSide(float a,float b){
        return b * (float)Math.cos(a);    
    }
    
    /**
     *
     * @param a float
     * @param b float
     * @return the float value of the angle providing a for adjacent and b for hypotenuse. 
     */
    public static float CosAngle(float a,float b){
        return (float)Math.acos(a/b);
    }
    
    /**
     *
     * @param a float
     * @param b float
     * @return the float value of the angle providing a for opposite and b for adjacent. 
     */
    public static float TanAngle(float a,float b){
        return (float)Math.atan(a/b);
    }

    // public static void main(String[] args){
    //      System.out.println(Rag2Deg(CosAngle((float) Math.sqrt(2),2)));
    //      System.out.println(AdjacentSide(Deg2Rad((float)30), Pythagore2D((float)2.5,(float)5)));
    //      System.out.println(Math.cos(Deg2Rad((float)90))<0.000001);
    //      System.out.println(Math.tan(PI));
    //      System.out.println(Math.ceil(-0.9));
    //      double t = 1.0/0.0;
    //      System.out.println(t);
    // }
}
