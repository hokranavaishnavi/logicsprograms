package logics.corejavaApplication;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Crud manager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n====== EMPLOYEE MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();  // consume newline
            } catch (Exception e) {
                System.out.println("Invalid choice. Please enter a number 1-5.");
                sc.nextLine(); // clear buffer
                continue;
            }

            switch (choice) {
                case 1:
                    manager.addRec();
                    break;
                case 2:
                    manager.viewRec();
                    break;
                case 3:
                    manager.updateRec();
                    break;
                case 4:
                    manager.deleteRec();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting Program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
                    break;
            }
        }

        sc.close();
    }
}

interface Crud {
    void addRec();

    void viewRec();

    void updateRec();

    void deleteRec();
}

class EmployeeApplication {
    private int id;
    private String name;
    private String dept;
    private double sal;

    public EmployeeApplication(int id, String name, String dept, double sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "EmployeeApplication { id=" + id + ", name='" + name + "', dept='" + dept + "', sal=" + sal + " }";
    }

    public void display() {
        System.out.printf("%-10d %-20s %-15s %-10.2f\n", id, name, dept, sal);
    }
}

class EmployeeManager implements Crud {
    private EmployeeApplication[] arr = new EmployeeApplication[5];
    private int count = 0;
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addRec() {
        if (count >= arr.length) {
            System.out.println("Size is full. Cannot add more employees.");
            return;
        }

        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            // Duplicate ID check
            for (int i = 0; i < count; i++) {
                if (arr[i].getId() == id) {
                    System.out.println("Employee with ID " + id + " already exists. Add cancelled.");
                    return;
                }
            }

            arr[count++] = new EmployeeApplication(id, name, dept, sal);
            System.out.println("Employee added successfully!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            sc.nextLine();  // clear buffer
        }
    }

    @Override
    public void viewRec() {
        if (count == 0) {
            System.out.println("No employee records found!");
            return;
        }
        System.out.println("\n--- Employee List ---");
        System.out.printf("%-10s %-20s %-15s %-10s\n", "ID", "Name", "Dept", "Salary");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            arr[i].display();
        }
    }

    @Override
    public void updateRec() {
        if (count == 0) {
            System.out.println("No employees to update!");
            return;
        }
        try {
            System.out.print("Enter Employee ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (arr[i].getId() == id) {
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new department: ");
                    String newDept = sc.nextLine();

                    System.out.print("Enter new salary: ");
                    double newSal = sc.nextDouble();
                    sc.nextLine();

                    arr[i].setName(newName);
                    arr[i].setDept(newDept);
                    arr[i].setSal(newSal);

                    System.out.println("Employee updated successfully!");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Employee not found!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Update aborted.");
            sc.nextLine();
        }
    }

    @Override
    public void deleteRec() {
        if (count == 0) {
            System.out.println("No employees to delete!");
            return;
        }
        try {
            System.out.print("Enter Employee ID to delete: ");
            int id = sc.nextInt();
            sc.nextLine();

            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (arr[i].getId() == id) {
                    for (int j = i; j < count - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[count - 1] = null;
                    count--;
                    System.out.println("Employee deleted successfully!");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Employee not found!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Delete aborted.");
            sc.nextLine();
        }
    }
}
