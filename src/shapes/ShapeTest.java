package shapes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    public void testTriangleArea(){
        Shape triangle = new Triangle(3,4,5);
        assertEquals(6,triangle.calcArea());
    }
    @Test
    public void testTrianglePerimeter(){
        Shape triangle = new Triangle(3,4,5);
        assertEquals(12,triangle.calcPerimeter());
    }
    @Test
    public void testSquareArea(){
        Shape square = new Square(8);
        assertEquals(64,square.calcArea());
    }
    @Test
    public void testSquarePerimeter(){
        Shape square = new Square(8);
        assertEquals(32,square.calcPerimeter());
    }
    @Test
    public void testRectangleArea(){
        Shape rectangle = new Rectangle(4,4);
        assertEquals(16,rectangle.calcArea());
    }
    @Test
    public void testRectanglePerimeter(){
        Shape rectangle = new Rectangle(5,5);
        assertEquals(20,rectangle.calcPerimeter());
    }
    @Test
    void testEllipseArea(){
        Shape ellipse = new Ellipse(10,40);
        assertEquals(1256,ellipse.calcArea());
    }
    @Test
    void testEllipsePerimeter(){
        Shape ellipse = new Ellipse(20,70);
        assertEquals(323,ellipse.calcPerimeter());
    }
    @Test
    void testCircleArea(){
        Shape circle = new Circle(21);
        assertEquals(1385,circle.calcArea());
    }
    @Test
    void testCirclePerimeter(){
        Shape circle = new Circle(40);
        assertEquals(251.0,circle.calcPerimeter());
    }
    //create arrayList of shapes put different shape in wrong order of area
    //use Collections.sort() to sort the arrayList
    //assert that the shapes are now in correct order of area
    //   if assert fails read java doc of compareTo method check the compareTo code

    @Test
    void testCompareTo(){
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle((21)));
        shapes.add(new Rectangle(4,4));
        shapes.add(new Ellipse(10,40));
        shapes.add(new Square(8));
        shapes.add(new Triangle(3,4,5));

        Collections.sort(shapes);

        ArrayList<Shape> expected = new ArrayList<>();
        expected.add(new Triangle(3,4,5));
        expected.add(new Rectangle(4,4));
        expected.add(new Square(8));
        expected.add(new Ellipse(10,40));
        expected.add(new Circle(21));

        assertEquals(expected,shapes);


    }

}