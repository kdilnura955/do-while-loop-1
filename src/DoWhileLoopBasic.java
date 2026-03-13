public class DoWhileLoopBasic {
    public static void main(String[] args) {
        // Basic do-while (always executes at least once)
        System.out.println("=== Basic Do-While ===");
        int count = 1;
        do {
            System.out.println("Iteration: " + count);
            count++;
        } while (count <= 5);

        // Key difference: do-while runs at least once
        System.out.println("\n=== Do-while vs While (condition false from start) ===");
        int x = 10;
        System.out.print("while loop   (x=10, condition x<5): ");
        while (x < 5) System.out.print(x++ + " ");
        System.out.println("(never ran)");

        System.out.print("do-while loop (x=10, condition x<5): ");
        int y = 10;
        do { System.out.print(y + " "); y++; } while (y < 5);
        System.out.println("(ran once!)");

        // ATM menu simulation
        System.out.println("\n=== ATM Menu Simulation ===");
        double balance = 1000.0;
        int[]  choices = {1, 3, 2, 4};  // Simulate: balance, withdraw, deposit, exit
        double[] amounts = {0, 200, 150, 0};
        int menuIdx = 0;
        do {
            int choice = choices[menuIdx];
            double amount = amounts[menuIdx++];
            switch (choice) {
                case 1 -> System.out.printf("Balance: $%.2f%n", balance);
                case 2 -> { balance += amount; System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, balance); }
                case 3 -> {
                    if (amount > balance) System.out.println("Insufficient funds!");
                    else { balance -= amount; System.out.printf("Withdrew $%.2f. Remaining: $%.2f%n", amount, balance); }
                }
                case 4 -> System.out.println("Thank you. Goodbye!");
            }
        } while (choices[menuIdx-1] != 4 && menuIdx < choices.length);
    }
}
