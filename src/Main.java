import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int attempts = 3;
        int balance = 4000;
        int selection;

        while (attempts > 0) {
            System.out.print("Your Username: ");
            userName = input.nextLine();
            System.out.print("Your Password: ");
            password = input.nextLine();

            if (userName.equals("mehmetkaanselcuk") && password.equals("pass1234")) {
                System.out.println("Welcome to MKS Bank");

                do {
                    System.out.println("1- Deposit Money\n" +
                            "2- Withdraw Money\n" +
                            "3- Check Balance\n" +
                            "4- Exit");
                    System.out.print("Please select the operation that you want to perform: ");
                    selection = input.nextInt();

                    switch (selection) {
                        case 1:
                            System.out.print("Amount to deposit: ");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            break;
                        case 2:
                            System.out.print("Amount to withdraw: ");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= withdrawAmount;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " + balance);
                            break;
                        case 4:
                            System.out.println("Logging out. See you again!");
                            break;
                        default:
                            System.out.println("Invalid selection. Please try again.");
                    }
                } while (selection != 4);

                break;
            } else {
                attempts--;
                System.out.println("Incorrect username or password. Please try again.");
                if (attempts == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Remaining attempts: " + attempts);
                }
            }
        }
    }
}
