package MiniTest1;

import javax.xml.soap.Name;

public class StudentsManage implements Manage<Students> {
    private Students[] DanhSach = new Students[3];
    private int Size = 0;

    @Override
    public void Add(Students student) {
        DanhSach[Size] = student;
        Size++;

    }

    @Override
    public void Edit(String name, Students students) {
    DanhSach[Search(name)] =students;
    }

    @Override
    public int Search(String name) {
        for (int i = 0; i < Size; i++) {
            if (name == DanhSach[i].getName()) {
                return i;
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
        Students st1= new Students(1 ,"Anh",  18 , 50);
        Students st2 =new Students( 2, "Ngọc", 20, 70);
        ql.Add(st1);
        ql.Add(st2);
        ql.Display();
        System.out.println(ql.Search( "Mai" ));
        Students st3 =new Students( 5, "dung", 23, 70);
        ql.Edit("Ngọc" ,st3 );
        ql.Display();



    }

}
