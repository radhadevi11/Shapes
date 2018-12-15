package shapes;

import javafx.scene.canvas.GraphicsContext;

public  class Triangle implements Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double calcArea() {
        double p = calcPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double calcPerimeter() {
        return a+b+c;
    }
    public boolean equals(Object other) {
        if (other instanceof Triangle) {
            Triangle otherTriangle = (Triangle) other;
            if (this.a == otherTriangle.a && this.b == otherTriangle.b && this.c == otherTriangle.c ) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
