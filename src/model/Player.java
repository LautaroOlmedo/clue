package model;

import javax.swing.*;

public class Player {

    public Player(int ID, String name, String imageDir) throws Exception {
        this.ID = ID;
        this.playerName = name;
        this.playerImage = createImage(imageDir);
        this.clueAdded = false;
    }

    public int getID() {
        return ID;
    }
    public String getName() {
        return playerName;
    }
    public void setClueAdded(boolean clueAdded) {
        this.clueAdded = clueAdded;
    }
    public boolean getClueAdded() {
        return this.clueAdded;
    }

    public ImageIcon getPlayerImage() {
        return playerImage;
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
    private boolean clueAdded;

}
