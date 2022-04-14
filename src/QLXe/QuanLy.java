package QLXe;

public interface QuanLy<T> {
    void them(Oto Oto);

    void them(T t);

    void sua(String id, T t);

    void xoa(String name );

    int timkiem(String name);

    void sapxep();

    void print();
}
