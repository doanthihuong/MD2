package caseStudy.mode1;

import java.util.Date;

public class


Bus {
    private int id;
    private String licensePlate,status,driverOfName,line;
    private int  numberOfSeats,ticketOfPrice, turnover;
    private Date departureDate;
    public Bus() {
    }

    public Bus(int id, String licensePlate, String status, String driverOfName, String line, int numberOfSeats, int ticketOfPrice, int turnover, Date departureDate) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.status = status;
        this.driverOfName = driverOfName;
        this.line = line;
        this.numberOfSeats = numberOfSeats;
        this.ticketOfPrice = ticketOfPrice;
        this.turnover = turnover;
        this.departureDate = departureDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDriverOfName() {
        return driverOfName;
    }

    public void setDriverOfName(String driverOfName) {
        this.driverOfName = driverOfName;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getTicketOfPrice() {
        return ticketOfPrice;
    }

    public void setTicketOfPrice(int ticketOfPrice) {
        this.ticketOfPrice = ticketOfPrice;
    }

    public int getTurnover() {
        return turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    @Override
    public String toString() {
        return "Bus:" +
                ",id: " + id+
                "licensePlate: " + licensePlate  +
                ", status: " + status +
                ", driverOfName: " + driverOfName  +
                ", line : " + line +
                ", date: " + departureDate  +
                ", numberOfSeats: " + numberOfSeats +
                ", ticketOfPrice: " + ticketOfPrice +
                ", turnover :" + turnover ;
    }
}
