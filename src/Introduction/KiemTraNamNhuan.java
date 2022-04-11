package Introduction;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        boolean NamNhuan =false ;
        Scanner sc =new Scanner( System.in);
        System.out.println( " Nhập năm cần kiểm tra : ");
        int year = sc.nextInt();
     if ( year%4==0) {
         if (year % 100 == 0) {
             if (year % 400 == 0) {
             NamNhuan =true;
             } else NamNhuan = false;
         } else
         NamNhuan =true ;
     } else NamNhuan =true;
     if (NamNhuan) {
         System.out.println( " Là Năm nhuận");
     } else System.out.println( " Không là Năm nhuận");
    }
}
