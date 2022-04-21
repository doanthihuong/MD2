package QuanLySach;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiLieu implements QuanLy<TaiLieu>{
    List<TaiLieu> QlTaiLieu = new ArrayList<>();

    @Override
    public void add(TaiLieu taiLieu) {
        QlTaiLieu.add(taiLieu);
    }

    public int find(int maso) {
        for (int i = 0; i < QlTaiLieu.size(); i++) {
            if (QlTaiLieu.get(i).getMaso() == maso) {
                return i;
            }
        }
        return -1;
    }

    public void findDocByID(int maso) {
        int index = find(maso);
        if (index == -1) {
            System.out.println("Không có");
        } else {
            System.out.println(QlTaiLieu.get(index).toString());
        }
    }

    @Override
    public void display() {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void exit() {

    }

//    @Override
//    public void findByTaiLieu(QuanLySach.TaiLieu taiLieu) {
//
//    }
//
//    @Override
//    public void add(Sach sach) {
//        QlSach.add(Sach sach);
//        QlSach.add( )
//
//    }
//
//    @Override
//    public Object find(String name) {
//        return null;
//    }
//
//    @Override
//    public void display() {
//
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
//
//    @Override
//    public void exit() {
//
//    }
//
//    @Override
//    public void findByTaiLieu(Object o) {
//
//    }
}
