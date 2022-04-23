package OnTap;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số từ 2 đến 8");
        int n = sc.nextInt();
        switch (n) {
            case 2: {
                System.out.println("thứ 2");
                break;
            }
            case 3: {
                System.out.println("thứ 3");
                break;
            }
            case 4: {
                System.out.println("thứ 4");
                break;
            }
            case 5: {
                System.out.println("thứ 5");
                break;
            }
            case 6: {
                System.out.println("thứ 6");
                break;
            }
            case 7: {
                System.out.println("thứ 7");
                break;
            }
            case 8: {
                System.out.println("Chủ Nhật");
                break;
            }
            default: {
                System.out.println(" nhập sai đầu vào");
            }
        }
    }
}
