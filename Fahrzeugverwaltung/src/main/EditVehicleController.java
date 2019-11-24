package main;

import javafx.scene.layout.Pane;

public class EditVehicleController {
    private EditVehicleView editVehicleView;
    private ShowVehiclesView showVehiclesView;

    public EditVehicleController(EditVehicleView editVehicleView, ShowVehiclesView showVehiclesView){
        this.editVehicleView = editVehicleView;
        this.showVehiclesView = showVehiclesView;
    }

    public void updateVehicleEntry(Pane vehicleEntry, Vehicle vehicle){
        showVehiclesView.getController().updateVehicleAction(vehicleEntry, vehicle);
        SceneController.setRoot(showVehiclesView.getRoot());
    }
}
