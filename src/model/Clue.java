package model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Clue {
    public Clue(){
        playersClues = new LinkedList<>();
        weaponClues = new LinkedList<>();
        roomsClues = new LinkedList<>();
    }

    public void addPlayerClue(Player player) {
        this.playersClues.add(player);
    }

    public void addWeaponClue(Weapon weapon){
        this.weaponClues.add(weapon);
    }

    public void addRoomClue(Room room){
        this.roomsClues.add(room);
    }

    private final LinkedList<Player> playersClues;
    private final LinkedList<Weapon> weaponClues;
    private final LinkedList<Room>roomsClues;
}
