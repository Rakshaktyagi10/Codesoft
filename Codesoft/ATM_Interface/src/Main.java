import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM_Operation op = new ATM_Operation();
        int atmPin = 123;
        int atmNumber = 12345;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Atm Number : ");
        int number = sc.nextInt();
        System.out.print("Enter PIN : ");
        int pin = sc.nextInt();
        if(atmPin==pin && atmNumber==number){
            while (true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Mini Statement\n5.Exit");
                System.out.println("Enter Choice");
                int ch = sc.nextInt();
                if(ch==1){
                    op.viewBalance();

                } else if (ch==2) {
                    System.out.println("Enter Amount To Withdraw");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                } else if (ch==3) {
                    System.out.println("Enter Amount To Deposit");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);

                } else if (ch==4) {
                    op.viewMiniStatement();

                } else if (ch==5) {
                    System.out.println("Collect your ATM Card\n Thank you for using the ATM Machine");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number or Pin");
            System.exit(0 );
        }

    }
}

