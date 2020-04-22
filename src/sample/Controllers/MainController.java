package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML
    private Button goToButton;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private void goTo(ActionEvent event) throws Exception {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sample/fxml/sample2.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}
