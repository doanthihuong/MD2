package QuanLySach;

public class Sach extends TaiLieu {
    private String tacgia;
    private int sotrang;

    public Sach() {
    }

    public Sach(String tacgia, int sotrang) {
        this.tacgia = tacgia;
        this.sotrang = sotrang;
    }

    public Sach(String nhaxuatban, int maso, int sobanphathanh, String tacgia, int sotrang) {
        super(nhaxuatban, maso, sobanphathanh);
        this.tacgia = tacgia;
        this.sotrang = sotrang;
    }

    @Override
    public String toString() {
        return super.toString()+ "Sach{"+
                "tacgia='" + tacgia + '\'' +
                ", sotrang=" + sotrang +
                '}';
    }
}
