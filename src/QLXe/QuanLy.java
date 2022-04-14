package QLXe;

public interface QuanLy<T> {
    void them(T t);

    void sua(T t);

    void xoa(String name );

    T timkiem(String name);

    void sapxep();

    void print();
}
