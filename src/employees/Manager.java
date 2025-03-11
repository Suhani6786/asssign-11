package employees;

import departments.Department;
import utilities.Reportable;

public class Manager extends Employee implements Reportable {
    private Department department;

    public Manager(String name, int id, Department department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing department: " + department.getDeptInfo());
    }

    @Override
    public void generateReport() {
        System.out.println(name + " is generating a management report.");
    }
}
