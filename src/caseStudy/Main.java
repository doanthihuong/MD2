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
          System.out.println(" -----------------MENU----------------");
          System.out.println("| 1. Thêm khách hàng                  |");
          System.out.println("| 2. Hiển thị khách hàng              |");
          System.out.println("| 3. Sửa khách hàng                   |");
          System.out.println("| 4. Xóa một khách hàng               |");
          System.out.println("| 5. Xóa tất cả danh sách khách hàng  |");
          System.out.println("| 6. Tìm khách hàng                   |");
          System.out.println("| 7. Thoát                            |");
          System.out.println("|-------------------------------------|");
          System.out.println( " nhập lựa chọn của bạn");
          do {

              try {
                  choice =sc.nextInt();
                  sc.nextLine();
                  }
                  catch (Exception e) {
                      System.out.println(" chỉ nhập số");
                      sc.nextLine();
                      choice=-1;

                  }
          } while (choice<1 || choice>7);

          switch (choice) {
              case 1:
                  System.out.println(" nhập tên khách : ");
                  String name = sc.nextLine();
                  System.out.println(" nhập tên số điện thoại : ");
                  long phoneNumber = sc.nextInt();
                  Customer customer = new Customer(name,phoneNumber);
                  customerManage.add(customer);
                  System.out.println("-------------------------------");

                  break;
              case 2:
                  customerManage.display();
                  break;
              case 3:
                  System.out.println("nhập số điệnt thoại muốn sửa");
                  phoneNumber=sc.nextLong();
                  System.out.println("nhập tên sửa thành: ");
                  String name1= sc.nextLine();
                  sc.nextLine();
                  System.out.println(" nhập số điện thoại sửa thành: ");
                  long phoneNumber1 = sc.nextLong();
                  Customer customer1 =new Customer(name1,phoneNumber1);
                  customerManage.edit(phoneNumber, customer1);

                  break;
              case 4:
                  System.out.println(" nhập số điện thoại muốn xóa ");
                  phoneNumber = sc.nextLong();
                  customerManage.delete(phoneNumber);
                  System.out.println("-----------------------------");
                  break;
              case 5:
                  customerManage.deleteAll();
                  System.out.println("----------Danh sách trống--------------");
                  break;
              case 6:
                  System.out.println(" nhập tên cần tìm");
                  name = sc.nextLine();
                  customerManage.printAll(name);
                  break;
              case 7 :
                  System.exit(0);
                  break;
          }


        } while (choice >=1 && choice <= 7);

    }
}
