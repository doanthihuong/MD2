package MiniTest1;

import QLXe.Oto;

public interface Manage <T> {

    void Add(T t);
    void Edit(String id, T t);
    int Search(String name);
    void Display();
}
