package model;

public class User {
    public User(String userName){
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
    private String userName;
    private Clue clue;
}
