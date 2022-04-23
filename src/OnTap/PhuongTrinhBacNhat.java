package OnTap;

import java.util.Scanner;

public class
PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc =new Scanner( System.in);
        System.out.println( " nhập a ");
        int a = sc.nextInt();
        System.out.println(" nhập b");
        int b = sc.nextInt();
        System.out.println( a+ "X +2" + b + "Y = 0");
        if (a==0) {
            if ( b==0){
                System.out.println( "vô số nghiệm ");

            } else  {
                System.out.println("vô nghiệm");
            }
        }
        else {
            System.out.println( "nghiệm :" + (-b/a));
        }
    }
}
