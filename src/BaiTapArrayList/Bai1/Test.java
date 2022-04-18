package BaiTapArrayList.Bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Family fami = new Family();
        Scanner sc = new Scanner(System.in);
        int choice =1;
        System.out.println(" MeNu");
        System.out.println("1.Thêm thành viên");
        System.out.println("2.Sửa thành viên");
        System.out.println("3.Xóa thành viên");
        System.out.println("4.Hiển thị");
        System.out.println("0. Thoát");

        while (choice != 0) {
            System.out.println("lựa chọn của bạn");
            choice = sc.nextInt();
//            sc.nextLine();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("nhập tên");
                    String name = sc.nextLine();
                    System.out.println("nhập tuổi");
                    int age = sc.nextInt();
                    System.out.println("nhập CMND");
                    int id = sc.nextInt();
                    System.out.println("nhập địa chỉ");
                    String addres = sc.nextLine();
                    sc.nextLine();
                    System.out.println("nhập số lượng thành viên");
                    int soluong = sc.nextInt();

                    Person newPerson = new Person(name, age, addres,id);
                    fami.add(newPerson);
                    break;
                case 2:
                    System.out.println("nhập vào tên muốn sửa");
                    String tensua=sc.nextLine();

                    System.out.println("nhập tên");
                     name = sc.nextLine();
                    System.out.println("nhập tuổi");
                    age = sc.nextInt();
                    System.out.println("nhập CMND");
                     id = sc.nextInt();
                    System.out.println("nhập địa chỉ");
                     addres = sc.nextLine();
//                    sc.nextLine();
//                    System.out.println("nhập số lượng thành viên");
//                     soluong = sc.nextInt();
                     newPerson = new Person(name, age, addres,id);
                    fami.edit(tensua, newPerson);

                    break;
                case 3:
                    System.out.println("nhập vào tên muốn xóa");
                    String tenxoa=sc.nextLine();
                    sc.nextLine();
                    fami.delete(tenxoa);

                    break;
                case 4:
                    for(int i= 0; i<fami.familyList.size();i++) {
                        System.out.println(fami.familyList.get(i));
                    }
                    break;
                case 0:
                    break;

            }
        }
    }
}
