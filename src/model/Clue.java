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

    public Player getPLayerByID(int playerID) {
        for (Player player : playersClues) {
            if (player.getID() == playerID) {
                return player;
            }
        }
        return null;
    }

    public Weapon getWeaponByID(int weaponID) {
        for (Weapon weapon : weaponClues) {
            if (weapon.getID() == weaponID) {
                return weapon;
            }
        }
        return null;
    }

    public Room getRoomByID(int weaponID) {
        for (Room room : roomsClues) {
            if (room.getID() == weaponID) {
                return room;
            }
        }
        return null;
    }

    public LinkedList<Weapon> getWeaponClues() {
        return weaponClues;
    }

    public LinkedList<Room> getRoomsClues() {
        return roomsClues;
    }

    private final LinkedList<Player> playersClues;
    private final LinkedList<Weapon> weaponClues;
    private final LinkedList<Room>roomsClues;
}