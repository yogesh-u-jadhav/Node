package ProjectBasic;

public class Account {

    int bal;

    Account(int b){

        bal=b;

    }

    boolean isSufficeantBal(int w){

        if (bal > w) {

            return true;
            
        }
        else
        {

            return false;
        }

    }

    void withdrow(int amt, String g1){

        bal -= amt;

        System.out.println(g1 +" Sucssful withdrow.");
        System.out.println(g1 +" current balence is :"+ bal);
    }
}
