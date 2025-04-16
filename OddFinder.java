import java.util.Scanner;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddFinder {
    public void checkNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Error: The number " + number + " is odd!");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OddFinder finder = new OddFinder();

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        try {
            finder.checkNumber(num);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

