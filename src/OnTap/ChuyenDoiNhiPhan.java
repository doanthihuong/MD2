package OnTap;

import java.util.Scanner;

 public class ChuyenDoiNhiPhan {
     public static void main(String[] args) {
//         đầu vào
         int n;
         Scanner sc =new Scanner( System.in);
         System.out.println(" Nhập vào số nguyên n");
         n =sc.nextInt();
         String nhiPhan = " ";
//         chia liên tục cho 2 và lấy phần dư
//         đảo ngược chuỗi => kết quả
         while (n>0) {
             nhiPhan = (n%2) +nhiPhan;
             n=n/2;
         }
         System.out.println(nhiPhan);
     }

 }
