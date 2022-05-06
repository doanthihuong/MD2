package baiTapNgoai.manage;

import baiTapNgoai.mode.User;

import java.util.ArrayList;
import java.util.List;

public class ManageUser implements GeneralManage<User> {
    List<User> userList = new ArrayList<>();
    public static User currentUser = null;

    @Override
    public void add(User user) {
        userList.add(user);
    }

    @Override
    public User findById(int id) {
        return userList.get(findIndexById(id));
    }

    @Override
    public void edit(int id, User user) {
        userList.set(findIndexById(id), user);
    }

    @Override
    public void delete(int id) {
        userList.remove(findIndexById(id));
    }

    @Override
    public void findAll() {
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }


}