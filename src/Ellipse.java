import static java.lang.StrictMath.round;

public class Ellipse implements Shape {

    private double a;
    private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double calcArea() {
        return round(3.14* a *b*100.0)/100.0;
    }

    @Override
    public double calcPerimeter() {
        return round(2*3.14*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2)*100.0)/100.0;
    }
}
