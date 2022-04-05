package Introduction;

import java.util.Scanner;

public class SudungToantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập chiều rộng:");
        width= scanner.nextFloat();
        System.out.println("nhập chiều dài:");
        height= scanner.nextFloat();
        float area=width*height;
        System.out.println("diện tích :" + area);
    }
}