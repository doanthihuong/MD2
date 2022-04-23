package QuanLyThuVien;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiLieu  implements QuanLy<TaiLieu>{
    private List<TaiLieu> ql =new ArrayList<>();
    public QuanLyTaiLieu() {
        ql.add(new Sach("Kim Đồng",120,"a",90));
        ql.add(new Bao("aaaa",120,90));
        ql.add(new TapChi("aaaa",100,80));
    }

    @Override
    public void add(TaiLieu taiLieu) {
        ql.add(taiLieu);
    }

    @Override
    public void delete() {

    }

    @Override
    public int  search(String name) {
        for (int i = 0; i < ql.size() ; i++) {
            if ( ql.get(i).getNxb().equals(name)){
                System.out.println(ql.get(i));
            }
                return i;
            }

        return -1;
    }

    @Override
    public void display() {
        for (TaiLieu t: ql ) {
            System.out.println(ql);
        }
    }

    @Override
    public void exit() {
        System.exit(0);

    }
}
