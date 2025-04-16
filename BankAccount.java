import java.util.Scanner;

public class BankAccount {

    static class LowBalanceException extends Exception {
        public LowBalanceException(String message) {
            super(message);
        }
    }

    static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    static class Account {
        Scanner sc = new Scanner(System.in);
        float amt1 = 100000;
        float amt2 = 200000;

        public void balanceEnquiry() {
            System.out.print("Please Enter your account number: ");
            int acc = sc.nextInt();
            if (acc == 1254) {
                System.out.println("Current amount is " + amt1);
            } else if (acc == 2123) {
                System.out.println("Current amount is " + amt2);
            } else {
                System.out.println("Sorry, account not found.");
            }
        }

        public void deposit() {
            try {
                System.out.print("Please Enter your account number: ");
                int acc = sc.nextInt();
                System.out.print("Please enter how much you want to deposit: ");
                int dep = sc.nextInt();

                if (dep < 0) {
                    throw new NegativeNumberException("Deposit amount cannot be negative!");
                }

                if (acc == 1254) {
                    amt1 += dep;
                    System.out.println("Deposit successful. Current amount is " + amt1);
                } else if (acc == 2123) {
                    amt2 += dep;
                    System.out.println("Deposit successful. Current amount is " + amt2);
                } else {
                    System.out.println("Sorry, account not found.");
                }
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        public void withdraw() {
            try {
                System.out.print("Please Enter your account number: ");
                int acc = sc.nextInt();
                System.out.print("Please enter how much you want to withdraw: ");
                int withdrawAmt = sc.nextInt();

                if (withdrawAmt < 0) {
                    throw new NegativeNumberException("Withdrawal amount cannot be negative!");
                }

                if (acc == 1254) {
                    if (withdrawAmt > amt1) {
                        throw new LowBalanceException("Insufficient balance!");
                    }
                    amt1 -= withdrawAmt;
                    System.out.println("Withdrawal successful. Current amount is " + amt1);
                } else if (acc == 2123) {
                    if (withdrawAmt > amt2) {
                        throw new LowBalanceException("Insufficient balance!");
                    }
                    amt2 -= withdrawAmt;
                    System.out.println("Withdrawal successful. Current amount is " + amt2);
                } else {
                    System.out.println("Sorry, account not found.");
                }
            } catch (NegativeNumberException | LowBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.balanceEnquiry();
                    break;
                case 2:
                    account.deposit();
                    break;
                case 3:
                    account.withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
