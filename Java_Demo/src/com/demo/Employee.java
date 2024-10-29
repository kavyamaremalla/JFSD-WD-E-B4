package com.demo;

import java.util.Objects;

public class Employee {

    private int employeeId; //primitive

    private String fullName; //non-primitive

    private Double salary; //wrapper

    private Boolean isMarried;

    public Employee(int employeeId, String fullName, Double salary, Boolean isMarried) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public void setMarried(Boolean married) {
        isMarried = married;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", isMarried=" + isMarried +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Objects.equals(fullName, employee.fullName) && Objects.equals(salary, employee.salary) && Objects.equals(isMarried, employee.isMarried);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, fullName, salary, isMarried);
    }
}
