package caseStudy.mode1;

public class Bicycle {
    //License plate: biển số
    private int id;
    private int licensePlate;
    private String color;
    private String status;
    private String rentCost;

    public Bicycle() {
    }

    public Bicycle(int id, int licensePlate, String color, String status, String rentCost) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.color = color;
        this.status = status;
        this.rentCost = rentCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(int licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRentCost() {
        return rentCost;
    }

    public void setRentCost(String rentCost) {
        this.rentCost = rentCost;
    }

    @Override
    public String toString() {
        return "Bicycle: " +
                "id: " + id +
                ", licensePlate: " + licensePlate +
                ", color: " + color +
                ", status: " + status +
                ", rentCost: " + rentCost ;
    }
}
