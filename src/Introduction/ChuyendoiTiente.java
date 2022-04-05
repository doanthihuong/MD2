package Introduction;

import java.util.Scanner;

public class ChuyendoiTiente {
    public static void main(String[] args) {
        int num = 23000 ;
        int usd,vnd ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền đô vào đê bro!");
        usd = sc.nextInt();
        vnd= usd*23000;
        System.out.println("vnd: " + vnd);

    }
}
