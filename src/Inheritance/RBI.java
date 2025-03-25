package Inheritance;

public class RBI {
    final String msg = "HELLO RBI CUSTOMERS!!";
    public  RBI() {
        System.out.println(msg);
    }
}
class SBI extends  RBI{
    final String msg1 = "HELLO SBI CUSTOMERS!!";
    public SBI()
    {
        System.out.println(msg1);
    }
}
class PNB extends  SBI{
    final String msg = "HELLO PNB CUSTOMERS!!";
    public PNB()
    {
        System.out.println(msg);
    }
}
class BOB extends PNB{
    final String msg = "HELLO BOB CUSTOMERS!!";
    public BOB()
    {
        System.out.println(msg);
    }
}
class BOI extends BOB{
    final String msg = "HELLO BOI CUSTOMERS!!";
    public BOI()
    {
        System.out.println(msg);
    }
}
