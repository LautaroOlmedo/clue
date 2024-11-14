package model;

public class Crime {
    public Crime(Impostor impostor, Tools tool, Room room) {
        this.impostor = impostor;
        this.tool = tool;
        this.room = room;
    }

    public Impostor getImpostor() {
        return impostor;
    }

    public void setImpostor(Impostor impostor) {
        this.impostor = impostor;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Tools getTool() {
        return tool;
    }

    public void setTool(Tools tool) {
        this.tool = tool;
    }

    private Impostor impostor;
    private Room room;
    private Tools tool;
}
