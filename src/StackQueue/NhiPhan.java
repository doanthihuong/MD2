package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class NhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(" nhập số cần chuyển");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            int SoDu = num % 2;
            stack.push(SoDu);
            num /= 2;
        }
        String s = "";
        while (!stack.isEmpty()) {
            s += stack.pop();
        }
        System.out.println(s);
    }
}
