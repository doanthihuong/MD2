package QuanLySach;

public class TaiLieu {
    private String nhaxuatban;
    private int maso;
    public int sobanphathanh;

    public TaiLieu() {
    }

    public TaiLieu(String nhaxuatban, int maso, int sobanphathanh) {
        this.nhaxuatban = nhaxuatban;
        this.maso = maso;
        this.sobanphathanh = sobanphathanh;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public int getSobanphathanh() {
        return sobanphathanh;
    }

    public void setSobanphathanh(int sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }

    @Override
    public String toString() {
        return super.toString() + "TaiLieu{" +
                "nhaxuatban='" + nhaxuatban + '\'' +
                ", maso=" + maso +
                ", sobanphathanh=" + sobanphathanh +
                '}';
    }
}
