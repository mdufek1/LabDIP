package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private double minBill = 0.00;
    private String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + minBill;

    private double bill;

    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }
    
    @Override
    public double calculateTip(){
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public double getMinBill() {
        return minBill;
    }

    public void setMinBill(double minBill) {
        this.minBill = minBill;
        this.BILL_ENTRY_ERR = "Error: bill must be greater than or equal to " + minBill;
    }

    
    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    @Override
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }


}
