package model;

import java.util.Queue;

public class Clues {
    public Clues(){}

    public Queue<Player> getPlayersClues() {
        return playersClues;
    }

    public Queue<Weapon> getWeaponClues() {
        return weaponClues;
    }

    public Queue<Room> getRoomsClues() {
        return roomsClues;
    }

    private Queue<Player> playersClues;
    private Queue<Weapon> weaponClues;
    private Queue<Room> roomsClues;
}
