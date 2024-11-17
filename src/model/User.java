package model;

import java.util.Queue;

public class User {
    public User(String userName){
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
    private String userName;
    private Clues clues;
}
