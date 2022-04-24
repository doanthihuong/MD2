package OnTap;

import java.util.Objects;

public class MyDate2 {
    //    Hiểu rõ hơn về get và set
    private int day;
    private int month;
    private int year;

    public MyDate2(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("0");
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("0");
        }
        if (year > 1) {
            this.year = year;
        } else {
            System.out.println("0");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
//        điều kiện ngày lớn hơn 1, nhỏ hơn 31.
        if(day >=1 && day <=31)
        this.day = day;
    }

    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {
        //         tháng lớn  hơn 1 , nhỏ hơn 12
        if(month>=1 && month <=12)
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
//        Năm nhỏ hơn 1
        if ( year >1)
        this.year = year;
    }

//    @Override
//    public String toString() {
//        return "MyDate :" + day +
//                "/" + month +
//                "/" + year ;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate2 myDate2 = (MyDate2) o;
        return day == myDate2.day && month == myDate2.month && year == myDate2.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}


