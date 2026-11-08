
package payrollsystem;
import java.time.LocalDate;

public class FullTimeEmployee extends Employee  {
    private final double allowance;
    public FullTimeEmployee(String id, String name, double baseSalary, LocalDate joinDate, double allowance) {
        super(id, name, baseSalary, joinDate);
        this.allowance = allowance;   }

    

    @Override
    protected double calculateGrossSalary() { return baseSalary + allowance;  }
    @Override
    public double calculateNetSalary() {return calculateGrossSalary() - calculateTax();}
    @Override
    public double calculateBonus(double performanceScore) {
        if (performanceScore >= 4.0) {
            return baseSalary * 0.10; }
 return 0;   }
    @Override
    public String toString() { return super.toString() +", Allowance: " + allowance;}
}
