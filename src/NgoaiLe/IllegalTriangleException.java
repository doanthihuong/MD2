package NgoaiLe;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cạnh a");
        int a = sc.nextInt();
        System.out.println("nhập cạnh b");
        int b = sc.nextInt();
        System.out.println("nhập cạnh c");
        int c = sc.nextInt();
        if (a <= 0 || b <= 0 || c <= 0 || a>b+c || b>a+c|| c>a+b) {
            try {
                throw new TamGiac();
            } catch (TamGiac e) {
                System.out.println(e);
            }
        } else {
            System.out.println( "Các cạnh hợp lệ");
        }
    }

    static class TamGiac extends Exception {
        @Override
        public String toString() {
            return " Tam giác chưa hợp lệ";
        }
    }
}

