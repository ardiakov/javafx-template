package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent template = FXMLLoader.load(getClass().getResource("/sample/fxml/main.fxml"));
        primaryStage.setTitle("Hello World");

        Scene scene1 = new Scene(template);

        primaryStage.setScene(scene1);
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
