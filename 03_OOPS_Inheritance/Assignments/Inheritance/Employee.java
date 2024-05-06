public class Employee extends Person {

    private double annualSalary;
    private String startingYear;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, String startingYear, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.startingYear = startingYear;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getStartingYear() {
        return startingYear;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }
}
