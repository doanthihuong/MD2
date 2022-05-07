package caseStudy.mode1;

public class Receipt {
    //borrowed time : thời gian thuê
  // pay time :  thời gian trả
    private String identity;
    private String name;
    private int borrowedTime;
    private int payTime;
    private Bicycle bicycle;

    public Receipt() {
    }

    public Receipt(String identity, String name, int borrowedTime, int payTime, Bicycle bicycle) {
        this.identity = identity;
        this.name = name;
        this.borrowedTime = borrowedTime;
        this.payTime = payTime;
        this.bicycle = bicycle;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorrowedTime() {
        return borrowedTime;
    }

    public void setBorrowedTime(int borrowedTime) {
        this.borrowedTime = borrowedTime;
    }

    public int getPayTime() {
        return payTime;
    }

    public void setPayTime(int payTime) {
        this.payTime = payTime;
    }

    public Bicycle getBicycle() {
        return bicycle;
    }

    public void setBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public String toString() {
        return "Receipt: " +
                "identity: " + identity +
                ", name : " + name +
                ", borrowedTime: " + borrowedTime +
                ", payTime: " + payTime +
                ", bicycle: " + bicycle ;
    }
}
