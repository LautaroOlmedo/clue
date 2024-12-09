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

    public Room getRoom() {
        return room;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    private Impostor impostor;
    private Room room;
    private Weapon weapon;
}
