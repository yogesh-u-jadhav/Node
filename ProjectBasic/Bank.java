package ProjectBasic;

import java.util.Scanner;

public class Bank extends Thread{
    Scanner sc = new Scanner(System.in);

    
    public void Account1()
    {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        while (true) {
            
        
        double Balance = 10000;
        

        System.out.println("Welcome mr. Yogesh Jadhav");
        System.out.println("PRESS 1 DEPOSITE BALENCE.");
        System.out.println("PRESS 2 WITHDROW BALENCE.");
        System.out.println("PRESS 3 ACCOUNT DETAILS BALENCE.");
        System.out.println("PRESS 4 EXIT.");
        System.out.print("ENTER THE VALUE :");
        int Button = sc.nextInt();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        if (Button == 1) {
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();
                if (deposit > 0) {
                    Balance += deposit;
                    System.out.println("Amount deposited successfully. :" + deposit +" Current Balance :"+Balance);
                } else {
                    System.out.println("Invalid amount. Must be greater than 0.");
                }
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        
        if (Button == 2) {

            System.out.print("Enter amount to withdrow: ");
                double withdrow = sc.nextDouble();

                if (withdrow <= Balance) {

                    Balance -= withdrow;
                    System.out.println("Amount withdrow successfully." + withdrow +" Current Balance :"+Balance);
                    
                } else {
                    System.out.println("Insufficent Balance.");
                }
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

             if (Button == 3) {

            System.out.print("Welcome Yogesh Jadhav ");
            System.out.print("Your Current Balance: "+ Balance);

            } else if (Button == 4) {
                System.out.println("Thank you for banking with us.");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }
    

    public void Account2()
    {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        while (true) {
            
        
        double Balance = 20000;
        

        System.out.println("Welcome mr. Omkar Solunke");
        System.out.println("PRESS 1 DEPOSITE BALENCE.");
        System.out.println("PRESS 2 WITHDROW BALENCE.");
        System.out.println("PRESS 3 ACCOUNT DETAILS BALENCE.");
        System.out.println("PRESS 4 EXIT.");
        System.out.print("ENTER THE VALUE :");
        int Button = sc.nextInt();

        if (Button == 1) {
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();
                if (deposit > 0) {
                    Balance += deposit;
                    System.out.println("Amount deposited successfully." + deposit +" Current Balance :"+Balance);
                } else {
                    System.out.println("Invalid amount. Must be greater than 0.");
                }
            }

            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        if (Button == 2) {

            System.out.print("Enter amount to withdrow: ");
                double withdrow = sc.nextDouble();

                if (withdrow <= Balance) {

                    Balance -= withdrow;
                    System.out.println("Amount withdrow successfully." + withdrow +" Current Balance :"+Balance);
                    
                } else {
                    System.out.println("Insufficent Balance.");
                }
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

             if (Button == 3) {

            System.out.print("Welcome Yogesh Jadhav ");
            System.out.print("Your Current Balance: "+ Balance);

            } else if (Button == 4) {
                System.out.println("Thank you for banking with us.");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public void Account3()
    {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        while (true) {
            
        
        double Balance = 30000;
        

        System.out.println("Welcome mr. Shivanand Yearty");
        System.out.println("PRESS 1 DEPOSITE BALENCE.");
        System.out.println("PRESS 2 WITHDROW BALENCE.");
        System.out.println("PRESS 3 ACCOUNT DETAILS BALENCE.");
        System.out.println("PRESS 4 EXIT.");
        System.out.print("ENTER THE VALUE :");
        int Button = sc.nextInt();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        if (Button == 1) {
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();
                if (deposit > 0) {
                    Balance += deposit;
                    System.out.println("Amount deposited successfully." + deposit +" Current Balance :"+Balance);
                } else {
                    System.out.println("Invalid amount. Must be greater than 0.");
                }
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        
        if (Button == 2) {

            System.out.print("Enter amount to withdrow: ");
                double withdrow = sc.nextDouble();

                if (withdrow <= Balance) {

                    Balance -= withdrow;
                    System.out.println("Amount withdrow successfully." + withdrow +" Current Balance :"+Balance);
                    
                } else {
                    System.out.println("Insufficent Balance.");
                }
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

             if (Button == 3) {

            System.out.print("Welcome Yogesh Jadhav ");
            System.out.print("Your Current Balance: "+ Balance);

            } else if (Button == 4) {
                System.out.println("Thank you for banking with us.");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public void run(){

        Bank b = new Bank();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        while (true) {

        System.out.println(" Enter 4 Digit PIN...!!");

        System.out.print("--> ");

        int PIN = sc.nextInt();

        if(PIN == 1122)
        {

            b.Account1();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        }else if (PIN == 2233) {

             b.Account2();
             System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
        }else if (PIN == 3344) {

            b.Account3();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
        }else if(PIN >= 5){
            try{

            throw new IndexOutOfBoundsException("Your PIN IS FOUR DIGIT");

            }catch(Exception e){

                System.out.println("Warnning your pin is less than 5 digit");

            }
        }
        else
        {

            System.out.println("Invalid PIN. Please try again.");

        }
           System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    }
}
