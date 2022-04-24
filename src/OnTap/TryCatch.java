package OnTap;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        try {
            System.out.println( " nhập vào số nguyên n");
            n = sc.nextInt();
        } catch (Exception e ) {
            System.out.println("nhập sữ liệu không đúng");
        } finally {
            System.out.println( " Finally !");
        }

        System.out.println(" giá trị nhập là : " + n);
        System.out.println(" kết thúc chương trình");
    }
}
