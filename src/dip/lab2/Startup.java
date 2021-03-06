package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author mdufek1
 */
public class Startup {

    public static void main(String[] args) {
        TipCalculator calculator = new FoodServiceTipCalculator(ServiceQuality.FAIR,27.59);
//        TipCalculator calculator = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 4);
        TipCalculationService calculationService = new TipCalculationService(calculator);
//        ((FoodServiceTipCalculator)calculator).setMinBill(29.00);
//        ((FoodServiceTipCalculator)calculator).setBill(28.00);
//        System.out.println(((FoodServiceTipCalculator)calculator).getMinBill());
       NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(calculationService.processTip(calculator)));

        
    }

}
