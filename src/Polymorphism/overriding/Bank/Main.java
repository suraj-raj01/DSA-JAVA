package Polymorphism.overriding.Bank;

public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println("SBI Bank Interest Rate : "+sbi.getRateOfInterest());
        System.out.println("ICICI Bank Interest Rate : "+icici.getRateOfInterest());
        System.out.println("AXIS Bank Interest Rate : "+axis.getRateOfInterest());
    }
}
