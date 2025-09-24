
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
    this.numOfDays = numOfDays; 
    this.airFairAmount = airFairAmount; 
    this.carRentalFee = carRentalFee; 
    this.milesDriven = milesDriven; 
    this.parkingFee = parkingFee; 
    this.taxiCharges = taxiCharges; 
    this.registrationFee = registrationFee; 
    this.lodgingCharge = lodgingCharge; 
    }
    
    //total expense 
    public double getTotalExpense() {
        return airFairAmount + carRentalFee + registrationFee 
                + (0.27 * milesDriven ) + parkingFee + 
                taxiCharges  + (lodgingCharge * numOfDays) +
                (numOfDays + 37);
    }
    
    //allowed expense 
    public double getAllowedExpense() {
    return (numOfDays * 37) //meals
            + (numOfDays * 10) 
            + (numOfDays * 20)  // taxi
            + (numOfDays * 95)  // lodging
            + (milesDriven * 0.27)
            + airFairAmount + carRentalFee + registrationFee;
    }
    
    public double getTheExcess() {
        return Math.max(0, getTotalExpense() - getAllowedExpense());
    }

    public double getSaved() {
        return Math.max(0, getAllowedExpense() - getTotalExpense());
    }
}
}
