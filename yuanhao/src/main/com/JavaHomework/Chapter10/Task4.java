package main.com.JavaHomework.Chapter10;

import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++)
            accounts[i] = new Account(1, 100);

        System.out.print("Enter an id:");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        while (id < 0 || id > 9) {
            System.out.print("The if is nonExistent,please input again:");
            id = input.nextInt();
        }
        mainMenu();
        int choice = input.nextInt();
        boolean judge = choice == 1 || choice == 2 || choice == 3;
        while (judge) {
            switch (choice) {
                case 1:
                    System.out.println("The balance is " + accounts[id].getBalance());
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    accounts[id].withdraw(withdraw);
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit:");
                    double deposit = input.nextDouble();
                    accounts[id].deposit(deposit);
                    break;
            }
            mainMenu();
            choice = input.nextInt();
            judge = choice == 1 || choice == 2 || choice == 3;
        }
        Task4.main(args);
    }

    public static void mainMenu() {
        System.out.println("Main menu");
        System.out.println("1: check balance ");
        System.out.println("2: withdraw ");
        System.out.println("3: deposit ");
        System.out.println("4: exit ");
        System.out.print("Enter a choice: ");
    }

    public static class Account {
        public Account() {
            dateCreated = new Date();
        }

        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
            dateCreated = new Date();
        }

        private int id;
        private double balance;
        private double annualInterestRate;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        private Date dateCreated = new Date();

        public void Account() {
        }

        public double getMonthlyInterest() {
            return balance * (annualInterestRate / 100 / 12);
        }

        public void withdraw(double reduce) {
            balance -= reduce;
        }

        public void deposit(double increase) {
            balance += increase;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

    }
}


