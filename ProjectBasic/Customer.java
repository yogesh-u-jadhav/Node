package ProjectBasic;

import java.util.Scanner;

public class Customer implements Runnable{

    String m1;
    Account x1;

    Customer(Account j1, String h1){

        x1 = j1;
        m1 = h1;
 
    }

    public void run(){

        Scanner s1 = new Scanner(System.in);

        synchronized(x1){           //syncronized methode or block of x1

        System.out.println("Enter amount to withdrow fo :"+ m1+ " :");

        int amt = s1.nextInt();

        if (x1.isSufficeantBal(amt)) {
            
            x1.withdrow(amt, m1);

        }else{

            System.out.println("Insufficent Balence");

        }s1.close();
    }
    }
}
