package MiniTest1;

public class StudentsManage implements Manage<Students> {
    private Students[] DanhSach = new Students[3];
    private int Size = 0;

    @Override
    public void Add(Students student) {
        DanhSach[Size] = student;
        Size++;

    }

    @Override
    public void Edit(String id, Students students) {

    }

    @Override
    public int Search(String name) {
        for (int i = 0; i < Size; i++) {
            if (name == DanhSach[i].getName()) {

            }

        }
        return -1;
    }

    @Override
    public void Display() {
        for (int i = 0; i < Size; i++) {
            System.out.println(DanhSach[i]);
        }
    }

    public static void main(String[] args) {
        StudentsManage ql =new StudentsManage();
        Students st1= new Students(1 ," Anh", 18 , 50);
        Students st2 =new Students( 2, " Ngọc", 20, 70);
        ql.Add(st1);


    }

}
