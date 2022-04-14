package QLXe;

public class PhuongTien {
    //    1. Xây dựng lớp PhuongTien(Truu tuong) có các thuộc tính: hãng, màu, tên, giá
//2. Xây dựng lớp Oto kế thừa phương tiên có thêm thuộc tính: số chỗ
//3. Xây dựng lớp Xe máy kế thừa lớp Phương tiện có thêm thuộc tính: dung tích
// 4. Xây dựng interface QuanLy<T> có các phương thức: thêm, sửa, xoá, tìm kiếm, in tất cả, sắp xếp
//5. Xây dựng lớp QuanLyXeMay có mảng XeMay, QuanLyOTo có mảng Oto triển khai QuanLy và viết rõ các phương thức
//6. Xây dựng lớp Test, tạo main và chạy thử
    private String hang;
    private String mau;
    private String ten;
    private int gia;

    public PhuongTien() {
    }

    public PhuongTien(String hang, String mau, String ten, int gia) {
        this.hang = hang;
        this.mau = mau;
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return  "hang= " + hang + '\t' +
                ", mau= " + mau + '\t' +
                ", ten= " + ten + '\t' +
                ", gia= " + gia + '\t';
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

}

