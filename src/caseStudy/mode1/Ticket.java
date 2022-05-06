package caseStudy.mode1;

import java.util.Date;

public class
Ticket {
//  departureDate : ngày xuất phát
    private int phoneNumber;
    private String name ;
    private String line;
    private Date departureDate;

    public Ticket() {
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Ticket(int phoneNumber, String name, String line, Date departureDate) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.line = line;
        this.departureDate = departureDate;

    }

    @Override
    public String toString() {
        return "Ticket : " +
                "phoneNumber : " + phoneNumber +
                ", name: " + name +
                ", line: " + line +
                ", departureDate: " + departureDate;
    }
}
