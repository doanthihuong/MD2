package caseStudy;

import caseStudy.manage.BicycleManage;
import caseStudy.mode1.Bicycle;

import java.util.Scanner;

public class MainBicycle {
    public MainBicycle() {
        BicycleManage bicycleManage = new BicycleManage();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        System.out.println("------------MENU LỰA CHỌN------------");
        System.out.println("1 - Hiển thị số lượng xe đạp ");
        System.out.println("2 - Thêm 1 xe đạp mới");
        System.out.println("3 - Sửa thông tin xe theo số id");
        System.out.println("4 - Xóa xe đap theo id");
        System.out.println("5 - Xóa tất cả xe");
        System.out.println("6 - Hiển thị xe đã cho thuê/ đang rảnh");
        System.out.println("7 - Thay đổi trạng thái xe đạp (Từ đang rảnh/đã cho thuê, )");
        System.out.println("8 - Tìm xe theo id xe (hiển thị xe duy nhất)");
        System.out.println("9 - Tìm xe theo giá cho thuê");
        System.out.println("10 - Xem lại danh sách Menu");
        System.out.println("11 - Thoát");
        System.out.println(" nhập lựa chọn của bạn");


        do {

            do {

                try {
                    choice = sc.nextInt();
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println(" chỉ nhập số");
                    sc.nextLine();
                    choice = -1;

                }
            } while (choice < 1 || choice > 11);

            switch (choice) {
                case 1:
                    System.out.println("======Danh Sách Hóa đơn===== ");
                    bicycleManage.display();
                    break;
                case 2:
                    System.out.println(" Nhập id xe");
                    int id = sc.nextInt();
                    System.out.println(" Nhập biển số xe");
                    int licensePlate = sc.nextInt();
                    System.out.println(" nhập màu xe");
                    sc.nextLine();
                    String color = sc.nextLine();
                    System.out.println(" nhập trạng thái xe empty/busy");
                    String status = sc.nextLine();
                    System.out.println(" nhập giá cho thuê xe");
                    String rentCost = sc.nextLine();
                    Bicycle bicycle = new Bicycle(id, licensePlate, color, status, rentCost);
                    bicycleManage.add(bicycle);

                    break;
                case 3:
                    System.out.println(" Nhập id xe muốn sửa");
                    id = sc.nextInt();
                    System.out.println(" Nhập biển số xe sửa thành: ");
                    licensePlate = sc.nextInt();
                    System.out.println(" nhập màu xe sửa thành : ");
                    color = sc.nextLine();
                    System.out.println(" nhập trạng thái xe empty/busy muốn sửa : ");
                    status = sc.nextLine();
                    System.out.println(" nhập giá cho thuê muốn sửa thành : ");
                    rentCost = sc.nextLine();
                    Bicycle bicycle1 = new Bicycle(id, licensePlate, color, status, rentCost);
                    bicycleManage.edit(id, bicycle1);
                    break;
                case 4:
                    System.out.println(" Nhập id xe muốn xóa");
                    id = sc.nextInt();
                    bicycleManage.delete(id);
                    System.out.println(" Xóa thành công");
                    break;
                case 5:
                    bicycleManage.deleteAll();
                    System.out.println("----------Danh sách trống--------------");
                    break;
                case 6:
                    bicycleManage.findBusyBicycle();
                    break;
                case 7:
                    System.out.println(" nhập id xe muốn thay đổi trạng thái");
                    id = sc.nextInt();
                    bicycleManage.emptyToBusy(id);
                    break;
                case 8:
                    System.out.println(" Nhập id xe muốn tìm");
                    id = sc.nextInt();
                    bicycleManage.findById(id);
                    break;
                case 9:
                    System.out.println(" Nhập giá cho thuê");
                    String cost = sc.nextLine();
                    bicycleManage.findByRentCost(cost);
                    break;
                case 10:
                   bicycleManage.displayMenu();
//                    new MainBicycle();
                   break;
                case 11:
                    System.exit(0);
                    break;
            }
        } while (choice >= 1 && choice <= 11);
    }
}
