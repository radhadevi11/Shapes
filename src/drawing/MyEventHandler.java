package drawing;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import javax.swing.*;
import java.awt.*;

public class MyEventHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        if(event.getTarget() instanceof javafx.scene.control.Button) {

            System.out.println("User clicked " + ((Button) event.getTarget()).getText() + " button");
        }
    }
}
