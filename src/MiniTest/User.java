package MiniTest;

public class User {
    private String name;
    private int phonenumber;
    private String address;
    private String emai;
    private String facebook;

    public User() {
    }

    public User(String name, int phonenumber, String address, String emai, String facebook) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.emai = emai;
        this.facebook = facebook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String toString() {
        return "name: " + name  +
                ", phonenumber: " + phonenumber +
                ", address: " + address  +
                ", emai: " + emai  +
                ", facebook: " + facebook  ;
    }
}
