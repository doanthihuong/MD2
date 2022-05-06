package MiniTest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ManageContacts mn = new ManageContacts();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("---CHƯƠN TRÌNH QUẢN LÝ DANH BẠ---");
            System.out.println("-----CHỌN CHỨC NĂNG THEO SỐ-------");
            System.out.println(
                    " 1. Xem Danh Sách \n"
                            + " 2. Thêm mới \n"
                            + " 3. Cập nhật \n"
                            + " 4. Xóa \n"
                            + " 5. Tìm kiếm \n"
                            + " 6. Đọc từ file \n"
                            + " 7. Ghi vào file \n"
                            + " 8.Thoát \n"

            );
            System.out.println(" Nhập yêu cầu");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    User us1 = new User("Đoàn Thị Hường", 3763, "Hà Tĩnh", "annhien@gmail.com", " Hường");
                    User us2 = new User("Hoàng Thị Thu Hà", 1223, "Huế", "phudu@gmail.com", " Phù Du");
                    User us3 = new User("Nguyễn Thị Thùy Linh", 3545, "Thanh Hóa", "thuylinh@gmail.com", " Thùy Linh");
                    User us4 = new User("Nguyễn Thị Trà Linh", 6325, "Huế", "nantt@gmail.com", " Nản TT");

                    mn.Add(us1);
                    mn.Add(us2);
                    mn.Add(us3);
                    mn.Add(us4);
                    mn.Display();
                    System.out.println("-----------------------");
                    break;
                case 2:
                    User us5 = new User("Nguyễn Hạ Trang", 1234, "Đà Nẵng", "rdasss@gmail.com", "TrangFormen");
                    mn.Add(us5);
                    break;
                case 3:
                    User us6 = new User("Vũ Nhật Trường", 1278, "Quảng Nam", "fhshd@gmail.com", "Trường Vũ");
                    mn.Edit("Đoàn Thị Hường",us6);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;

            }
        }
    }
}
