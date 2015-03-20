package ua.natl.statictest;

public class StaticTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Stui", 78000);
        staff[2] = new Employee("Brian", 32000);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name = " + e.getName() + ", id = " + e.getId()
                    + ", salary = " + e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println("Next available id = " + n);
    }

}
