import java.util.Scanner;

public class GiaiPhuongtrinh {
    public static void main(String[] args) {
   double x;
   Scanner sc=new Scanner(System.in);
   System.out.println( "Nhập số a");
   double a = sc.nextDouble();
   System.out.println("Nhập b");
   double b= sc.nextDouble();
   if (a==0) {
       if(b==0)
       System.out.println ("Phương trình vô số nghiệm ");
       else {
           System.out.println( "Phương trình vô nghiệm");
       }
   }
   else  {
       x=-b/a ;
       System.out.println("Phương trình có nghiệm là : x =" + x);
        }
    }
}
