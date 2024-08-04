package Design.Specification1;

import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = scanner.next();
        System.out.print("Enter the last name: ");
        String lastName = scanner.next();
        UserName userName = new UserName();
        userName.setFirstName(firstName);
        userName.setLastName(lastName);
        System.out.println("Full Name : "+userName.getFullName());
        System.out.println("Numbers of vowel in ["+userName.getFullName()+"] : "+MyUtility.countVowel(userName));
        scanner.close();
    }
}
