
import java.util.ArrayList;

/*
 * Question 2 : 
 * 1) Create an application for employee management with the following classes : 
 * 
 * a] Create an Employee class with following attributes and behaviors : 
 *      (i) int empId
 *      (ii) String empName
 *      (iii) String email 
 *      (iv) String gender 
 *      (v) float salary 
 *      (vi) void GetEmployeeDetails() -> prints employee details 
 * 
 * b] Create one more class EmployeeDB with the following attributes and behavious.
 *      (  i) ArrayList list ;
 *      ( ii) boolean addEmployee(Employee e) -> adds the employee objectc to the collection 
 *      (iii) boolean deleteEmployee(int empId) -> returns the payslip of the employee with the given empId
 * 
 * Provide implementation for all the methods and test your program 
 * 
 */
class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    void getEmployeeDetails() {
        System.out.println("\tDetails\t");
        System.out.println("Employee id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee Email : " + email);
        System.out.println("Employee Gender : " + gender);
        System.out.println("Employee Salary : " + salary);
    }

}

class EmployeeDB {
    ArrayList<Employee> list;

    EmployeeDB() {
        list = new ArrayList<>();
    }

    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }

        return false;
    }

    String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Payslip of the employee " + e.empName + " with the given empId" + e.empId;
            }
        }

        return "Employee not found.";
    }
}

public class Solution2 {
    public static void main(String[] args) {
        EmployeeDB employeeDB = new EmployeeDB();

        Employee emp1 = new Employee();
        emp1.empId = 1;
        emp1.empName = "Anchal Singh";
        emp1.email = "ansi21cs@cmrit.ac.in";
        emp1.gender = "Female";
        emp1.salary = 12_00_000;

        emp1.getEmployeeDetails();
        employeeDB.addEmployee(emp1);

        Employee emp2 = new Employee();
        emp2.empId = 2;
        emp2.empName = "Anchal Singh";
        emp2.email = "anchals0915@gmail.in";
        emp2.gender = "Female";
        emp2.salary = 24_00_000;
        emp2.getEmployeeDetails();
        employeeDB.addEmployee(emp2);

        employeeDB.deleteEmployee(1);

        System.out.println(employeeDB.showPaySlip(2));
    }
}
