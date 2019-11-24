package main;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.awt.Color.RED;

public class ShowVehiclesView {

    private Controller controller = new Controller(this);
    private ListView<HBox> listView = new ListView<>();
    private Pane root = new Pane();

    public ShowVehiclesView(){
        Model.getAllVehicles().add(new Car("XYZ-123", "VW Golf", "VW", 110, "Benzin", new Color(1, 0, 0, 1), 10000, "ABC-613", 5, "Medium", new Date(2019-02-01), 15000.00, new Date(2019-11-20), new Date(9999-12-31), false, 4, "Kleinwagen", true));
        Button btnAdd = new Button("Add");
        btnAdd.setPrefSize(100, 5);
        btnAdd.relocate(700, 640);
        btnAdd.setOnAction(e -> controller.addVehicleAction());
        Button btnRefresh = new Button("Refresh");
        btnRefresh.setOnAction(e -> refresh());
        btnRefresh.relocate(600, 640);
        Label label = new Label(Model.getAllVehicles().get(0).getModel());
        label.setPrefWidth(100);
        HBox vehicleEntry = new HBox();
        vehicleEntry.getChildren().add(label);
        createButtons(vehicleEntry, Model.getAllVehicles().get(0));
        vehicleEntry.setSpacing(100);
        vehicleEntry.setAlignment(Pos.CENTER_LEFT);
        listView.getItems().add(vehicleEntry);
        listView.setPrefSize(800, 600);
        root.getChildren().addAll(listView);
        root.getChildren().addAll(btnAdd, btnRefresh);
    }

    public void refresh(){
        listView.getItems().clear();
        for(Vehicle vehicle:Model.getAllVehicles()){
            addVehicleEntry(vehicle);
        }
    }

    public Parent getRoot() {
        return root;
    }

    public void addVehicleEntry(Vehicle vehicle){
        Label lblModel = new Label(vehicle.getModel());
        lblModel.setPrefWidth(100);
        HBox vehicleEntry = new HBox();
        vehicleEntry.getChildren().add(lblModel);
        createButtons(vehicleEntry, vehicle);
        vehicleEntry.setSpacing(100);
        vehicleEntry.setAlignment(Pos.CENTER_LEFT);
        listView.getItems().add(vehicleEntry);
    }

    public void createButtons(Pane vehicleEntry, Vehicle vehicle){
        Button btnShowDetails = new Button("Details");
        Button btnEdit = new Button("Edit");
        Button btnDelete = new Button("Delete");
        List<Button> buttonList = new ArrayList<>();
        buttonList.add(btnShowDetails);
        buttonList.add(btnEdit);
        buttonList.add(btnDelete);
        for(Button button:buttonList){
            button.setPrefWidth(100);
        }

        HBox buttons = new HBox();
        buttons.getChildren().addAll(buttonList);
        buttons.setSpacing(5);
        btnShowDetails.setOnAction(e -> controller.showDetailsAction());
        btnEdit.setOnAction(e -> controller.editVehicleAction(vehicleEntry, vehicle));
        btnDelete.setOnAction(e -> controller.deleteVehicleAction(vehicleEntry, vehicle));
        vehicleEntry.getChildren().add(buttons);
    }

    public void deleteVehicleEntry(Parent vehicleEntry, Vehicle vehicle){
        listView.getItems().remove(vehicleEntry);
        Model.getAllVehicles().remove(vehicle);
    }

    public void updateVehicleEntry(Pane vehicleEntry, Vehicle vehicle){
        Label lblModel = new Label(vehicle.getModel());
        lblModel.setPrefWidth(100);
        vehicleEntry.getChildren().set(0, lblModel);
    }

    public Controller getController(){
        return controller;
    }
}
