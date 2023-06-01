package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class OrderController implements Initializable {
    
    @FXML
    double item1, item2, item3;

    @FXML
    Pane p1, p2, p3;

    @FXML
    Label name1, name2, name3, price1, price2, price3, total, q1, q2, q3;

    @FXML
    VBox myvbox;

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    // For item visibility
        if (HomeController.blamp.getProductStatus()){
        
        p1.setVisible(true);
        name1.setText(HomeController.blamp.getProductName());
        price1.setText(Double.toString((HomeController.blamp.getProductQuantity()) * (HomeController.blamp.getProductPrice())));
        q1.setText(Double.toString(HomeController.blamp.getProductQuantity()));

         }

         if (HomeController.clamp.getProductStatus()){

        p2.setVisible(true);
        name2.setText(HomeController.clamp.getProductName());
        price2.setText(Double.toString((HomeController.clamp.getProductQuantity()) * (HomeController.clamp.getProductPrice())));
        q2.setText(Double.toString(HomeController.clamp.getProductQuantity()));

         }

        if (HomeController.wlamp.getProductStatus()){

        p3.setVisible(true);
        name3.setText(HomeController.wlamp.getProductName());
        price3.setText(Double.toString((HomeController.wlamp.getProductQuantity()) * (HomeController.wlamp.getProductPrice())));
        q3.setText(Double.toString(HomeController.wlamp.getProductQuantity()));
    
         }

    // Set total initial amount
    double totalInitialAmount = 0.00;
    if (HomeController.clamp.getProductStatus() || HomeController.blamp.getProductStatus() || HomeController.wlamp.getProductStatus()) {
       
        totalInitialAmount = 
            HomeController.blamp.getProductQuantity() * HomeController.blamp.getProductPrice() +
        +   HomeController.clamp.getProductQuantity() * HomeController.clamp.getProductPrice()
        +   HomeController.wlamp.getProductQuantity() * HomeController.wlamp.getProductPrice();
    }

    // Display total initial amount in total label
    total.setText(Double.toString(totalInitialAmount));

}

    public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }

}


