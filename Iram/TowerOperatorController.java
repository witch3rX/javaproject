/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package oopproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author IRAM RIDWAN
 */
public class TowerOperatorController implements Initializable {

    @FXML
    private TextArea notificid;
    @FXML
    private TextField towerid;
    @FXML
    private ImageView imageid;
    @FXML
    private TextArea textareaid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void weatherscene(ActionEvent event) throws Exception {
                
        Parent root = FXMLLoader.load(getClass().getResource("weather.fxml"));

        Stage stage = new Stage();
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void communicationscene(ActionEvent event) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("communication.fxml"));

        Stage stage = new Stage();
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void aircraftscene(ActionEvent event) throws Exception {
                
        Parent root = FXMLLoader.load(getClass().getResource("aircraft.fxml"));

        Stage stage = new Stage();
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void emergencyscene(ActionEvent event) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("emergency.fxml"));

        Stage stage = new Stage();
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } 

    @FXML
    private void monitorscene(ActionEvent event) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("monitor.fxml"));

        Stage stage = new Stage();
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void logoutscene(ActionEvent event) throws Exception {

    }
    
}
