package caseStudy.manage;

import caseStudy.mode1.Bus;
import caseStudy.mode1.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManage {
    List<Customer> customerList = new ArrayList<>();

    public void add(Customer customer) {customerList.add(customer);
    }

    public void display() {
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));

        }

    }


    public Object findById(int id) {
        return customerList.get(findIndexByPhoneNumber(id));
    }


    public void edit(long phoneNumber, Customer customer) {
        customerList.set((findIndexByPhoneNumber(phoneNumber)), customer);
    }


    public void delete(long phoneNumber) {
        int index = findIndexByPhoneNumber(phoneNumber);
        if (index == -1) {
            System.out.println(" Số điện thoại không có trong danh sách ");
        } else {
            customerList.remove(findIndexByPhoneNumber(phoneNumber));
            System.out.println("---------- Xóa thành công-------------");
        }

    }

    public void deleteAll() {
        customerList.removeAll(customerList);
    }


    public void printAll(String name) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().contains(name)) {
                System.out.println(customerList.get(i));
            }
        }
        System.out.println("Khách hàng không có trong danh sách");

    }


    public int findIndexByPhoneNumber(long phoneNumber) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getPhoneNumber() == phoneNumber) {
                return i;
            }
        }
        return -1;
    }
}
