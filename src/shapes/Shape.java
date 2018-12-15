package shapes;

import javafx.scene.canvas.GraphicsContext;

public interface Shape extends Comparable<Shape>{
    public double calcArea();
    public double calcPerimeter();
    public default void draw(double xCoordinate, double yCoordinate, GraphicsContext gc){

    }
    public default int compareTo(Shape other) {
        if(this.calcArea() == other.calcArea()) {
            return 0;
        }
        else if (this.calcArea() > other.calcArea()) {
            return 1;

        }
        else {
            return -1;
        }
    }


}
