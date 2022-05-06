package caseStudy.mode1;

public class Account {
    private String userName,passWord, email;
    private long phoneNumber;

    public Account() {
    }

    public Account(String userName, String passWord, String email, long phoneNumber) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Account: " +
                "userName: " + userName +
                ", passWord: " + passWord +
                ", email: " + email +
                ", phoneNumber: " + phoneNumber ;
    }
}
