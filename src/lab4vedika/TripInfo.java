
/**
 *
 * @author 6303129
 */
public class TripInfo {
   double numOfDays; 
     double airFairAmount; 
     double carRentalFee; 
     double milesDriven;
     double parkingFee; 
     double taxiCharges; 
     double registrationFee; 
     double lodgingCharge;
        
    public TripInfo(double numOfDays, double airFairAmount, double carRentalFee, double milesDriven, double parkingFee, double taxiCharges, double registrationFee, double lodgingCharge) 
    {
    this.numOfDays = Double.parseDouble(days.getText()); 
    this.airFairAmount = airFairAmount; 
    this.carRentalFee = carRentalFee; 
    this.milesDriven = milesDriven; 
    this.parkingFee = parkingFee; 
    this.taxiCharges = taxiCharges; 
    this.registrationFee = registrationFee; 
    this.lodgingCharge = lodgingCharge; 
    
}
    public static void main (String[] args) {
     numOfDays=  Double.parseDouble(days.getText());
     airFairAmount = Double.parseDouble(airFair.getText());
     carRentalFee = Double.parseDouble(carRental.getText());
     milesDriven = Double.parseDouble(milesDriventxt.getText());
     parkingFee = Double.parseDouble(parkingFeetxt.getText());
     taxiCharges = Double.parseDouble(TAXI.getText());
     registrationFee = Double.parseDouble(registration.getText());
     lodgingCharge = Double.parseDouble(lodging.getText());
} 
}
