import java.util.Scanner;

public class StockTradingPlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stocks = {"TCS", "Infosys", "Wipro"};
        int[] prices = {3500, 1500, 500};
        int[] quantity = {0, 0, 0};
        int balance = 10000;
        int choice;

        do {
            System.out.println("\n===== STOCK MENU =====");
            System.out.println("1. View Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. View Portfolio");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Stocks:");
                    for (int i = 0; i < stocks.length; i++) {
                        System.out.println((i + 1) + ". " + stocks[i] + "- Rs." + prices[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter stock number: ");
                    int s = sc.nextInt() - 1;

                    System.out.print("Enter quantity: ");
                    int q = sc.nextInt();

                    int cost = prices[s] * q;

                    if (cost <= balance) {
                        balance -= cost;
                        quantity[s] += q;
                        System.out.println("Stock purchased!");
                    } else {
                        System.out.println("Not enough balance!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Portfolio ---");
                    System.out.println("Balance: Rs." + balance);

                    for (int i = 0; i < stocks.length; i++) {
                        System.out.println(stocks[i] + ": " + quantity[i] + " shares");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
         sc.close();
    }
}