package com.imooc;

public class Employee {
    private String name;
    private int salary;
    private int id;

    public Employee(String name, int salary, int id) {
        this.setName(name);
        this.setId(id);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
