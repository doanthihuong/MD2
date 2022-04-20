package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDoiXung {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập chuỗi cần kiểm tra");
        String chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            stack.push(chuoi.charAt(i));
        }
        String chuoidaonguoc ="";
        while (!stack.isEmpty()) {
            chuoidaonguoc = chuoidaonguoc + String.valueOf(stack.pop());
        }
        if (chuoi.equals(chuoidaonguoc)) {
            System.out.println("Đối xứng");
        } else System.out.println("không đối xứng");
    }
    }

