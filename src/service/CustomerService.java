package service;

import entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    public Customer inputInfoCustomer(Scanner scanner){
        System.out.println("Mời bạn nhập tên chủ hộ:");
        String name= scanner.nextLine();
        System.out.println("Mời bạn nhập địa chỉ:");
        String address=scanner.nextLine();
        System.out.println("Mời bạn nhập mã số công tơ:");
        String codeElectric=scanner.nextLine();
        return new Customer(name,address,codeElectric);
    }
    public void addCustomerList(Scanner scanner, ArrayList<Customer> customers){
        System.out.println("Số hộ dân là:");
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Customer customer=inputInfoCustomer(scanner);
            customers.add(customer);
        }
    }
}
