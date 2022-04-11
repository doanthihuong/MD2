package AccessModifier;

import javax.crypto.Mac;

public class HinhTron {
    private double BanKinh ;
    private String Mau;

    public HinhTron() {
    }
    public HinhTron(double banKinh) {
        this.BanKinh=banKinh;

    }

    public double getBanKinh() {
        return this.BanKinh;
    }
    protected double getarea(){
     return Math.PI*BanKinh*BanKinh;
    }
    public String getMau() {
        return Mau;
    }

    public static void main(String[] args) {
     HinhTron ht1 =new HinhTron( 2
     );
        System.out.println( "diện tích hình tròn là : " + ht1.getarea());
    }
}
