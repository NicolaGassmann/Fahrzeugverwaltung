package main;

import javafx.scene.Parent;
import javafx.scene.Scene;

public class SceneController {
    private static Scene scene;

    public static Scene getScene(){ return scene; }
    public static void setScene(Scene scene){ SceneController.scene = scene; }
    public static void setRoot(Parent root){ scene.setRoot(root); }
    public static Parent getRoot(){ return scene.getRoot(); }
}
