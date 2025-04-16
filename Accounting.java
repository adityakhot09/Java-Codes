import java.util.Scanner;

abstract class bankaccount {
    abstract int deposit();
    abstract int withdraw();
}

class SavingAccount extends bankaccount {
    Scanner sc = new Scanner(System.in);
    int bal = 1000;

    @Override
    int deposit() {
        return 0;
    }

    @Override
    int withdraw() {
        System.out.println("Enter the amount you want to withdraw: ");
        int amt = sc.nextInt();

        if (bal < 100) {
            System.out.println("Cannot proceed. Minimum balance required.");
        } else if (bal < amt) {
            System.out.println("Cannot proceed. Insufficient balance.");
        } else {
            bal = bal - amt;
            System.out.println("Withdrawal successful. Remaining balance: " + bal);
        }

        return bal;
    }
}

public class Accounting {
    public static void main(String[] args) {
        SavingAccount myAccount = new SavingAccount();
        myAccount.withdraw();
    }
}
