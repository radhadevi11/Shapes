import org.junit.jupiter.api.Test;

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
        Shape circle = new Circle(20);
        assertEquals(1256,circle.calcArea());
    }
    @Test
    void testCirclePerimeter(){
        Shape circle = new Circle(40);
        assertEquals(251.2,circle.calcPerimeter());
    }


}