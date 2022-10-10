package Evaluation1;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountDaoImpl ac = new AccountDaoImpl();

        System.out.println("Welcome to the SBI Yuno application");
        System.out.println("===================================");
        System.out.println("""
                ===== please select  your option below =====\s
                press 1 for Inserting record\s
                press 2 for Searching record\s
                press 3 for Deleting record\s
                press 4 for Withdraw money\s
                press 5 for Adding money
                """);
        System.out.println("Enter number");
            int n = sc.nextInt();
            if(n==1){
                System.out.println("Enter Id");
                int id = sc.nextInt();
                System.out.println("Enter email");
                String email = sc.next();
                System.out.println("Enter address");
                String address = sc.next();
                System.out.println("Enter balance");
                double balance = sc.nextDouble();
                Account account = new Account(id,email,address,balance);
                System.out.println(ac.save(account));
            }

            else if(n==2){
                System.out.println("Enter Id which you want to search");
                int id = sc.nextInt();
                System.out.println(ac.findById(id));
            }

            else if (n==3){
                System.out.println("Enter Id which you want to search");
                int id = sc.nextInt();
                System.out.println(ac.deleteAccountById(id));
            }
            else if (n==4) {
                System.out.println("Enter amount");
                double amount  = sc.nextDouble();
                System.out.println("Enter id");
                int id = sc.nextInt();
                System.out.println(ac.withdraw(amount,id));
            }
            else if(n==5){
                System.out.println("Enter amount");
                double amount  = sc.nextDouble();
                System.out.println("Enter id");
                int id = sc.nextInt();
                System.out.println(ac.deposit(amount,id));
            }
            else {
                System.out.println("Enter valid choice");
            }

    }
}
