package BaiTapNhom;

import java.io.FileReader;
import java.io.FileWriter;

public class WriteRead {
//    Nhóm 3: Ghi ra file "Hello world" với FileWriter,
//    đọc 1 dãy số từ file với FileReader. chị Hường trình bày.
    public static void main(String[] args) throws Exception {
        String str = " Hello ai đó! ";
        FileWriter fileWriter = new FileWriter("gido.txt");
        fileWriter.write(str);
        fileWriter.close();
//        đọc
        FileReader reader = new FileReader("gido.txt");
        int c;
        while (true) {
            c = reader.read();
            if (c == -1) {
                break;
            }
            System.out.print((char) c);
        }

    }
}
