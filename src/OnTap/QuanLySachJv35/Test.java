package OnTap.QuanLySachJv35;

public class Test {
    public static void main(String[] args) {
        Ngay ng1=new Ngay(12,4,2020);
        Ngay ng2= new Ngay( 10,12,2002);
        Ngay ng3= new Ngay( 11,2,2022);
        TacGia tg1=new TacGia( "Dũng", ng1);
        TacGia tg2=new TacGia( "Dũng", ng2);
        TacGia tg3=new TacGia( "Dũng", ng3);

        Sach sach1= new Sach("Hạt giống tâm hồn",50000,2010,tg1);
        Sach sach2= new Sach("Sói già",25000,2010,tg2);
        Sach sach3= new Sach("Bố già",30000,2020,tg3);
        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("So sánh sách 1 và sách 2 :" + sach1.kiemTraCungNamXuatBan(sach2));
        System.out.println("So sánh sách 1 và sách 3 :" + sach1.kiemTraCungNamXuatBan(sach3));
        System.out.println("------------------------------------------------");
        System.out.println( " Sách 1 giảm 15% có giá là : "+ sach1.giaSachSauKhiGiam(15));
        System.out.println( " Sách 2 giảm 50% có giá là : " +sach1.giaSachSauKhiGiam(50));
        System.out.println( " Sách 3 giảm 1% có giá là : " + sach1.giaSachSauKhiGiam(1));
    }
}
