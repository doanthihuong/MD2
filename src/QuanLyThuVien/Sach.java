package QuanLyThuVien;

public class Sach extends TaiLieu {
    private String tacgia;
    private int sotrang;

    public Sach() {
    }

    public Sach(String nxb, int sophathanh, String tacgia, int sotrang) {
        super(nxb, sophathanh);
        this.tacgia = tacgia;
        this.sotrang = sotrang;
    }

    @Override
    public String toString() {
        return super.toString()+ ", "+"Sách: " + "tác giả: "+ tacgia  +", " +"số trang:" +sotrang;
    }

//    public static void main(String[] args) {
//        Sach sach =new Sach("Kim đồng", 100, "Nguyễn Nhật Ánh",150);
//
//         Bao bao =new Bao("Tiki", 300,150);
//        Sach sach2 =new Sach("Tiki", 600, "Vãn Tình",200);
//        System.out.println(sach);
//        System.out.println(bao);
//        System.out.println(sach2);
//

//    }
}
