package main;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import static javafx.scene.input.KeyCode.ENTER;

public class AddVehicleView {

    private AddVehicleController aVController;

    public AddVehicleView(ShowVehiclesView showVehiclesView){
        aVController = new AddVehicleController(this, showVehiclesView);
    }

    public Parent getRoot(){
        Pane root = new Pane();
        TextField tfModel = new TextField();
        tfModel.setOnKeyPressed(e -> {
            if(e.getCode() == ENTER){
                aVController.updateVehicleEntry(new Vehicle(tfModel.getText()));
            }
        });
        root.getChildren().add(tfModel);
        return root;
    }
}
