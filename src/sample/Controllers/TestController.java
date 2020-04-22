package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class TestController {

    @FXML
    private Button goToButton;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private void goTo(ActionEvent event) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("/sample/fxml/main.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}
  