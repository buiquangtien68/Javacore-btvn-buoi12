package entities;

import java.util.Scanner;

public class Account implements IAccount{
    private String name;
    private int accountNumber;
    private String email;
    private double accountBalance;

    public Account() {
    }

    public Account(String name, int accountNumber, String email, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = accountBalance;
    }

    @Override
    public void recharge(Scanner scanner) {
        System.out.println("Mời bạn nhập số tiền muốn nạp:");
        double amount=Double.parseDouble(scanner.nextLine());
        this.accountBalance+=amount;

    }

    @Override
    public void changeEmail(Scanner scanner) {
        System.out.println("Mời bạn nhập email mới:");
        String email= scanner.nextLine();
        this.email=email;
    }

    @Override
    public void display() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "entities.Account{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", email='" + email + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                '}';
    }
}
