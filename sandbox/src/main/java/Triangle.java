public class Triangle {
    public double xa;
    public double xb;
    public double xc;

    public Triangle(double xa, double xb, double xc) {
        this.xa = xa;
        this.xb = xb;
        this.xc = xc;
    }
    public  double area() {
        return this.xa + this.xb + this.xc;
    }

}
