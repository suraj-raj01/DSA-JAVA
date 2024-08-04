package Inheritance;

public class RBI {
    private String msg = "HELLO RBI CUSTOMERS!!";
    public  RBI() {
        System.out.println(msg);
    }
}
class SBI extends  RBI{
    private String msg1 = "HELLO SBI CUSTOMERS!!";
    public SBI()
    {
        System.out.println(msg1);
    }
}
class PNB extends  SBI{
    private String msg = "HELLO PNB CUSTOMERS!!";
    public PNB()
    {
        System.out.println(msg);
    }
}
class BOB extends PNB{
    private String msg = "HELLO BOB CUSTOMERS!!";
    public BOB()
    {
        System.out.println(msg);
    }
}
class BOI extends BOB{
    private String msg = "HELLO BOI CUSTOMERS!!";
    public BOI()
    {
        System.out.println(msg);
    }
}
