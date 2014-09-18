package dip.lab1;


/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author mdufek1
 */
public class HRService {
    public double getEmployeeWages(Employee employee, TimePeriod time) {
        return employee.getWages(time);
    }
}
