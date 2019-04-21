package drawing;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import shapes.*;

import java.util.ArrayList;
import java.util.List;


public class ShapePainter extends Application {
    Canvas canvas = new Canvas(300, 250);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    Shape shape;
    List<CanvasShape> shapesDrawn = new ArrayList<>();

   @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing");
        Group root = new Group();
        Button rectangle = new Button("Rectangle");
        Button ellipse = new Button("Ellipse");
        Button circle = new Button("Circle");
        Button save = new Button("Save");
        ToolBar toolBar = new ToolBar(rectangle,ellipse,circle,save);
        rectangle.setOnAction(eventHandler);
        ellipse.setOnAction(eventHandler);
        circle.setOnAction(eventHandler);
        save.setOnAction(eventHandlerForSave);
      //  Canvas canvas = new Canvas(300, 250);
       // GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        root.getChildren().add(toolBar);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        canvas.setOnMouseClicked(mouseEventEventHandler);
    }

    EventHandler<ActionEvent> eventHandlerForSave = event ->{
       for (CanvasShape shape : shapesDrawn){
           System.out.println(shape);
       }
    };
            EventHandler<ActionEvent> eventHandler = event -> {
       if(event.getTarget() instanceof Button) {

           if(((Button) event.getTarget()).getText().equals("Rectangle")){
               shape = new Rectangle(20,30);

           }
           else if(((Button) event.getTarget()).getText().equals("Ellipse")){
               shape = new Ellipse(30,20);

           }
           else {
               shape = new Circle(20);

           }
       }


   };
   EventHandler<MouseEvent> mouseEventEventHandler = event ->{
       shape.draw(event.getX(),event.getY(),gc);
       shapesDrawn.add(new CanvasShape(shape,event.getX(),event.getY()));
   };/*System.out.println
           ("x co-ordinate of scene is "+ event.getSceneX()+" Y co-ordinate of scene is "+event.getSceneY()+
           "x co-ordinate of canvas is "+event.getX()+" y co-ordinate of canvas is "+event.getY()
           );*/



    public static void doLaunch() {
        launch();
    }

    /*@Override
    public void start(Stage primaryStage) {
        double[] xCoordinates = new double[]{10,10,50};
        double[] yCoordinates = new double[]{10,40,40};
        primaryStage.setTitle("Drawing Triangle");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc= canvas.getGraphicsContext2D();
        gc.strokePolygon(xCoordinates,yCoordinates,3);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public static void main(String[] args){
        launch();
    }*/



}

