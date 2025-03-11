package departments;

public class Department {
    private String deptName;
    private final int deptCode;

    public Department(String deptName, int deptCode) {
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public String getDeptInfo() {
        return deptName + " (Code: " + deptCode + ")";
    }
}