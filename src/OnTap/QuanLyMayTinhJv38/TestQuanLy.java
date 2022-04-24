package OnTap.QuanLyMayTinhJv38;

public class TestQuanLy {
    public static void main(String[] args) {
        NgaySanXuat ngaySanXuat1=new NgaySanXuat(2,2,2020);
        NgaySanXuat ngaySanXuat2=new NgaySanXuat(5,8,2021);
        NgaySanXuat ngaySanXuat3=new NgaySanXuat(8,10,2019);
        NgaySanXuat ngaySanXuat4=new NgaySanXuat(10,10,2019);
        NgaySanXuat ngaySanXuat5=new NgaySanXuat(15,1,2021);
       QuocGia quocGia1 =new QuocGia("USA","Mỹ");
       QuocGia quocGia2 =new QuocGia("VN","Việt Nam");
       QuocGia quocGia3 =new QuocGia("JP","Nhật");
       HangSanXuat hangSanXuat1 =new HangSanXuat("Macbook",quocGia1);
       HangSanXuat hangSanXuat2 =new HangSanXuat("Vncompu",quocGia2);
       HangSanXuat hangSanXuat3 =new HangSanXuat("VnCompu",quocGia2);
       HangSanXuat hangSanXuat4 =new HangSanXuat("Asus",quocGia3);
       HangSanXuat hangSanXuat5 =new HangSanXuat("Toshiba",quocGia3);
       MayTinh mayTinh1 =new MayTinh(hangSanXuat1,ngaySanXuat1,12000,12);
       MayTinh mayTinh2 =new MayTinh(hangSanXuat2,ngaySanXuat2,15000,12);
       MayTinh mayTinh3 =new MayTinh(hangSanXuat3,ngaySanXuat3,10000,18);
       MayTinh mayTinh4 =new MayTinh(hangSanXuat4,ngaySanXuat4,14000,24);
       MayTinh mayTinh5 =new MayTinh(hangSanXuat5,ngaySanXuat5,11000,10);
        System.out.println("----------------Danh Sách Máy Tính--------------------");
        System.out.println(mayTinh1.toString());
        System.out.println(mayTinh2.toString());
        System.out.println(mayTinh3.toString());
        System.out.println(mayTinh4.toString());
        System.out.println(mayTinh5.toString());
        System.out.println("---------------------Thời Gian bảo hành theo tháng-------------");
        System.out.println("Máy tính 1 bảo hành :  " + mayTinh1.getThoiGianBaoHanhTheoThang() + "tháng");
        System.out.println("Máy tính 2 bảo hành :  " + mayTinh2.getThoiGianBaoHanhTheoThang() + "tháng");
        System.out.println("Máy tính 3 bảo hành :  " + mayTinh3.getThoiGianBaoHanhTheoThang() + "tháng");
        System.out.println("Máy tính 4 bảo hành :  " + mayTinh4.getThoiGianBaoHanhTheoThang() + "tháng");
        System.out.println("Máy tính 5 bảo hành :  " + mayTinh5.getThoiGianBaoHanhTheoThang() + "tháng");
        System.out.println(" ------------------------So sánh giá-------------------------");
        System.out.println("So sánh máy 1 với máy 2" + mayTinh1.kiemTraGiaThapHon(mayTinh2));
        System.out.println("So sánh máy 1 với máy 3" + mayTinh1.kiemTraGiaThapHon(mayTinh3));
        System.out.println("So sánh máy 3 với máy 4" + mayTinh3.kiemTraGiaThapHon(mayTinh4));
        System.out.println("So sánh máy 3 với máy 2" + mayTinh3.kiemTraGiaThapHon(mayTinh2));
        System.out.println("--------Tên Quốc Gia----------------");
        System.out.println("M1: " + mayTinh1.getHangSanXuat().layTenQuocGia());
        System.out.println("M2: " + mayTinh2.getHangSanXuat().layTenQuocGia());
        System.out.println("M3: " + mayTinh3.getHangSanXuat().layTenQuocGia());
        System.out.println("M4: " + mayTinh4.getHangSanXuat().layTenQuocGia());
        System.out.println("M5: " + mayTinh5.getHangSanXuat().layTenQuocGia());
}
}