import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        if (isBinary(a) && isBinary(b)) {
            int and = a & b;
            int or = a | b;
            System.out.println("AND operation result: " + and);
            System.out.println("OR operation result: " + or);
        } else {
            System.out.println("The given numbers are not valid. Enter only numbers containing 0s and 1s.");
        }
    }


    public static boolean isBinary(int num) {
        if (num == 0) return true;
        while (num > 0) {
            if (num % 10 != 0 && num % 10 != 1) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
