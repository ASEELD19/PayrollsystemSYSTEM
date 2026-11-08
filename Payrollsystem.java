
package payrollsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Payrollsystem {

    
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee( "101", "Ahmed", 5000, LocalDate.of(2022, 5, 10), 1000));
        employees.add(new FullTimeEmployee("102", "Sara", 6000,  LocalDate.of(2021, 3, 15), 1500));
        employees.add(new ContractorEmployee( "103", "Ali", LocalDate.of(2023, 7, 20), 50, 100));
        employees.add(new ContractorEmployee( "104", "Mona", LocalDate.of(2020, 2, 5), 60, 120));
        System.out.println("Employees List:");
        
        for (Employee e : employees) {  System.out.println(e);  }
        Collections.sort(employees);
        System.out.println("\nSorted by Base Salary:");
        
        for (Employee e : employees) { System.out.println(e); }
        
        employees.sort(Comparator.comparing(Employee::getJoinDate));
        System.out.println("\nSorted by Join Date:");
        
        for (Employee e : employees) { System.out.println(e); }

        double totalCost = 0;
        System.out.println("\nPayroll Details:");

        for (Employee e : employees) {
            double score = 4.5;
            double tax = e.calculateTax();
            double bonus = e.calculateBonus(score);
            double netSalary = e.calculateNetSalary();
            System.out.println("\n" + e.getName());
            System.out.println("Net Salary: " + netSalary);
            System.out.println("Tax: " + tax);
            System.out.println("Bonus: " + bonus);
            totalCost += netSalary + tax + bonus;   }
 System.out.println("\nTotal Payroll Cost: " + totalCost);
}  }
    
    

