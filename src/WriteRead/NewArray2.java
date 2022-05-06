package WriteRead;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class NewArray2 {
    public static void main(String[] args)throws Exception {
        File inputFile = new File("input1.txt");
        inputFile.createNewFile();
        File outputFile=new File("output2.txt");
        outputFile.createNewFile();
        PrintWriter pr= new PrintWriter(outputFile);
        // Nhập vào file input
        Scanner sc= new Scanner(inputFile);
        String str = sc.nextLine();
        System.out.println(str);
        String [] arr = str.split(",");
        int sum = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            sum=Integer.parseInt(arr[i]);
        }
        pr.write("tổng là : " + sum);
        pr.close();


    }
}
