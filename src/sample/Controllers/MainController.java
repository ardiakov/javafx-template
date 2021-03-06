package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MainController {

    @FXML
    private Button goToButton;

    @FXML
    private Pane content;

    @FXML
    private void goTo(ActionEvent event) throws Exception {
        Pane pane = FXMLLoader.load(getClass().getResource("/sample/fxml/sample2.fxml"));
        content.getChildren().setAll(pane);
    }
}
