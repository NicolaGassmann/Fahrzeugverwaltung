package main;

public class AddVehicleController {

    private AddVehicleView addVehicleView;
    private ShowVehiclesView showVehiclesView;

    public AddVehicleController(AddVehicleView addVehicleView, ShowVehiclesView showVehiclesView){
        this.addVehicleView = addVehicleView;
        this.showVehiclesView = showVehiclesView;
    }

    public void updateVehicleEntry(Vehicle vehicle){
        showVehiclesView.getController().addVehicleToView(vehicle);
        SceneController.setRoot(showVehiclesView.getRoot());
    }
}
