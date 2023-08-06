import java.util.HashMap;
import java.util.Map;

public class ATM_Operation {
    ATM atm = new ATM();
    Map<Double,String> ministmt = new HashMap<>();

    public void viewBalance(){
        System.out.println("Available Balance : "+atm.getBalance());

    }
    public void withdrawAmount(double WithdrawAmount){
        if(WithdrawAmount%500==0) {
            if (WithdrawAmount <= atm.getBalance()) {
                ministmt.put(WithdrawAmount, "Amount Withdrawn");
                System.out.println("Collect The Cash " + WithdrawAmount);
                atm.setBalance(atm.getBalance() - WithdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance !!!");
            }
        }
        else{
            System.out.println("Please Enter The Amount in Multiple of 500");
        }

    }
    public void depositAmount(double depositAmount){
        ministmt.put(depositAmount, "Amount Deposited");
        System.out.println(depositAmount+"Deposited Successfully!!!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }
    public void viewMiniStatement(){
        for(Map.Entry<Double,String> m:ministmt.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
