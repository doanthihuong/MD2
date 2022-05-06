package baiTapNgoai.mode;

public class User {
    private int id;
    private int password;
    private String username;
    private String status;
    private Role role;

    public User() {
    }


    public User(int id, int password, String username, String status, String role) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.status = status;
//        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public String getRole() {
//        return role;
//    }

//    public void setRole(String role) {
//        this.role = role;
//    }

    @Override
    public String toString() {
        return "User " +
                "id : " + id +
                ", password : " + password +
                ", username : " + username + '\'' +
                ", status : " + status + '\'' +
                ", role : " + role ;
    }
}
