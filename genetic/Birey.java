package genetic;

public class Birey {
    float x,y,z,t;

    public Birey(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = x*x + y*y + z*z;
    }
}
