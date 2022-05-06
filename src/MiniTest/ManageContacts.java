package MiniTest;

import MiniTest1.Students;
import WriteRead.ArrayList;

import javax.jws.soap.SOAPBinding;

public class ManageContacts implements Manage1 {
    private User[] list = new User[5];
    private int size = 0;

    @Override
    public void Add(User user) {
        list[size] = (user);
        size++;
    }

    @Override
    public void Edit(String name, Object o) {
        list[Search(name)] = (User) o;
    }

    @Override
    public void Delete(String name) {
        int index = Search(name);
        if (index == -1) {
            System.out.println("không có tên này");
        } else {

        }
    }

    @Override
    public int Search(String name) {
        for (int i = 0; i < size; i++) {
            if (name == list[i].getName()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void Display() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);

        }

    }
}
