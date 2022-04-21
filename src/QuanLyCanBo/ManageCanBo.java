package QuanLyCanBo;

import java.util.ArrayList;
import java.util.List;

public class ManageCanBo implements Manage<CanBo> {
    List<CanBo> QuanLycb = new ArrayList<>();

    @Override
    public void Add(CanBo canBo) {
        QuanLycb.add(canBo);
    }

    @Override
    public CanBo Search(String name) {
        for (int i = 0; i < QuanLycb.size(); i++) {
            if (QuanLycb.get(i).getName().equals(name)) {
                return QuanLycb.get(i);
            }

        }
        return null;
    }

    @Override
    public void Display() {
        for (int i = 0; i < QuanLycb.size(); i++) {
            System.out.println(QuanLycb.get(i) );

        }

    }

    @Override
    public void Exit() {
        System.exit(0);

    }
 public static void main(String[] args) {

    CanBo cb=new CanBo("Đoàn Thị Hường", 20, "Nữ", "Hà Tĩnh");
    CanBo cb1= new CanBo(" Tăng Thi Hoa", 22,"Nữ","Nghệ An");
    CanBo cb2= new CanBo(" Tăng Thanh Hà", 24,"Nữ","Hà Nội");
    CanBo cb3= new CanBo(" Bùi Mỹ Ân", 28,"Nữ","Huế");
// chưa xong
}
}


