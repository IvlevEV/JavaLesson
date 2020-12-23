package Lesson05;

public class Employee {
    private String name ;
    private String position = "Lazy Person";
    private String e_mail  = "ivanov@IvlevHW.com";
    private long phone_number = 89993335500L;
    private float salary = 1999.99F;
    private int age =18;


    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, String position, String e_mail, long phone_number, float salary, int age) {
        this.name = name;
        this.position = position;
        this.e_mail = e_mail;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", phone_number=" + phone_number +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
