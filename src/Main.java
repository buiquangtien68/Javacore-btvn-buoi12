import entities.Bill;
import entities.Customer;
import service.BillService;
import service.CustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Customer> customers=new ArrayList<>();
        ArrayList<Bill> bills=new ArrayList<>();
        BillService billService=new BillService();
        CustomerService customerService=new CustomerService();
        customerService.addCustomerList(scanner,customers);
        billService.inputBillInfo(scanner,customers,bills);
    }
}
