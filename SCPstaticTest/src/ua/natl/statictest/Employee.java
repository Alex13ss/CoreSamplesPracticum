package ua.natl.statictest;

public class Employee {

    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee() {
    }

    public Employee(double s) {
        this("Employee # " + nextId, s);
    }

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
        id = 0;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static void main(String... args) {
        Employee e = new Employee("Alex", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }

}
