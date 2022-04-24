package OnTap.QuanLyPhimJv36;

public class TestPhim {
    public static void main(String[] args) {
        NgayChieu ngay1=new NgayChieu(2,2,2022);
        NgayChieu ngay2=new NgayChieu(3,5,2020);
        NgayChieu ngay3=new NgayChieu(20,4,2010);

        HangSanXuat hangSanXuat1 = new HangSanXuat("Hãng A","Việt Nam");
        HangSanXuat hangSanXuat2= new HangSanXuat(" Hãng B", "Mỹ");
        HangSanXuat hangSanXuat3= new HangSanXuat(" Hãng C", "Hàn Quốc");
        HangSanXuat hangSanXuat4= new HangSanXuat(" Hãng D", "Nhật Bản");
        BoPhim boPhim1=new BoPhim("Bố già",2020,hangSanXuat1,50000,ngay1);
        BoPhim boPhim2=new BoPhim("Chuyện tình Havard",2010,hangSanXuat2,50000,ngay2);
        BoPhim boPhim3=new BoPhim("Giày thủy tinh",2018,hangSanXuat3,49000,ngay3);
        BoPhim boPhim4=new BoPhim("Giày thủy tinh",2018,hangSanXuat4,60000,ngay3);
        System.out.println("---------------------------------");
        System.out.println(" So sánh giá vé phim 1 rẻ hơn phim 2 : " + boPhim1.kiemTraGiaVeReHon(boPhim2));
        System.out.println(" So sánh giá vé phim 1 rẻ hơn phim 3 : " + boPhim1.kiemTraGiaVeReHon(boPhim3));
        System.out.println("----------------------------------");
        System.out.println("tên hãng sản xuất bộ phim 1 : " + boPhim1.layTenHangSanXuat()) ;
        System.out.println("tên hãng sản xuất bộ phim 2 : " + boPhim2.layTenHangSanXuat()) ;
        System.out.println("tên hãng sản xuất bộ phim 3 : " + boPhim3.layTenHangSanXuat()) ;
        System.out.println("tên hãng sản xuất bộ phim 4 : " + boPhim4.layTenHangSanXuat()) ;
        System.out.println("------------------------------------");
        System.out.println(" giá vé phim 1 sau khuyến mãi 10 % " + boPhim1.giaSauKhuyenMai(10));
        System.out.println(" giá vé phim 2 sau khuyến mãi 50 % " + boPhim1.giaSauKhuyenMai(50));
        System.out.println(" giá vé phim 3 sau khuyến mãi 75 % " + boPhim1.giaSauKhuyenMai(75));
        System.out.println(" giá vé phim 4 sau khuyến mãi 100 % " + boPhim1.giaSauKhuyenMai(100));
    }
}
