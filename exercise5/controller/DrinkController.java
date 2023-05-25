package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinkController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    coffee coffee = new coffee();
    mojito mojito = new mojito();
    smirnoff smirnoff = new smirnoff();
    smartc smartc = new smartc();    
    water water = new water();

    public void initialize() {

        coffee.setFeels("energized");
        coffee.setTaste("sweet and strong");

        mojito.setFeels("chill");
        mojito.setTaste("strong and bitter-sweet");

        smirnoff.setFeels("sleepy");
        smirnoff.setTaste("bitter-sweet");
        
        smartc.setFeels("refreshing");
        smartc.setTaste("sweet");
        
        water.setFeels("alive");
        water.setTaste("sweet");
        
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Iced Coffee makes you feel like " + coffee.getFeels() + " and it taste " + coffee.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Mojito makes you feel like " + mojito.getFeels() + " and it taste " + mojito.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Smirnoff makes you feel like " + smirnoff.getFeels() + " and it taste " + smirnoff.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("SmartC makes you feel like " + smartc.getFeels() + " and it taste " + smartc.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Water makes you feel like " + water.getFeels() + " and it taste " + water.getTaste());
        }

        alert.showAndWait();

    }
}