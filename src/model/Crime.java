package model;

public class Crime {
    public Crime(Impostor impostor, Weapon weapon, Room room) {
        this.impostor = impostor;
        this.weapon = weapon;
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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private Impostor impostor;
    private Room room;
    private Weapon weapon;
}
