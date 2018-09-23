import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    public void testTriangleArea(){
        Shape triangle = new Triangle(3,4,5);
        assertEquals(6,triangle.calcArea());
    }
    @Test
    public void testSquareArea(){
        Shape square = new Square(8);
        assertEquals(64,square.calcArea());
    }


}