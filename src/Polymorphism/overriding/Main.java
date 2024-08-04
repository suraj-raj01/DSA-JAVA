package Polymorphism.overriding;

public class Main {
    public static void main(String[] args) {
    Teacher teacher = new Teacher();
    teacher.msg1();
    teacher.msg2();
    Teacher teacher1 = new Student();
    teacher1.msg1();
    teacher1.msg2();
    }
}
