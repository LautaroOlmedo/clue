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

    public void setRoomTexts(int id) {
        String[] roomTexts = new String[10];
        if(id == 1){
            // BUSCAR EN UN ARCHIVO .TXT O LA EXTENSIÓN QUE SEA LOS DISTINTOS DIALOGOS PARA LA SALA CORRECTA.
        }

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
