package xyz.prgrm.paste.controllers;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class IconController implements Initializable {
    @FXML
    VBox MAIN_L;
    @FXML
    ImageView IMG_VIEW;

    private Stage stage;

    public void setStage(final Stage stage) {
        this.stage = stage;
        final Delta dragDelta = new Delta();
        MAIN_L.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                // record a delta distance for the drag and drop operation.
                dragDelta.x = stage.getX() - mouseEvent.getScreenX();
                dragDelta.y = stage.getY() - mouseEvent.getScreenY();
            }
        });
        MAIN_L.setOnMouseDragged(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getScreenX() + dragDelta.x);
                stage.setY(mouseEvent.getScreenY() + dragDelta.y);
            }
        });
    }

    public void initialize(URL location, ResourceBundle resources) {

    }

    boolean flag = true;

    public void toggle() throws Exception {
        if (flag) {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/list.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            this.stage.setScene(scene);
        } else {
            flag = true;
        }

    }

    public void drag() {
        flag = false;
    }

}

class Delta {
    double x, y;
}

