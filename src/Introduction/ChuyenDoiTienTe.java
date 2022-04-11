package Introduction;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    //    Làm lại
    public static void main(String[] args) {
        double num=23000;
       double usd,vnd ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tiền đô vào bro nhé ! ");
        usd = sc.nextDouble();
        vnd= usd* num;
        System.out.println( "vnd: " + vnd );
        }
    }
//    public static void main(String[] args) {
//        int num = 23000 ;
//        int usd,vnd ;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số tiền đô vào đê bro!");
//        usd = sc.nextInt();
//        vnd= usd*23000;
//        System.out.println("vnd: " + vnd);
//
//    }
