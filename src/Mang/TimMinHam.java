package Mang;

public class TimMinHam {
    public static void main(String[] args) {
        int [] a={100,68,86,29,79};
        int [] b={1001,628,186,291,719};
//        int min = arr[0];
//        for (int i = 1 ; i<arr.length;i++){
//            if (arr[i]<min){
//                min = arr[i];
//            }
//        }
        System.out.println(timMin(a));
        System.out.println(timMin(b));
        System.out.println(timMax(b));
    }
    static int timMin(int[] arr) {
        int min = arr[0];
        for (int i = 1 ; i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static int timMax(int[] arr) {
        int max = arr[0];
        for (int i = 1 ; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}

