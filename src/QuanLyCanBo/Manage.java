package QuanLyCanBo;

public interface Manage<T> {
    void Add(T t);
    CanBo Search(String name);
    void Display();
    void Exit();
}
