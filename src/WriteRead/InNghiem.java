package WriteRead;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class InNghiem {
    public static void main(String[] args) throws Exception {
  //tạo file
        File file1= new File("f1.txt");
        File file2= new File("f2.txt");
        PrintWriter writer =new PrintWriter(file2);
        Scanner sc = new Scanner(file1);
        double a= sc. nextInt();
        double b=sc.nextInt();
        double c=-b/a;
        System.out.println(a + " " + b);
 // giải phương trinh
        if( b==0) {
            if(b==0) {
                writer.println("vô số nghiệm");
            } else {
                writer.println("vô nghiệm");
            }
        } else {
            writer.write("một nghiệm " + c);
        }
        writer.close();
    }

}
