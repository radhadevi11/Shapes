package shapes;

import java.util.ArrayList;

public class ShapeAnalyzer {

    public Shape findBiggestShape(ArrayList<Shape> shapes) {
        /*Algorithm
          Step1:create a shapes.Shape type variable biggestShape and assaign it to 0th position shape in the arrayList
          step2:For each shape
                  i)compare biggestShape's area with this shapes.Shape(using compareTo)
                  ii)if it is return -1 assaign this shape to biggestShape
                  iii)otherwise move to the nextShape
          Step3:return biggestShape
         */
        Shape biggestShape = shapes.get(0);
        for (Shape shape : shapes) {
            if (biggestShape.compareTo(shape) == -1) {
                biggestShape = shape;
            }
        }
        return biggestShape;
    }

    public Shape findSmallestShape(ArrayList<Shape> shapes) {
        Shape smallestShape = shapes.get(0);
        for (Shape shape : shapes) {
            if (smallestShape.compareTo(shape) == 1) {
                smallestShape = shape;
            }
        }
        return smallestShape;

    }

    public Shape findBiggestPerimeterShape(ArrayList<Shape> shapes) {
        Shape biggestPerimeterShape = shapes.get(0);
        double biggestPerimeterValue = shapes.get(0).calcPerimeter();
        for (Shape shape : shapes) {
            if (shape.calcPerimeter() > biggestPerimeterValue) {
                biggestPerimeterValue = shape.calcPerimeter();
                biggestPerimeterShape = shape;
            }
        }
        return biggestPerimeterShape;
    }

    public Shape findSmallestPerimeterShape(ArrayList<Shape> shapes) {
        Shape smallestPerimeterShape = shapes.get(0);
        double smallestPerimeterValue = shapes.get(0).calcPerimeter();
        for (Shape shape : shapes) {
            if (shape.calcPerimeter() < smallestPerimeterValue) {
                smallestPerimeterValue = shape.calcPerimeter();
                smallestPerimeterShape = shape;
            }
        }
        return smallestPerimeterShape;
    }

    public double calcTotalArea(ArrayList<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calcArea();
        }
        return totalArea;
    }

    public double calcTotalPerimeter(ArrayList<Shape> shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calcPerimeter();
        }
        return totalPerimeter;
    }
}
