package model;

import javax.swing.*;

public class Room {
    public Room(int ID, String name, String imageDir) throws Exception {
        this.ID = ID;
        this.roomName = name;
        this.roomImage = createImage(imageDir);
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

    public String getRoomName() {
        return roomName;
    }

    public ImageIcon getRoomImage() {
        return roomImage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    };
    private String roomName;

    private ImageIcon roomImage;
    private int ID;


}
