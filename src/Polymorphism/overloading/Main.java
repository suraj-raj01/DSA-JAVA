package Polymorphism.overloading;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four number : ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        Sum sum = new Sum(a,b,c,d);
        Sum sum1 = new Sum(a,b,c);
        System.out.println("Sum of four number : "+sum.getSumFour());
        System.out.println("Sum of three number : "+sum1.getSumThree());
    }
}
