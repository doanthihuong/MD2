package MiniTest;

public interface Manage1<T> {

    void Add(User user);

    void Edit(String name, T t);

    void Delete(String name);

    int Search(String name);

    void Display();
}
