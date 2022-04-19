package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocSoTrongMang {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int []arr ={1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            integerStack.push(arr[i]);
        }
//        System.out.println(integerStack);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = integerStack.pop();
            System.out.print(arr[i] + " ");

        }
        System.out.print(arr + " ");

    }

}
