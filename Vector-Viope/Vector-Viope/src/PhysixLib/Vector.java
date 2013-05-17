package PhysixLib;

/**
 * @author lucasc
 */

public class Vector {

    private float x, y, z;

    public Vector() {
        x = y = z = 0;

    }

    public Vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float SqrMagnitude() {
        return x * x + y * y + z * z;
    }

    public float Magnitude() {
        return (float) Math.sqrt(SqrMagnitude());
    }

    //Normalize this vector
    public void Normalize() {
        float magnitude = Magnitude();
        this.x = x / magnitude;
        this.y = y / magnitude;
        this.z = z / magnitude;

    }

    //Add another vector to this vector
    public void AddVec(Vector vecNew) {
        this.x += vecNew.x;
        this.y += vecNew.y;
        this.z += vecNew.z;
    }

    //Subtract another vector from this vector
    public void SubVec(Vector vecNew) {
        this.x -= vecNew.x;
        this.y -= vecNew.y;
        this.z -= vecNew.z;
    }

    //return the crossproduct between this vector and another vector
    public Vector CrossProduct(Vector vecNew) {
        return new Vector(this.y * vecNew.z - this.z * vecNew.y,
                this.z * vecNew.x - this.x * vecNew.z,
                this.x * vecNew.y - this.y * vecNew.x);
    }

    //return the product betwen this vector and a number
    public void Product(float i) {
        this.x = i * x;
        this.y = i * y;
        this.z = i * z;
    }

    //return the dotproduct between this vector and another vector
    public float DotProduct(Vector vecNew) {
        return this.x*vecNew.x + this.y*vecNew.y + this.z*vecNew.z;
    }

    //return the angle between this vector and another vector
    public float AngleVec(Vector vecNew) {
        return MathUtils.CosAngle(DotProduct(vecNew),this.Magnitude()*vecNew.Magnitude());

    }

    //return the distance between this vector and another vector
    public float DistanceVec(Vector vecNew) {
        return MathUtils.Pythagore3D(this.x-vecNew.x,this.y-vecNew.y,this.z-vecNew.z);
    }

    //getter
    public float getX() {
        return x;
    }
    
    //getter
    public float getY() {
        return y;
    }

    //getter
    public float getZ() {
        return z;
    }
}

