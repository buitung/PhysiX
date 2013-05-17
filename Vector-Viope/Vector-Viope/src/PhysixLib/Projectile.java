package PhysixLib;

/**
 * @author: Tung Trinh
 */
public class Projectile {

    private float velocity;
    private float angle;
    private float g = 9.8f;

    public Projectile() {
        velocity = angle = 0;
    }

    public Projectile(float v, float a) {
        this.velocity = v;
        this.angle = a;
    }

    //Returns the float value of the duration a projectile would spend in the air providing a float angle and a float velocity. 
    public float ProjTime() {
        return 2 * velocity * ((float) Math.sin(angle)) / g;
    }

    //Returns the float value of the distance a projectile would travel providing a float angle and a float velocity.
    public float Distance() {
        float ss;
        if (angle == 0 || angle == MathUtils.Deg2Rad(180)) {
            ss = 0;
        } else {
            ss = (float) Math.sin(2 * angle);
        }
        return (float) Math.pow(velocity, 2) * ss / g;
    }

    //Returns the float value of the height a projectile would reach providing a float angle and a float velocity. 
    public float Height() {
        return (float) Math.pow(velocity, 2)
                * (float) Math.pow((float) Math.sin(angle), 2) / (2 * g);
    }
}
