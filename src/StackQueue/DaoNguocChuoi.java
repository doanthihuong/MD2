package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    //    Đảo ngược chuỗi
    public static void main(String[] args) {
        Stack<String> chuoiStrack = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            chuoiStrack.push(chuoi.charAt(i) + " ");
        }
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.print(chuoiStrack.pop());
        }
    }
}
