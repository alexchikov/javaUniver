package dz.vector3d;

public class Operations {
    public double scalarMultiplyVectors(Vector3... vectors) {
        double multipliedX = 1.0, multipliedY = 1.0, multipliedZ = 1.0;
        for (Vector3 vector : vectors) {
            multipliedX *= vector.getX();
            multipliedY *= vector.getY();
            multipliedZ *= vector.getZ();
        }
        return multipliedX+multipliedY+multipliedZ;
    }

    public Vector3 vectorMultiplyVectors(Vector3 vector1, Vector3 vector2) {
        double multipliedX = (vector1.getX() * vector2.getY()) - (vector2.getX() * vector1.getY()),
                multipliedY = (vector1.getX() * vector2.getZ()) - (vector2.getX() * vector1.getZ()),
                multipliedZ = (vector1.getY() * vector2.getZ()) - (vector2.getY() * vector1.getZ());
        return new Vector3(multipliedX, multipliedY, multipliedZ);
    }

    public Vector3 sumVectors(Vector3 vector1, Vector3 vector2) {
        double multipliedX = (vector1.getX() + vector2.getX()),
                multipliedY = (vector1.getY() + vector2.getY()),
                multipliedZ = (vector1.getZ() + vector2.getZ());
        return new Vector3(multipliedX, multipliedY, multipliedZ);
    }

    public Vector3 diffVectors(Vector3 vector1, Vector3 vector2) {
        double multipliedX = (vector1.getX() - vector2.getX()),
                multipliedY = (vector1.getY() - vector2.getY()),
                multipliedZ = (vector1.getZ() - vector2.getZ());
        return new Vector3(multipliedX, multipliedY, multipliedZ);
    }

    public double absVector(Vector3 vector) {
        return Math.sqrt(Math.pow(vector.getX(), 2) + Math.pow(vector.getY(), 2) + Math.pow(vector.getZ(), 2));
    }

    public double angleBetweenVectors(Vector3 vector1, Vector3 vector2) {
        return Math.acos((scalarMultiplyVectors(vector1, vector2)) / (absVector(vector1) * absVector(vector2)));
    }
}
