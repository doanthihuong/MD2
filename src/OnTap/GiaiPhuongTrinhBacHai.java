package OnTap;

import java.util.Scanner;

public class
GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        /*
        B1. Các biến cần nhập vào a, b, c, x1, x1, delta
        B2. Kiểm tra delta
        1. delta <0 : Phương trình vô nghiệm
        2: delta = 0: Phương trình có hai nghiệm kép
        3: delta> 0 : Phương trình có 2 nghiệm phân biệt
         */
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập a");
        double a = sc.nextDouble();
        System.out.println( "nhập b");
        double b = sc.nextDouble();
        System.out.println(" nhập c");
        double c = sc.nextDouble();
        System.out.println( a + "^x2 + " + b + "x +" + c +"= 0");
        double delta= Math.pow(b,2)-4*a*c;
        if (a==0) {
//            a = 0, không đủ điều kiện phương trình bậc hai.
            System.out.println("nhập sai dữ liệu");
        } else {
            if(delta <0) {
                System.out.println("vô nghiệm");
            } else if(delta==0) {
                double x1 = -b/2*a;
                System.out.println(" 2 nghiệm kép : "  + x1);
            } else {
              double x1 = (-b- Math.sqrt(delta)/(2*a));
              double x2 = (-b+ Math.sqrt(delta)/(2*a));
                System.out.println("phương trình có 2 nghiệm phân biệt : x1 :" + x1 + "x2 : "+ x2);
            }
        }


    }
}
