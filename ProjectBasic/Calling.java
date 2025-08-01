package ProjectBasic;

public class Calling {
    public static void main(String[] args) {


       Bank b = new Bank();

       Thread t = new Thread(b);
       t.start();
       

    }
}
