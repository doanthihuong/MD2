package QuanLyCanBo;

public class main {
    static ManageCanBo manageCanBo = new ManageCanBo();
    public static void main(String[] args) {
        CongNhan cn=new CongNhan("Đoàn Thị Hường", 20, "Nữ", "Hà Tĩnh",1);
        KySu ks= new KySu(" Tăng Thi Hoa", 22,"Nữ","Nghệ An","Xây Dựng");
        CanBo ks1= new CanBo(" Tăng Thanh Hà", 24,"Nữ","Hà Nội");
        CanBo cb3= new CanBo(" Bùi Mỹ Ân", 28,"Nữ","Huế");
          manageCanBo.Add(ks);
          manageCanBo.Add(cn);
          manageCanBo.Add(cb3);
          manageCanBo.Display();


    }
}
