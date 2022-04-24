package OnTap.QuanLySinhVienJv37;

public class TestQuanLySinhVien {
    public static void main(String[] args) {
        NgaySinh ngaySinh1 = new NgaySinh(16,10,2003);
        NgaySinh ngaySinh2 = new NgaySinh(29,5,2003);
        NgaySinh ngaySinh3 = new NgaySinh(26,1,2000);
        NgaySinh ngaySinh4 = new NgaySinh(28,5,2001);
        NgaySinh ngaySinh5 = new NgaySinh(20,1,2004);
        Lop lop1 =new Lop("logistics","Kinh tế đô thị");
        Lop lop2 =new Lop("cntp","ck-công nghệ");
        Lop lop3 =new Lop("cntt","an ninh mạng");
        Lop lop4 =new Lop("qtkd","qtkd");
        Lop lop5 =new Lop("cntt","java");
        ThongTinSinhVien sinhVien1 = new ThongTinSinhVien(123,"Trần Thị Cẩm Tú", ngaySinh1,8.8,lop1);
        ThongTinSinhVien sinhVien2 = new ThongTinSinhVien(130,"Trần Thanh Thanh", ngaySinh2,8.0,lop2);
        ThongTinSinhVien sinhVien3 = new ThongTinSinhVien(135,"Đoàn Thị Hường", ngaySinh3,4.5,lop3);
        ThongTinSinhVien sinhVien4 = new ThongTinSinhVien(140,"Nguyễn Văn Đạo", ngaySinh3,4.0,lop4);
        ThongTinSinhVien sinhVien5 = new ThongTinSinhVien(145,"Nguyễn Trung Hiếu", ngaySinh3,7.8,lop5);
        System.out.println("-------------Thông tin sinh viên-----------------");
        System.out.println(sinhVien1.toString());
        System.out.println(sinhVien2.toString());
        System.out.println(sinhVien3.toString());
        System.out.println(sinhVien4.toString());
        System.out.println(sinhVien5.toString());
        System.out.println("------------------Tên Khoa------------");
        System.out.println("SV1 : " + sinhVien1.getTenKhoa());
        System.out.println("SV2 : " + sinhVien2.getTenKhoa());
        System.out.println("SV3 : " + sinhVien3.getTenKhoa());
        System.out.println("SV4 : " + sinhVien4.getTenKhoa());
        System.out.println("SV5 : " + sinhVien5 .getTenKhoa());
        System.out.println("---------------Kiểm tra thi đạt---------------");
        System.out.println("SV1 : " + sinhVien1.kiemTraThiDat());
        System.out.println("SV2 : " + sinhVien2.kiemTraThiDat());
        System.out.println("SV3 : " + sinhVien3.kiemTraThiDat());
        System.out.println("SV4 : " + sinhVien4.kiemTraThiDat());
        System.out.println("SV5 : " + sinhVien5.kiemTraThiDat());
        System.out.println("--------------- Kiểm tra cùng ngày sinh---------");
        System.out.println(" SV1 cùng ngày sinh với SV2 không ?" + sinhVien1.kiemTraCungNgaySinh(sinhVien2));
        System.out.println(" SV1 cùng ngày sinh với SV3 không ?" + sinhVien1.kiemTraCungNgaySinh(sinhVien3));
        System.out.println(" SV1 cùng ngày sinh với SV4 không ?" + sinhVien1.kiemTraCungNgaySinh(sinhVien4));
        System.out.println(" SV1 cùng ngày sinh với SV5 không ?" + sinhVien1.kiemTraCungNgaySinh(sinhVien5));
    }

}
