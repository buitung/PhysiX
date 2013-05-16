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

    public float ProjTime() {
        return 2 * velocity * ((float) Math.sin(angle)) / g;
    }

    public float Distance() {

        return (float)Math.pow(velocity, 2)*(float)Math.sin(2*angle)/g;
    }

    public float Height() {
        return (float)Math.pow(velocity, 2)*
                (float)Math.pow((float)Math.sin(angle),2)/(2*g);
    }

}
