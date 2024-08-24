package Design.Specification2;

public class MyUtility {
    public static boolean isValidAddress(Address address)
    {
        boolean response = false;
        int pinCode = address.getPincode();
        int flatNumber = address.getFlatNumber();
        if(flatNumber>=1)
        {
        if(pinCode<=999999 && pinCode>100000){
            response = true;
        }
        }
        return response;
    }
    public static boolean isValidPanCard(Employee employee)
    {
        boolean response = false;
        String pan = employee.getPanCardNumber();
        String name = employee.getName();
        String[] name1 = name.split(" ");
        char[] ch = pan.toCharArray();
        if((ch[3] == 'P' || ch[3] == 'p') && (ch[4]==(name1[1].charAt(0))))
        {
            response = true;
        }
        return response;
    }
}
