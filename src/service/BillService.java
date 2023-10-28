package service;

import entities.Bill;
import entities.Customer;
import utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class BillService {
    Utils utils=new Utils();
    CustomerService customerService=new CustomerService();
    public void inputBillInfo(Scanner scanner, ArrayList<Customer> customers, ArrayList<Bill> bills){
        for (Customer customer: customers) {
            System.out.println("Mời bạn nhập chỉ số cũ:");
            long oldElectric=utils.inputLong(scanner);
            System.out.println("Mời bạn nhập chỉ số mới:");
            long newElectric=utils.inputLong(scanner);
            double price=(newElectric-oldElectric)*750;
            Bill bill=new Bill(oldElectric,newElectric,price,customer);
            bills.add(bill);
        }
        System.out.println(bills);
    }
}
