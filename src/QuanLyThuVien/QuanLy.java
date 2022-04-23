package QuanLyThuVien;

import QuanLyCanBo.CanBo;

public interface QuanLy<T> {
    void add(T t);
    void delete();
    int search(String name);
    void display();
    void exit();
}
