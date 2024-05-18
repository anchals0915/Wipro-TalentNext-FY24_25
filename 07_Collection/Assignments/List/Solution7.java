
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Write a program that will have a Vector which is capable 
 * of storing Employee objects. Use an Iterator ans enumeration 
 * to list all the elements of the vector 
 */

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void getEmployeeDetails() {
        System.out.println("\tDetails\t");
        System.out.println("Employee id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee Email : " + email);
        System.out.println("Employee Gender : " + gender);
        System.out.println("Employee Salary : " + salary);
    }

}

public class Solution7 {
    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();

        // Adding some employee objects to the vector
        employees.add(new Employee(1, "John Doe", "john@example.com", "Male", 50000));
        employees.add(new Employee(2, "Jane Smith", "jane@example.com", "Female", 60000));

        System.out.println("Listing employees using Enumeration:");
        Enumeration<Employee> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            Employee employee = enumeration.nextElement();
            System.out.println(employee.empId + " " + employee.empName);
        }

        System.out.println("\nListing employees using Iterator:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.empId + " " + employee.empName);
        }
    }
}
