package AccessModifier;

public class HinhTron {
    private double BanKinh = 1.0;
    private String Mau= "đỏ";

    public HinhTron() {
    }
    public HinhTron(double banKinh, String mau) {
        BanKinh = banKinh;
        Mau = mau;
    }

    public double getBanKinh() {
        return BanKinh;
    }
    public String getMau() {
        return Mau;
    }
}
