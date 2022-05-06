package TextFille.GhiDuLieuDocDuLieu;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestMain {
    //viêt một chuỗi
    //viết một đối tượng hoặc một danh sách đối tượng
    // đọc dữ liệu từ file
    public static void main(String[] args) throws IOException {
        String [] name ={ "Hường" ,"lan", "Cúc Họa Mi"};
            FileWriter fw =new FileWriter("data.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < name.length; i++) {
            bw.write(name[i]);
        }
            bw.close();
            fw.close();
    }
}
