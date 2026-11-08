package payrollsystem;
import java.time.LocalDate;

public class ContractorEmployee extends Employee {
     private final  int hourlyRate;
    private final  int hoursWorked;

    public ContractorEmployee(String id, String name, LocalDate joinDate, int hourlyRate, int hoursWorked) {
        super(id, name, 0, joinDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked; }

    @Override
    protected double calculateGrossSalary() {return hourlyRate * hoursWorked;}
    @Override
    public double calculateNetSalary() {return calculateGrossSalary() - calculateTax();}
    @Override
    public double calculateBonus(double performanceScore) {
        if (performanceScore > 4.0) {
            return 500;
        }return 0; }
    @Override
    public String toString() 
    {
        return super.toString() +", Hourly Rate: " + hourlyRate +", Hours Worked: " + hoursWorked;    }}

