package activity4;
//Syntax error: the syntax is import not include
import simpleIO.Console;

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
    
    //Syntax error: Must add [] after String
    public static void main(String[] args) {

        int numberOfEmployees;
        
        String employeeName;
        double hourlyWage;
        int hoursWorked;
        double grossPay;
        
        //Syntax error: must give a base value if modified in a loop other method
        double totalPayroll = 0;
        
        //Syntax error: you have to read int not char
        numberOfEmployees = Console.readInt("How many employees do you have?");
        
        // Syntax error: you must declare the counter variable with "Int" 
        // Syntax error: you don't end a loop declaration with a semicolon
        // Syntax error: you separate each element of the loop with a semi colon not a comma
        
        for (int i = 0; i < numberOfEmployees; i++) {
        	
            employeeName = Console.readString("\nEnter employee name: ");
            hourlyWage = Console.readInt("Enter employee's hourly wage: ");
            hoursWorked = Console.readInt("Enter hours worked: ");
            
            //Syntax Error: Capitalization is wrong
            //Logic error: inputs are imported in the wrong order
            grossPay = getGrossPay(hourlyWage, hoursWorked);
            
            //Syntax Error: must use += to change a variable
            totalPayroll += grossPay;
            
            //syntax error: too many arguments, use '+' instead of ','
            Console.print("\n"+employeeName+" earned $", false);
            Console.print(grossPay, 2);
        }
        
        //Syntax error: trying to run script outside of the method
        Console.print("\nTotal payroll $", false);
        Console.print(totalPayroll, 2);
    }
    

    
    public static double getGrossPay(double hourlyWage, int hoursWorked) {
        double grossPay;
        
        //Syntax error: no brackets in if statements
        //Logic error: should check if its greater than overtime hours rather than less than overtime hours
        if (hoursWorked > OVERTIME_HOURS) {
        	//syntax error: must add a declaration for extraHours
            int extraHours = hoursWorked - OVERTIME_HOURS;
            double newRate = hourlyWage * OVERTIME_RATE;
            
            //logic error: should multiply extra hours by new rate rather than overtime rate
            grossPay = OVERTIME_HOURS * hourlyWage + extraHours * newRate;
        }
        else {    
            grossPay = hoursWorked * hourlyWage;
        }
        return grossPay;
    }

}
