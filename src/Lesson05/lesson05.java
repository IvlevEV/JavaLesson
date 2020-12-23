package Lesson05;

public class lesson05 {


    public static void main(String[] args){


        Employee[] employees = getEmployees();


        for (int i = 0; i < employees.length; i++) {
            employees[i].getAge();
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].toString());
            }
        }
    }

    static Employee[] getEmployees() {
        return new Employee[] {
                new Employee("Vasa",45),
                new Employee("Kolia",35),
                new Employee("Sergy Testovoch",42),
                new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312L, 35000.40F, 30),
                new Employee("Fralov Sergey", "Engineer", "fralov@mailbox.com",89953121715L, 750000, 35),
                new Employee("Haraton Yrivech Puskin", "Oldman", "oldman@gmal.com",89009001122L, 19500, 71)
        };
    }
}
