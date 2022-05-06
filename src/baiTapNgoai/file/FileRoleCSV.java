package baiTapNgoai.file;

import baiTapNgoai.manage.ManageRole;
import baiTapNgoai.mode.Role;
import baiTapNgoai.mode.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRoleCSV {
    // có 2 phương thức viết và đọc
    //viết
    public static List<Role> readFromFile() throws FileNotFoundException {
        File roleFile = new File("role.csv");
        List<Role>roles = new ArrayList<>();
        Scanner sc=new Scanner(roleFile);
        sc.nextLine();
        Scanner scanner = null;
        List<Role> users = null;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            } else {
                String arr[] = line.split(",");
                ManageRole manageRole = null;
                Role role = manageRole.findById(Integer.valueOf(arr[3]));
//                User user = new User(Integer.valueOf(arr[0]), arr[1], arr[2], role, arr[4]);
//                users.add(user);
            }
        }
        return users;
    }
}
