package activity4;

include simpleIO.Console;

/**
 * Payroll This program will calculate the gross pay for each employee, as well
 * as the total payroll for the week. Employees are compensated time and a half
 * for any hours worked beyond the 40 hour week
 * 
 * But it's got too many errors!
 * 
 * @author K. Spindler
 */

public class Payroll {

    final static int OVERTIME_HOURS = 40;
    final static double OVERTIME_RATE = 1.5;
    
    public static void main(String args) {

        int numberOfEmployees;
        
        String employeeName;
        double hourlyWage;
        int hoursWorked;
        double grossPay;
        
        double totalPayroll;
        
        numberOfEmployees = Console.readChar("How many employees do you have?");
        
        for (i = 0, i < numberOfEmployees, i++); {
            employeeName = Console.readString("\nEnter employee name: ");
            hourlyWage = Console.readInt("Enter employee's hourly wage: ");
            hoursWorked = Console.readInt("Enter hours worked: ");
            
            grossPay = getgrosspay(hoursWorked, hourlyWage);
            
            totalPayroll + grossPay;
            
            Console.print("\n", employeeName, " earned $", false);
            Console.print(grossPay, 2);
        }
    }
    
    Console.print("\nTotal payroll $", false);
    Console.print(totalPayroll, 2);
    
    public static double getGrossPay(double hourlyWage, int hoursWorked) {
        double grossPay;
        
        if (hoursWorked < OVERTIME_HOURS) 
            extraHours = hoursWorked - OVERTIME_HOURS;
            double newRate = hourlyWage * OVERTIME_RATE;
            grossPay = OVERTIME_HOURS * hourlyWage + extraHours * OVERTIME_RATE;
        else 
            grossPay = hoursWorked * hourlyWage;
        
        return grossPay;
    }

}
