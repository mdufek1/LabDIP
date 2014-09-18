package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author mdufek1
 */
public class SalariedEmployee implements Employee{
    private double annualSalary;
    private double annualBonus;

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }
    /**
     * Returns annual bonus for salaried workers. Is this polymorphic?
     * Could it be? Does it belong here?
     *
     * @return annual bonus or zero if none.
     */
    public double getAnnualBonus() {
        return annualBonus;
    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param annualBonus -- think carefully about this
     */
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param annualSalary - think carefully about this
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double getWages(TimePeriod time) {
        double wages = 0.00;

        switch(time) {
            case ANNUALLY:
                wages = annualBonus+annualSalary;
                break;
            case MONTHLY:
                wages = (annualSalary)/12;
                break;
            case WEEKLY:
                wages = (annualSalary)/(365/7);
                break;
        }

        return wages;
    }


    
}
