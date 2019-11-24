package main;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    ShowVehiclesView showVehiclesView = new ShowVehiclesView();
    AddVehicleView addVehicleView = new AddVehicleView(showVehiclesView);

    @Override
    public void start(Stage primaryStage) {
        SceneController.setScene(new Scene(showVehiclesView.getRoot(), 1100, 700));
        primaryStage.setScene(SceneController.getScene());
        primaryStage.show();
    }
}
