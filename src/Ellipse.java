import static java.lang.Math.round;

public class Ellipse implements Shape,Comparable<Ellipse> {

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
        return round(3.14* a *b);
    }

    @Override
    public double calcPerimeter() {
        return round(2*3.14*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2));
    }

    @Override
    public int compareTo(Ellipse other) {
        if(this.calcArea() == other.calcArea()) {
            return 0;
        }
        else if (this.calcArea() > other.calcArea()) {
            return -1;

        }
        else {
            return 1;
        }
    }
}
