package OnTap.QuanLySinhVienJv37;

import com.sun.jmx.snmp.SnmpGauge;

public class ThongTinSinhVien {
    private int mssv;
    private  String hoVaTen;
    private NgaySinh ngaySinh;
    private double diemTrungBinh;
    private  Lop lop;

    public ThongTinSinhVien() {
    }

    public ThongTinSinhVien(int mssv, String hoVaTen, NgaySinh ngaySinh, double diemTrungBinh, Lop lop) {
        this.mssv = mssv;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
        this.lop = lop;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }
    public String getTenKhoa() {
        return this.lop.getKhoa();
    }

    @Override
    public String toString() {
        return "ThongTinSinhVien: " +
                "mssv: " + mssv +
                ", hoVaTen: '" + hoVaTen  +
                ", ngaySinh: " + ngaySinh.getNamSinh() +
                ", diemTrungBinh: " + diemTrungBinh +
                ", lop: " + lop.getLopHoc() ;
    }

    public boolean kiemTraThiDat() {
        return this.diemTrungBinh>=5;
    }
    public boolean kiemTraCungNgaySinh(ThongTinSinhVien svkhac) {
        return this.ngaySinh== svkhac.ngaySinh ;
    }
}
