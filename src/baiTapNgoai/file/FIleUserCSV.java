package baiTapNgoai.file;

import baiTapNgoai.mode.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FIleUserCSV {
    // có 2 phương thức viết và đọc
    // viết
    public static List<User> readFromFile() throws FileNotFoundException {
        File userFile = new File("user.csv");
       List<User> users =new ArrayList<>();
       Scanner sc =new Scanner(userFile);
       sc.nextLine();
       while (sc.hasNext()){
           String line =sc.nextLine();
           String[] array=line.split(",");
           users.add(new User());
       }
       return users;
    }
}
