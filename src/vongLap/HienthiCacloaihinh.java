package vongLap;

import java.util.Scanner;

public class HienthiCacloaihinh {
    public static void main(String[] args) {
        int chon = -1;
        Scanner sc =new Scanner(System.in);
        while (chon !=0) {
            System.out.println("Menu");
            System.out.println("1.Vẽ hình tam giác");
            System.out.println("2. Vẽ hình tam giác ngược");
            System.out.println("3. Vẽ hình chữ nhật");
            System.out.println("4. Vẽ hình vuông");
            System.out.println("0.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            chon=sc.nextInt();
            switch (chon) {
                case 1 :
                    for (int i=1;i<=5;i++) {
                        for(int j =1; j<=i;j++) {
                            System.out.print("*");
                            }
                        System.out.println(" ");
                    }
                    break;
                  case 2 :
                      for (int i=5;i>=1;i--) {
                          for(int j=1;j<=i;j++){
                              System.out.print("*");
                          }
                          System.out.println(" ");
                      }break;
                case 3 :
                    for (int i=1; i<= 3; i++) {
                        for(int j=1;j<=7; j++) {
                            System.out.print("*");
                        }System.out.println(" ");
                    }break;
                case 4 :
                    for (int i=1; i<= 5; i++) {
                       System.out.println("* * * * *");
                    }break;
            }
        }
    }
}
