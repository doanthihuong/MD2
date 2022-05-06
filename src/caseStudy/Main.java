package caseStudy;

import caseStudy.manage.CustomerManage;
import caseStudy.mode1.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        CustomerManage customerManage=new CustomerManage();
        int choice = -1;
      do {
          System.out.println("-----------------MENU-----------------");
          System.out.println("1. Thêm khách hàng");
          System.out.println("2. Hiển thị khách hàng");
          System.out.println("3. Sửa khách hàng");
          System.out.println("4. Xóa khách hàng");
          System.out.println("5. Tìm khách hàng");
          System.out.println( " nhập lựa chọn của bạn");
          choice =sc.nextInt();
          sc.nextLine();
          switch (choice) {
              case 1:
                  System.out.println(" nhập tên khách : ");
                  String name = sc.nextLine();
                  System.out.println(" nhập tên số điện thoại : ");
                  long phoneNumber = sc.nextInt();
                  Customer customer = new Customer(name,phoneNumber);
                  customerManage.add(customer);

                  break;
              case 2:
                  customerManage.display();
                  break;
              case 3:

                  customerManage.edit();
                  break;
              case 4:
                  break;
              case 5:
                  break;
          }



        } while (choice !=0);

    }
}
