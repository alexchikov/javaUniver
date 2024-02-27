package dz.vector3d;

public class Vector3 {
    double X, Y, Z;
    public Vector3(double X, double Y, double Z){
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public double getZ() {
        return Z;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public void setZ(double z) {
        Z = z;
    }
}
