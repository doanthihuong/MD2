package QuanLyThuVien;

public class Bao extends TaiLieu {
    private int ngayPhatHanh;

    public Bao() {
    }

    public Bao(String nxb, int sophathanh, int ngayPhatHanh) {
        super(nxb, sophathanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString() + "báo " + ","+
                "ngày phát hành: " + ngayPhatHanh ;
    }
}
