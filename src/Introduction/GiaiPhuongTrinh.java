package Introduction;

import java.util.Scanner;

public class GiaiPhuongTrinh {
//    làm lại
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Nhập a :");
        double a = sc.nextDouble();
        System.out.println( " Nhập b : ");
        double b= sc.nextDouble();
        if ( a==0 ) {
            if ( b==0) {
                System.out.println( " pt vô số nghiệm");
            } else
                System.out.println( " pt vô nghiệm");
        } else
            System.out.println( " pt có nghiệm : " + -b/a);

    }
//    public static void main(String[] args) {
//   double x;
//   Scanner sc=new Scanner(System.in);
//   System.out.println( "Nhập số a");
//   double a = sc.nextDouble();
//   System.out.println("Nhập b");
//   double b= sc.nextDouble();
//   if (a==0) {
//       if(b==0)
//       System.out.println ("Phương trình vô số nghiệm ");
//       else {
//           System.out.println( "Phương trình vô nghiệm");
//       }
//   }
//   else  {
//       x=-b/a ;
//       System.out.println("Phương trình có nghiệm là : x =" + x);
//        }
//    }
}
