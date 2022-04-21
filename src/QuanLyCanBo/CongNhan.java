package QuanLyCanBo;

public class CongNhan extends CanBo{
    private int level;

    public CongNhan() {
    }

    public CongNhan(int level) {
        this.level = level;
    }

    public CongNhan(String name, int age, String sex, String address, int level) {
        super(name, age, sex, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public String toString() {

        return "KySu{" + super.toString()+
                "level=" + level +
                '}';
    }
}
