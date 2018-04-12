package management;

import staff.Employee;

public class Manager extends Employee  {
    private String deptName; //This could be a good moment to create an Enum

    public Manager(String name, String niNumber, double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
