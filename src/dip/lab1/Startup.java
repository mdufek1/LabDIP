package dip.lab1;

import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author mdufek1
 */
public class Startup {

    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
        HourlyEmployee emp1 = new HourlyEmployee(10.50, 2020);
        SalariedEmployee emp2 = new SalariedEmployee(45000, 1250);
        SalariedEmployee emp3 = new SalariedEmployee(90000,0);
        Employee[] employeeList = {emp1, emp2, emp3};
        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        for(int i = 0; i<employeeList.length; i++){
           System.out.println("Employee "+(i+1)+" annual compensation: " +
            nf.format(hr.getEmployeeWages(employeeList[i],TimePeriod.ANNUALLY)));
           
        }
//        // Test input/output..
//        System.out.println("Employee 1 annual compensation: " +
//            nf.format(hr.getEmployeeWages(emp1,TimePeriod.ANNUALLY)));
//        
//        System.out.println("Employee 2 annual compensation: " +
//            nf.format(hr.getEmployeeWages(emp2,TimePeriod.ANNUALLY)));
//        
//        System.out.println("Employee 3 annual compensation: " +
//            nf.format(hr.getEmployeeWages(emp3, TimePeriod.ANNUALLY)));
        
    }

}
