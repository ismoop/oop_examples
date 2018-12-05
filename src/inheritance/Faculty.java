package inheritance;

public class Faculty extends Employee {


    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }
}

class Employee extends Person {
    public Employee() {
       // this("(2) Invoke Employee's overloaded constructor");
        this(2.0,"abcd");
        System.out.println("(3) Performs Employee's tasks ");



    }

    public static void main(String[] args) {
        new Employee();
    }
    public Employee(String s) {
        System.out.println(s);
    }

    public Employee(Double age,String s)
    {
     System.out.println("(2) Employee with age invoked");
    }
}

class Person {

    public Person(){

    }
    public Person(String s) {
        System.out.println("(1) Performs Person's tasks");
    }
}