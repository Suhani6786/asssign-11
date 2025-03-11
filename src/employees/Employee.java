package employees;

public abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    // Constructor Overloading
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 0.0;
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Abstract method
    public abstract void work();

    // Method Overloading
    public void displayInfo() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: $" + salary);
    }

    public void displayInfo(boolean showSalary) {
        System.out.println("Employee: " + name + ", ID: " + id);
        if (showSalary) {
            System.out.println("Salary: $" + salary);
        }
    }
}
