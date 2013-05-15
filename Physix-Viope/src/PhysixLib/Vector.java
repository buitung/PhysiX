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

    public void Normalize() {
        float magnitude = Magnitude();
        this.x = x / magnitude;
        this.y = y / magnitude;
        this.z = z / magnitude;

    }

    public void AddVec(Vector vecNew) {
        this.x += vecNew.x;
        this.y += vecNew.y;
        this.z += vecNew.z;
    }

    public void SubVec(Vector vecNew) {
        this.x -= vecNew.x;
        this.y -= vecNew.y;
        this.z -= vecNew.z;
    }

    public Vector CrossProduct(Vector vecNew) {
        return new Vector(this.y * vecNew.z - this.z * vecNew.y,
                this.z * vecNew.x - this.x * vecNew.z,
                this.x * vecNew.y - this.y * vecNew.x);
    }

    public void Product(float i) {
        this.x = i * x;
        this.y = i * y;
        this.z = i * z;
    }

    public float DotProduct(Vector vecNew) {
        return this.x*vecNew.x + this.y*vecNew.y + this.z*vecNew.z;
    }

    public float AngleVec(Vector vecNew) {
        return MathUtils.CosAngle(DotProduct(vecNew),this.Magnitude()*vecNew.Magnitude());

    }

    public float DistanceVec(Vector vecNew) {
        return MathUtils.Pythagore3D(this.x-vecNew.x,this.y-vecNew.y,this.z-vecNew.z);
    }
}

