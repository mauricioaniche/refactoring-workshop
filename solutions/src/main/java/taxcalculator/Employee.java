package taxcalculator;

import java.util.Calendar;

public class Employee {

    private int id;
    private String name;
    private Role role;
    private Calendar admissionDate;
    private double baseSalary;

    public Employee(int id, String name, Role role, Calendar admissionDate, double baseSalary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.admissionDate = admissionDate;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Role getRole() {
        return role;
    }
    public Calendar getAdmissionDate() {
        return admissionDate;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

}