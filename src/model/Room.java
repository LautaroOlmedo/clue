package model;

public class Room {
    public Room(String name, int id) {
        this.roomName = name;
        this.ID = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String[] getRoomTexts() {
        return roomTexts;
    }

    public void setRoomTexts(String[] roomTexts) {
        this.roomTexts = roomTexts;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    };
    private String roomName;
    private String[] roomTexts;
    private String roomImage;
    private int ID;


}
