package WriteRead;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) throws Exception {
        File inputFile = new File("input.txt");
        inputFile.createNewFile();
        File outputFile = new File(" output.txt");
        outputFile.createNewFile();
        PrintWriter printWriter = new PrintWriter(outputFile);
        Scanner sc = new Scanner(inputFile);
        List<Integer> list=new java.util.ArrayList<>();
        while (sc.hasNext()) {
            list.add(sc.nextInt());
        }
        int sum = 0;
        int tich = 1;
        int max = list.get(0);
        for (int i : list) {
            sum += i;
            tich *= i;
            if (max < i) {
                max = i;
            }
        }
        printWriter.println("Tổng là: " +sum);
        printWriter.println("Max là: " +max);
        printWriter.close();
    }
}
