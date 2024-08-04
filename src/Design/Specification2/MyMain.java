package Design.Specification2;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        int flatNumber,pinCode;
        String buildingName,locality,city,district,state,country;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter flat number: ");
        flatNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the buildingName: ");
        buildingName = scanner.nextLine();
        System.out.print("Enter the locality: ");
        locality = scanner.nextLine();
        System.out.print("Enter the city: ");
        city = scanner.nextLine();
        System.out.print("Enter the district: ");
        district = scanner.nextLine();
        System.out.print("Enter the state: ");
        state = scanner.nextLine();
        System.out.print("Enter the country: ");
        country = scanner.nextLine();
        System.out.print("Enter the pinCode: ");
        pinCode = scanner.nextInt();
        Address address = new Address(flatNumber,buildingName,locality,city,district,state,country,pinCode);
        System.out.println("Full address : "+address.fullAddress());

        if(MyUtility.isValidAddress(address)) {
            System.out.println("Valid Address");
        }
        else{
            System.out.println("Invalid Address");
        }
        String name,email,panCardNumber,mobile,permanetAdd,presentAdd,communicationAdd;
        scanner.nextLine();
        System.out.print("Enter the name: ");
        name = scanner.nextLine();
        System.out.print("Enter the email: ");
        email = scanner.nextLine();
        System.out.print("Enter the panCardNumber: ");
        panCardNumber = scanner.nextLine();
        System.out.print("Enter the mobile: ");
        mobile = scanner.nextLine();
        System.out.print("Enter the permanent Address: ");
        permanetAdd = scanner.nextLine();
        System.out.print("Enter the present Address: ");
        presentAdd = scanner.nextLine();
        System.out.print("Enter the communication Address: ");
        communicationAdd = scanner.nextLine();
        Employee employee = new Employee(name,email,panCardNumber,mobile,permanetAdd,presentAdd,communicationAdd);
        System.out.println("Employee Details: "+employee.EmplyeeDetails());
        if(MyUtility.isValidPanCard(employee))
        {
            System.out.println("Valid PAN number");
        }
        else{
            System.out.println("invalid PAN number");
        }
    }
}
