package ru.j4j.reflection;

import lombok.Getter;
import lombok.Setter;

public class Employee {
    public int id;
    public String name;
    public String department;
    @Setter
    @Getter
    private double salary;


    public Employee() {
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void increaseSalary(double salary, int percentage) {
        this.salary *= percentage;
    }

    private void changeDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.println("Department changed to " + newDepartment);
    }

    @Override
    public String toString() {
        String sb = "Employee has is{" + "id=" + id
                + ", name='" + name + '\''
                + ", department='" + department + '\''
                + ", salary=" + salary
                + '}';
        return sb;
    }
}
