package model;

import javax.swing.*;

public class Player {

    public Player(String name, String imageDir, int ID) throws Exception {
        this.playerName = name;
        this.playerImage = createImage(imageDir);
        //this.user = user;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ImageIcon getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(ImageIcon playerImage) {
        this.playerImage = playerImage;
    }

    public User getUser() {
        return this.user;
    }

    public void setUsertoPlayer(User user) {
        this.user = user;
    }


    public ImageIcon createImage(String image) throws Exception{
        try {
            this.playerImage = new ImageIcon(image);
        } catch (Exception e) {
            System.out.println("Failed to load image: " + image);
            throw e;
        }
        return this.playerImage;
    }

    private String playerName;
    private ImageIcon playerImage;
    private User user;
    private int ID;

}
