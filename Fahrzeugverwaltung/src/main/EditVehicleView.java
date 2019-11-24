package main;

import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import static javafx.scene.input.KeyCode.ENTER;

public class EditVehicleView {

    private Pane vehicleEntry;
    private Vehicle vehicle;
    private EditVehicleController eVController;
    private Pane root = new Pane();

    public EditVehicleView(ShowVehiclesView showVehiclesView, Pane vehicleEntry, Vehicle vehicle){
        this.vehicleEntry = vehicleEntry;
        this.vehicle = vehicle;
        this.eVController = new EditVehicleController(this, showVehiclesView);
    }

    public Parent getRoot(){
        TextField tfIdentificationNumber = new TextField(vehicle.getIdentificationNumber());
        tfIdentificationNumber.relocate(110, 10);
        TextField tfBrand = new TextField(vehicle.getBrand());
        tfBrand.relocate(110, 50);
        TextField tfModel = new TextField(vehicle.getModel());
        tfModel.relocate(110, 90);
        TextField tfCapacity = new TextField(Integer.toString(vehicle.getCapacity()));
        tfCapacity.relocate(110, 130);
        tfModel.setOnKeyPressed(e -> {
            if(e.getCode() == ENTER){
                vehicle.setIdentificationNumber(tfIdentificationNumber.getText());
                vehicle.setBrand(tfBrand.getText());
                vehicle.setModel(tfModel.getText());
                vehicle.setCapacity(Integer.parseInt(tfCapacity.getText()));
                eVController.updateVehicleEntry(vehicleEntry, vehicle);
            }
        });
        root.getChildren().addAll(tfIdentificationNumber, tfBrand, tfModel);
        return root;
    }
}
