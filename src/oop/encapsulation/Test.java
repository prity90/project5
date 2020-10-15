package oop.encapsulation;

public class Test {
    public static void main(String[] args) {

        Student s =new Student();
        s.setName("Sam");
        s.setAge(21);
        System.out.println("Student Name:"+ s.getName());
        System.out.println("Student Age:"+ s.getAge());
    }

}
