package main;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class Controller {
    private ShowVehiclesView showVehiclesView;

    public Controller(ShowVehiclesView showVehiclesView) {
        this.showVehiclesView = showVehiclesView;
    }

    public void addVehicleAction() {
        AddVehicleView addVehicleView = new AddVehicleView(showVehiclesView);
        SceneController.setRoot(addVehicleView.getRoot());
    }
    public void addVehicleToView(Vehicle vehicle){
        Model.getAllVehicles().add(vehicle);
        showVehiclesView.addVehicleEntry(vehicle);
    }
    public void editVehicleAction(Pane parent, Vehicle vehicle){
        SceneController.setRoot(new EditVehicleView(showVehiclesView, parent, vehicle).getRoot());
    }
    public void updateVehicleAction(Pane parent, Vehicle vehicle) {
        showVehiclesView.updateVehicleEntry(parent, vehicle);
    }
    public void deleteVehicleAction(Parent vehicleEntry, Vehicle vehicle) {
        showVehiclesView.deleteVehicleEntry(vehicleEntry, vehicle);
    }
    public void showDetailsAction() {

    }
}
