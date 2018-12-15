package shapes;

import javafx.scene.canvas.GraphicsContext;

import static java.lang.Math.round;

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
        return round(3.14* a *b);
    }

    @Override
    public double calcPerimeter() {
        return round(2*3.14*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2));
    }

    public boolean equals(Object other) {
        if (other instanceof Ellipse) {
            Ellipse otherEllipse = (Ellipse) other;
            if (this.a == (otherEllipse.a) && this.b == (otherEllipse.b)) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void draw(double xCoordinate, double yCoordinate, GraphicsContext gc) {
        gc.strokeOval(xCoordinate,yCoordinate,this.a,this.b);
    }
}
