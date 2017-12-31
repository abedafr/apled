/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author zack
 */
public class Prologjava extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("aPled - By Abed");
        util.Session.setAttribut(stage, "stage"); 
        Parent root = FXMLLoader.load(getClass().getResource("Makequery.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
