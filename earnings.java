import java.util.Scanner;

public class earnings {
    public static void main(String[] args) {
        System.out.println("How much can you spend?");
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        int day = 1;
        double closingPrice;

        while (true) {
            system.out.println("Enter the closing price for day " + day + " (any negative value to leave: ");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0)
                break;
        }

    }
}