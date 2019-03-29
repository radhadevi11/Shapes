package drawing;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import shapes.Circle;
import shapes.Ellipse;
import shapes.Rectangle;
import shapes.Shape;

import java.util.ArrayList;

public class ShapePainterMain {
    public static void main(String[] args){
        drawFace();


    }
    public static void drawFace(){
        CanvasShape canvasShape1 = new CanvasShape(new Circle(20),105,70);
        CanvasShape canvasShape2 = new CanvasShape(new Rectangle(10,20),133,100);
        ArrayList<CanvasShape> shapes = new ArrayList<>();
        shapes.add(canvasShape1);
        shapes.add(canvasShape2);
        shapes.add(new CanvasShape(new Circle(20),150,70));
        shapes.add(new CanvasShape(new Circle(100),90,50));
        shapes.add(new CanvasShape(new Ellipse(35,5),120,129));
        shapes.add(new CanvasShape(new Circle(25),65,87));
        shapes.add(new CanvasShape(new Circle(25),190,87));
        ShapePainter.drawShapes(shapes);

    }
}
