/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4Vedika;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

/**
 *
 * @author 6303129
 */
public class Lab4Vedika extends Application {
     
    
    //input by the user 
     double numOfDays; 
      double airFairAmount; 
      double carRentalFee; 
      double milesDriven;
      double parkingFee; 
      double taxiCharges; 
      double registrationFee; 
      double lodgingCharge;
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage){
        
        Label numOfDaysLabel = new Label("Number of Days : ");
        TextField days = new TextField();
        
        Label airfairAmount = new Label("Amount of AirFair: ");
        TextField airFair = new TextField (); 
        
        Label carRentalLabel = new Label("Car Rental Fee : "); 
        TextField carRental = new TextField();
        
        Label milesDrivenLabel = new Label("Miles Driven : ");
        TextField milesDriventxt = new TextField();
      
        
        Label parkingFeeLabel = new Label ("Parking fee ");
        TextField parkingFeetxt = new TextField();
        
        Label taxiChargesLabel = new Label("Taxi Charges :");
        TextField TAXI = new TextField();
        
        Label registrationFeeLabel = new Label("Registration fee : ");
         TextField registration = new TextField();
        
        Label lodgingChargesLabel = new Label("lodging charges : ");
        TextField lodging = new TextField();
       
        
        
        GridPane root = new GridPane();
        root.add(numOfDaysLabel, 0, 0);
        root.add(carRentalLabel, 0, 1);
        root.add(milesDrivenLabel, 0, 2);
        root.add(parkingFeeLabel, 0, 3);
        root.add(taxiChargesLabel, 0, 4);
        root.add(registrationFeeLabel, 0, 5);
        root.add(lodgingChargesLabel, 0, 6);
        
        //adding the textFields to the gridPane
        root.add(airFair, 1, 0);
        root.add(carRental, 1,1);
        root.add(milesDriventxt, 1,2);
        root.add(parkingFeetxt, 1, 3);
        root.add(TAXI, 1,4);
        root.add(registration, 1,5);
        root.add(lodging, 1,6);
        
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10));
        
     
     
        Scene scene = new Scene(root, 200, 200);
        stage.setScene(scene);
        stage.setTitle("Travel expense Calculator");
        stage.show();
        
        //button to calculate
        Button calculateBtn = new Button ("Calculate");
      
        
        //labels to display the results 
           // --- Labels to display results ---
        Label totalActualLabel = new Label("Total expenses: $0.00");
        Label totalAllowedLabel = new Label("Allowed expenses: $0.00");
        Label excessLabel = new Label("Excess to pay: $0.00");
        Label savedLabel = new Label("Saved: $0.00");
        
       // --- Action when clicking calculate ---
        calculateBtn.setOnAction(e -> {
            // --- Validate inputs ---
            if (!isNumber(days.getText())) {
                showError("Number of days must be a number.");
                return;
            }
            if (!isNumber(airFair.getText())) {
                showError("Airfare must be a number.");
                return;
            }
            if (!isNumber(carRental.getText())) {
                showError("Car rental must be a number.");
                return;
            }
            if (!isNumber(milesDriventxt.getText())) {
                showError("Miles driven must be a number.");
                return;
            }
            if (!isNumber(parkingFeetxt.getText())) {
                showError("Parking fee must be a number.");
                return;
            }
            if (!isNumber(TAXI.getText())) {
                showError("Taxi charges must be a number.");
                return;
            }
            if (!isNumber(registration.getText())) {
                showError("Registration fee must be a number.");
                return;
            }
            if (!isNumber(lodging.getText())) {
                showError("Lodging charges must be a number.");
                return;
            }
          });
        }
                
            private boolean isNumber(String text) {
                if (text == null || text.trim().isEmpty()) {
                    return true; // blank is okay
                }

                text = text.trim(); // remove spaces

                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if ((c < '0' || c > '9') && c != '.') {
                        return false; // not a number
                    }
                }

                  return true; // all characters are digits or a dot
            }

 
             
                private void showError(String message) {
                   System.out.println("ERROR: " + message); // print error in console
    }

    }


    
    


