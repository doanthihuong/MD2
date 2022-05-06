package baiTapNgoai;

import baiTapNgoai.manage.ManageRole;
import baiTapNgoai.manage.ManageUser;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file =new File("role.csv");
        ManageRole manageRole =new ManageRole();
        File file1 = new File( "user.csv");
        ManageUser manageUser=new ManageUser();

        manageRole.showAll();
    }
}
