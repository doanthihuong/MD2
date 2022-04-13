package KeThua;

public class HinhTron {
    double r = 1.0;
    String mau = " đỏ ";
    boolean filled = false;

    public HinhTron() {

    }

    public HinhTron(double r, String mau, boolean filled) {
        this.r = r;
        this.mau = mau;
        this.filled = filled;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getDienTich() {
        return Math.PI * r * r;
    }

    public double getChuVi() {
        return Math.PI * 2 * r;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "r=" + r +
                ", màu='" + mau + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new HinhTron());
        HinhTron hinhrtron1 = new HinhTron(4.0, "vàng", false);
        System.out.println("diện tích : " + hinhrtron1.getDienTich());
        System.out.println("chu vi : " + hinhrtron1.getChuVi());
    }
}

class HinhTru extends HinhTron {
    double h = 1.0;

    public HinhTru() {
    }

    public HinhTru(double h) {
        this.h = h;
    }


    public HinhTru(double r, String mau, boolean filled, double h) {
        super(r, mau, filled);
        this.h = h;

    }

    public double TheTich() {
        return super.getDienTich()*h;
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "r=" + r +
                ", mau='" + mau + '\'' +
                ", filled=" + filled +
                ", h=" + h +
                ", v = "+TheTich() +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new HinhTru());
        HinhTru hinhTru1 = new HinhTru(1.0, "xám", false, 3.0);
    }
}