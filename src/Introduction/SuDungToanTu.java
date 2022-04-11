package Introduction;

import java.util.Scanner;

public class SuDungToanTu {
//    làm lại
public static void main(String[] args) {
    double ChieuDai;
    double ChieuRong;
    Scanner sc= new Scanner( System .in);
    System.out.println( "nhập chiều dài hcn :");
    ChieuDai=sc.nextDouble();
    System.out.println( " nhập chiều rộng hcn: ");
    ChieuRong =sc.nextDouble();
    System.out.println( " diện tích hình chữ nhật" + ChieuDai*ChieuRong);
}
//    public static void main(String[] args) {
//        float width;
//        float height;
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("nhập chiều rộng:");
//        width= scanner.nextFloat();
//        System.out.println("nhập chiều dài:");
//        height= scanner.nextFloat();
//        float area=width*height;
//        System.out.println("diện tích :" + area);
//    }
}