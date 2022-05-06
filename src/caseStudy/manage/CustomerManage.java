package caseStudy.manage;

import caseStudy.mode1.Bus;
import caseStudy.mode1.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManage {
   List<Customer> customerList = new ArrayList<>();

    public void add(Customer customer) {
        customerList.add(customer);
    }

    public void display() {
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));

        }

    }


    public Object findById(int id) {
        return customerList.get(findIndexByPhoneNumber(id));
    }


    public void edit(int id, Object o) {
   Customer customer =new Customer();
   customerList.set((findIndexByPhoneNumber(id)),customer);
    }


    public void delete(int id) {
        customerList.remove(findIndexByPhoneNumber(id));
    }


    public void printAll() {
        for (int i=0; i<customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

    }

    public int findIndexByPhoneNumber(long phoneNumber) {
        for (int i=0; i<customerList.size(); i++) {
            if (customerList.get(i).getPhoneNumber() == phoneNumber) {
                return i;
            }
        }
        return -1;
    }
}
