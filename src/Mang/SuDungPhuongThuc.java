package Mang;

public class SuDungPhuongThuc {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("giá trị lớn nhất : " + timMax(mang));
        System.out.println("giá trị bé nhất : " + timMin(mang));
    }

    public static int timMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int timMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
