package model;

import javax.swing.*;

public class Room {
    public Room(int ID, String name, String imageDir) throws Exception {
        this.ID = ID;
        this.roomName = name;
        this.roomImage = createImage(imageDir);
        this.visitsMade = 0;
        this.clueAdded = false;
    }

    public ImageIcon createImage(String image) throws Exception{
        try {
            this.roomImage = new ImageIcon(image);
        } catch (Exception e) {
            System.out.println("Failed to load image: " + image);
            throw e;
        }
        return this.roomImage;
    }

    public int getID() {
        return ID;
    }

    public void setClueAdded(boolean clueAdded) {
        this.clueAdded = clueAdded;
    }

    public boolean getClueAdded() {
        return this.clueAdded;
    }

    public ImageIcon getRoomImage() {
        return roomImage;
    }

    public void investigate(){
        System.out.println("visitas realizadas" + this.visitsMade);
        this.visitsMade++;
    }
    public int getVisitsMade() {
        return visitsMade;
    }

    private String roomName;
    private ImageIcon roomImage;
    private int ID;
    private int visitsMade;
    private boolean clueAdded;


}
