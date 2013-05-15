package PhysixLib;

/**
 * @author: Tung Trinh
 */
public class Projectile {

    float velocity;
    float angle;
    float g = 9.8f;

    public Projectile() {
        velocity = angle = 0;
    }

    public Projectile(float v, float a) {
        this.velocity = v;
        this.angle = a;
    }

    public float ProjTime(float v, float a) {
        this.velocity = v;
        this.angle = a;
        return 2 * v * ((float) Math.sin(a)) / g;
    }

    public float Distance(float v, float a) {
        this.velocity = v;
        this.angle = a;
        return (float)Math.pow(v, 2)*(float)Math.sin(2*a)/g;
    }

    public float Height(float v, float a) {
        this.velocity = v;
        this.angle = a;
        return (float)Math.pow(v, 2)*
                (float)Math.pow((float)Math.sin(a),2)/(2*g);
    }

}
