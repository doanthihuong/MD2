package OnTap;

import java.util.Scanner;

public class ChuViDienTichhinhtron {
//    Toán tử điều kiện
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println( "nhập a");
//        int a = sc.nextInt();
//        String Ketqua = (a % 2 == 0) ?"Sô chẵn" : "số lẻ";
//        System.out.println (Ketqua);
        // tính diện tích
        System.out.println("nhập bán kính");
        double r = sc.nextDouble();
        double chuVi = 2* Math.PI*r;
        System.out.println("chu vi : " + chuVi);
        System.out.println( "chu vi : " + Math.round(chuVi*100.0)/100.0);
        // tính Diện tích
        double dienTich= Math.PI*Math.pow(r,2);
        System.out.println( "diện tích : " + dienTich);
        System.out.println( "diện tích : " + Math.round(dienTich));
    }
}
