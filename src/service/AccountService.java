package service;

import entities.Account;

import java.util.Scanner;

public class AccountService {

    public Account inputInfo(Scanner scanner){
        System.out.println("Mời bạn nhập tên:");
        String name= scanner.nextLine();
        System.out.println("Mời bạn nhập số tài khoản:");
        int accountNumber=Integer.parseInt(scanner.nextLine());
        System.out.println("MỜi bạn nhập email:");
        String email= scanner.nextLine();
        System.out.println("Mời bạn nhập số dư tài khoản:");
        double accountBalance=Double.parseDouble(scanner.nextLine());
        return new Account(name,accountNumber,email,accountBalance);
    }
}
