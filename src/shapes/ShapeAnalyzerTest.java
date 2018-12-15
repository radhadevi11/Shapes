package shapes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShapeAnalyzerTest {
    @Test
    public void testFindBiggestShape(){
        ShapeAnalyzer testBiggest = new ShapeAnalyzer();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4,4));
        shapes.add(new Ellipse(10,40));
        shapes.add(new Square(8));
        shapes.add(new Triangle(3,4,5));
        shapes.add(new Circle((21)));

        Shape actual = testBiggest.findBiggestShape(shapes);
        Shape expected = new Circle(21);

        assertEquals(expected,actual);
    }
    @Test
    public void testFindSmallestShape(){
        ShapeAnalyzer testSmallest = new ShapeAnalyzer();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle((21)));
        shapes.add(new Rectangle(4,4));
        shapes.add(new Ellipse(10,40));
        shapes.add(new Square(8));
        shapes.add(new Triangle(3,4,5));

        Shape actual = testSmallest.findSmallestShape(shapes);
        Shape expected = new Triangle(3,4,5);

        assertEquals(expected,actual);
    }
    @Test
    public void testFindBiggestPerimeterShape(){
        ShapeAnalyzer testBiggestPerimeter = new ShapeAnalyzer();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle((21)));
        shapes.add(new Rectangle(4,4));
        shapes.add(new Ellipse(10,40));
        shapes.add(new Square(8));
        shapes.add(new Triangle(3,4,5));

        Shape actual = testBiggestPerimeter.findBiggestPerimeterShape(shapes);
        Shape expected = new Ellipse(10,40);

        assertEquals(expected,actual);


    }
    @Test
    public void testFindSmallestPerimeter(){
        ShapeAnalyzer testSmallestPerimeter = new ShapeAnalyzer();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle((21)));
        shapes.add(new Rectangle(4,4));
        shapes.add(new Ellipse(10,40));
        shapes.add(new Square(8));
        shapes.add(new Triangle(3,4,5));

        Shape actual = testSmallestPerimeter.findSmallestPerimeterShape(shapes);
        Shape expected = new Triangle(3,4,5);

        assertEquals(expected,actual);

    }
    @Test
    public void testCalcTotalArea(){
        ShapeAnalyzer testTotalArea = new ShapeAnalyzer();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle((21)));
        shapes.add(new Rectangle(4,4));
        shapes.add(new Ellipse(10,40));
        shapes.add(new Square(8));
        shapes.add(new Triangle(3,4,5));

        double actual = testTotalArea.calcTotalArea(shapes);
        double expected = 2727;

        assertEquals(expected,actual);

    }
    @Test
    public void testCalcTotalPerimeter(){
        ShapeAnalyzer testTotalPerimeter = new ShapeAnalyzer();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle((40)));
        shapes.add(new Rectangle(5,5));
        shapes.add(new Ellipse(20,70));
        shapes.add(new Square(8));
        shapes.add(new Triangle(3,4,5));

        double actual = testTotalPerimeter.calcTotalPerimeter(shapes);
        double expected = 638;

        assertEquals(expected,actual);

    }



}