/*
 * Employee Management System 
 * 
 * Create a menu based Java Application with the followng 
 * options 
 * 
 * 1. Add an Employee 
 * 2. display All 
 * 3. Exit 
 * 
 * If option 1 is selected, the application should gather details of the emplyee 
 * like employee name, employee id , designation and salary 
 * and store it in a file 
 * 
 * If option 2 is selected , the application should 
 * display all the employee details 
 * 
 * If option 3 is selected the application should exit 
 * 
 * 
 * Sample Output
 * Main Menu 
 * 1. Add an Employee 
 * 2. Display All 
 * 3. Exit 
 * 1
 * Enter Employee Id : 120 
 * Enter Employee Name : Sudhir 
 * Enter Employee Age : 33 
 * Enter Employee salary : 90000
 * 
 * Main Menu 
 * 1. Add an Employee 
 * 2. Display All 
 * 3. Exit 
 * 2
 * ---Report ---
 * 120 Sudhir 33 90000.0 
 * -- end of Report --- 
 */

import java.io.*;
import java.util.*;

class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}

public class EmployeeManagementSystem {
    private static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        int choice;
        do {
            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    employees.add(new Employee(id, name, age, salary));
                    saveToFile(employees);
                    break;
                case 2:
                    displayAll(employees);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void saveToFile(List<Employee> employees) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Employee emp : employees) {
                writer.println(emp);
            }
            System.out.println("Employee details saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving employee details: " + e.getMessage());
        }
    }

    private static void displayAll(List<Employee> employees) {
        System.out.println("--- Report ---");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println("-- end of Report --");
    }
}