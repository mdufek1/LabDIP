package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;

    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param hourlyRate -- think carefully about this
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param totalHrsForYear -- think carefully about this
     */
    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }
    

    @Override
    public double getWages(TimePeriod time) {
        double wages = 0.00;

        switch(time) {
            case ANNUALLY:
                wages = hourlyRate * totalHrsForYear;
                break;
            case MONTHLY:
                wages = (hourlyRate * totalHrsForYear)/12;
                break;
            case WEEKLY:
                wages = (hourlyRate * totalHrsForYear)/(365/7);
                break;
        }

        return wages;
    }

}
