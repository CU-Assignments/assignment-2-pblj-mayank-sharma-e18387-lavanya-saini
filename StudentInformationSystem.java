import java.util.Scanner;
abstract class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void displayDetails();
}
class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }
    @Override
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    void displayDetails() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Subject : " + subject);
    }
}
public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Details:");
        System.out.print("Name: ");
        String studentName = sc.nextLine();
        System.out.print("Age: ");
        int studentAge = sc.nextInt();
        System.out.print("Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); 
        Student student = new Student(studentName, studentAge, rollNumber);
        System.out.println("\nEnter Teacher Details:");
        System.out.print("Name: ");
        String teacherName = sc.nextLine();
        System.out.print("Age: ");
        int teacherAge = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Subject: ");
        String subject = sc.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAge, subject);
        student.displayDetails();
        teacher.displayDetails();
        sc.close();
    }
}
