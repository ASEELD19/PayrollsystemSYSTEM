/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;
import java.time.LocalDate;
/**
 *
 * @author HP
 */
public abstract class Employee implements Comparable<Employee>, Taxable, BonusCalculable{
     private final String id;
    private final String name;
    protected double baseSalary;
    private final LocalDate joinDate;

    public Employee(String id, String name, double baseSalary, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.joinDate = joinDate;    }

    public abstract double calculateNetSalary();
    protected abstract double calculateGrossSalary();

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.baseSalary, other.baseSalary);    }

    @Override
    public double calculateTax() { return calculateGrossSalary() * TAX_RATE;   }
    public String getId() { return id;   }
    public String getName() {return name; }
    public double getBaseSalary() {return baseSalary;}
    public LocalDate getJoinDate() {return joinDate;  }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name +", Base Salary: " + baseSalary +", Join Date: " + joinDate;   }
}
