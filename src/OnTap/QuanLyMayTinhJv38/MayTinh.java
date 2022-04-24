package OnTap.QuanLyMayTinhJv38;

public class MayTinh {
    private HangSanXuat hangSanXuat;
    private NgaySanXuat ngaySanXuat;
    private double giaBan;
    private int thoiGianBaoHanhTheoThang;

    public MayTinh() {
    }

    public MayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, double giaBan, int thoiGianBaoHanhTheoThang) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanhTheoThang = thoiGianBaoHanhTheoThang;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public NgaySanXuat getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return  "hangSanXuat : " + hangSanXuat.getTenHang() +
                ", ngaySanXuat : " + ngaySanXuat.getThang()+"/"+ngaySanXuat.getNam() +
                ", giaBan : " + giaBan +
                ", thoiGianBaoHanhTheoThang : " + thoiGianBaoHanhTheoThang ;
    }

    public int getThoiGianBaoHanhTheoThang() {
        return thoiGianBaoHanhTheoThang;
    }

    public void setThoiGianBaoHanhTheoThang(int thoiGianBaoHanhTheoThang) {
        this.thoiGianBaoHanhTheoThang = thoiGianBaoHanhTheoThang;
    }
    public boolean kiemTraGiaThapHon(MayTinh mayKhac) {
        return this.giaBan< mayKhac.giaBan;
    }

}
