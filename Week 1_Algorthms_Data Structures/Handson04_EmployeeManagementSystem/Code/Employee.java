import java.util.Scanner;

public class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    static final int MAX = 100;
    static Employee[] employees = new Employee[MAX];
    static int count = 0;

    public Employee() {}

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Add an employee
    public static void addEmployee(int id, String name, String position, double salary) {
        if (count >= MAX) {
            System.out.println("Employee array is full!");
            return;
        }
        employees[count++] = new Employee(id, name, position, salary);
    }

    // Search employee by ID
    public static Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse all employees
    public static void traverseEmployees() {
        if (count == 0) {
            System.out.println("No employee records found.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID
    public static void deleteEmployee(int id) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[count - 1] = null;
        count--;
        System.out.println("Employee deleted.");
    }

    @Override
    public String toString() {
        return "[ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary + "]";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        addEmployee(1, "Ram", "Developer", 50000);
        addEmployee(2, "Sneha", "Designer", 60000);
        addEmployee(3, "Amit", "Manager", 70000);

        System.out.println("\nAll Employees:");
        traverseEmployees();

        System.out.print("\nEnter employee ID to search: ");
        int sid = sc.nextInt();
        Employee result = searchEmployee(sid);
        System.out.println(result != null ? "Found: " + result : "Employee not found.");

        System.out.print("\nEnter employee ID to delete: ");
        int did = sc.nextInt();
        deleteEmployee(did);

        System.out.println("\nEmployees after deletion:");
        traverseEmployees();

        sc.close();
    }
}
