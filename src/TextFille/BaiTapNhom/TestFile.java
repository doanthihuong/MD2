package TextFille.BaiTapNhom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestFile {
    public static void main(String[] args)throws Exception{
//        viết ra file txt
//        FileWriter fw = new FileWriter("C:\\Users\\Doan Thi Huong\\IdeaProjects\\MD2\\src\\TextFille\\BaiTapNhom\\BaiTapNhom.txt",true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fw);
//        bufferedWriter.write("Hello ai đó");
//        bufferedWriter.close();
//        fw.write( " Xin Chào ai đó");
//        fw .close();
//         ý 2: đọc chuỗi từ txt
        FileReader fileReader =new FileReader("C:\\Users\\Doan Thi Huong\\IdeaProjects\\MD2\\src\\TextFille\\BaiTapNhom\\Read.txt" );
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // Tạo thêm một rổ để hứng.
         String[] s = bufferedReader.readLine().split(",");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        bufferedReader.close();
        fileReader.close();
    }
}
