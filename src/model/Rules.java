package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Rules {
    public User createUser(){
        user = new User("Lautaro");
        return user;
    }
    public void startGame() throws Exception {
        user = this.createUser();
        players = this.createPlayers();
        weapons = this.createWeapons();
        rooms = this.createRooms();
        impostor = this.generateImpostor();
        crime = this.generateCrime();
    }

    public ArrayList<Player> createPlayers() throws Exception {
        try {
            Player missBlue = new Player(1, "Mrs Peacock", "/home/lautaro/IdeaProjects/clue/src/model/images/players/miss-blue.jpeg" );
            Player missRed = new Player(2, "Miss Scarlet", "/home/lautaro/IdeaProjects/clue/src/model/images/players/miss-red.jpeg");
            Player mrGreen = new Player(3, "Mr Green", "/home/lautaro/IdeaProjects/clue/src/model/images/players/mr-green.jpeg");
            Player mrViolet = new Player(4, "Prof Plum", "/home/lautaro/IdeaProjects/clue/src/model/images/players/violet.jpeg");
            //System.out.println("players created correctly");
            players.add(missBlue);
            players.add(missRed);
            players.add(mrGreen);
            players.add(mrViolet);
            //System.out.println("players added to arrayList correctly");
        }catch (Exception e){
            System.out.println("Failed to create players or load images: " + e.getMessage());
            e.printStackTrace();
        }
        return players;
    }

  public ArrayList<Weapon> createWeapons() throws Exception{
      try {
            Weapon candlestick = new Weapon(1, "Candelabro", "/home/lautaro/IdeaProjects/clue/src/model/images/weapons/vela.jpeg");
            Weapon carvinKnife = new Weapon(2, "Cuchillo", "/home/lautaro/IdeaProjects/clue/src/model/images/weapons/knife.jpeg");
            Weapon gun = new Weapon(3, "Revolver", "/home/lautaro/IdeaProjects/clue/src/model/images/weapons/gun.jpeg");
            Weapon pipe = new Weapon(4, "TuberÍa", "/home/lautaro/IdeaProjects/clue/src/model/images/weapons/pipe.jpeg");
          System.out.println("weapons created correctly");
            weapons.add(candlestick);
            weapons.add(carvinKnife);
            weapons.add(gun);
            weapons.add(pipe);
          System.out.println("weapons added to arrayList correctly");
          System.out.println("weapons quantity:" + weapons.size());
      } catch (Exception e) {
          System.out.println("Failed to create weapons or load images: " + e.getMessage());
          e.printStackTrace();
      }
      return weapons;
  }

    public ArrayList<Room> createRooms(){
        try{
            Room kitchen = new Room(1, "Kitchen", "/home/lautaro/IdeaProjects/clue/src/model/images/rooms/library.jpeg");
            Room diningRoom = new Room(2, "Dining Room", "/home/lautaro/IdeaProjects/clue/src/model/images/rooms/dining-room.jpeg");
            Room ballroom = new Room(3, "Ball Room", "/home/lautaro/IdeaProjects/clue/src/model/images/rooms/ball-room.jpeg");
            Room billiardRoom = new Room(4, "Billiard Room", "/home/lautaro/IdeaProjects/clue/src/model/images/rooms/billiard-room.jpeg");
            Room hall = new Room(5, "Hall", "/home/lautaro/IdeaProjects/clue/src/model/images/rooms/hall.jpeg");
            Room library = new Room(6, "Library", "/home/lautaro/IdeaProjects/clue/src/model/images/rooms/library.jpeg");
            Room lounge = new Room(7, "Lounge", "/home/lautaro/IdeaProjects/clue/src/model/images/rooms/lounge.jpeg");
            Room study = new Room(8, "Study", "/home/lautaro/IdeaProjects/clue/src/model/images/rooms/study.jpeg");
            Room conservatory = new Room(9, "Conservatory", "/home/lautaro/IdeaProjects/clue/src/model/images/rooms/conservatory.jpeg");
            //System.out.println("rooms created correctly");
            rooms.add(kitchen);
            rooms.add(diningRoom);
            rooms.add(ballroom);
            rooms.add(billiardRoom);
            rooms.add(hall);
            rooms.add(library);
            rooms.add(lounge);
            rooms.add(study);
            rooms.add(conservatory);
            //System.out.println("rooms added to arrayList correctly");
        } catch (Exception e) {
            System.out.println("Failed to create rooms or load images: " + e.getMessage());
            e.printStackTrace();
        }
        return rooms;
    }

    public Impostor generateImpostor(){
        Player selectedPlayer = getRandomPlayer();
        impostor = new Impostor(selectedPlayer);
        return impostor;
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }

    private int getRandomNumberBetweenOneAndNine() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public int getRandomNumberBetBetweenOneAndFour() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    private Player getRandomPlayer(){
        Iterator<Player> playerIterator = players.iterator();
        int random = getRandomNumber();
        Player selectedPlayer = null;

        while(playerIterator.hasNext()){
            Player player = playerIterator.next();
            if(player.getID() == random){
                selectedPlayer = player;

            }
        }
        return selectedPlayer; // POSIBLE NULL?
    }

    public Player getInocentPlayer() {
        if (players.isEmpty()) {
            return null; // No quedan jugadores
        }
        Player selectedPlayer = null;
        for (Player player : players) {
            int random = getRandomNumber();
            if (player.getID() == random && player.getID() != impostor.getPlayer().getID() && !player.getClueAdded()) {
                selectedPlayer = player;
                selectedPlayer.setClueAdded(true);
                this.clues.addPlayerClue(selectedPlayer);
                break;
            }
        }
        return selectedPlayer;
    }


    public Weapon getRandomWeapon(){
        Iterator<Weapon> weaponsIterator = weapons.iterator();
        int random = getRandomNumber();
        Weapon selectedWeapon = null;
        while(weaponsIterator.hasNext()){
            Weapon weapon = weaponsIterator.next();
            if(weapon.getID() == random){
                selectedWeapon = weapon;
            }
        }
        return selectedWeapon;
    }

    public Weapon getInocentWeapon() {
        if (weapons.isEmpty()) {
            return null;
        }
        Weapon selectedWeapon = null;
        for (Weapon weapon : weapons) {
            int random = getRandomNumber();
            if (weapon.getID() == random && weapon.getID() != crime.getWeapon().getID() && !weapon.getClueAdded()) {
                selectedWeapon = weapon;
                selectedWeapon.setClueAdded(true);
                this.clues.addWeaponClue(selectedWeapon);
                break;
            }
        }
        return selectedWeapon;
    }


    public Room getRandomRoom(){
        Iterator<Room> roomIterator = rooms.iterator();
        int random = getRandomNumberBetweenOneAndNine();
        Room selectedRoom = null;
        while(roomIterator.hasNext()){
            Room room = roomIterator.next();
            if(room.getID() == random){
                selectedRoom = room;
            }
        }
        return selectedRoom;
    }

    public Room getInocentRoom(){
        if(rooms.isEmpty()){
            return null;
        }
        Room selectedRoom = null;
        for (Room room : rooms) {
            int random = getRandomNumberBetweenOneAndNine();
            if (room.getID() == random && room.getID() != crime.getRoom().getID() && !room.getClueAdded()) {
                selectedRoom = room;
                selectedRoom.setClueAdded(true);
                this.clues.addRoomClue(selectedRoom);
                break;
            }
        }
        return selectedRoom;
    }

    public Crime generateCrime(){
        crime = new Crime(impostor, this.getRandomWeapon(), this.getRandomRoom());
        return crime;
    }

    public void addPlayerClue(Player player){
        this.clues.addPlayerClue(player);
    }
    public void addWeaponClue(Weapon weapon){
        this.clues.addWeaponClue(weapon);
    }
    public void addRoomClue(Room room){
        this.clues.addRoomClue(room);
    }

    public boolean accusePlayer(Player player, Room room, Weapon weapon){
        return this.verifyAccusation(player, room, weapon);
    }

    private boolean verifyAccusation(Player player, Room room, Weapon weapon){
        return crime.getRoom().equals(room) && crime.getWeapon().equals(weapon) && impostor.getPlayer().equals(player);
    }

    public Impostor getImpostor() {
        return impostor;
    }

    public Crime getCrime() {
        return crime;
    }

    public boolean areThereCluesLeftToAdd() {

        for (Player player : players) {
            if (!player.getClueAdded()) {
                return true;
            }
        }
        for (Weapon weapon : weapons) {
            if (!weapon.getClueAdded()) {
                return true;
            }
        }
        for (Room room : rooms) {
            if (!room.getClueAdded()) {
                return true;
            }
        }

        return false;
    }


    public boolean validateAllowedClues(){
        return this.getPlayersAllowed() > 1 || this.getWeaponsAllowed() > 1 || this.getRoomsAllowed() > 1;
    }


    public int getPlayersAllowed(){
        return players.size();
    }

    public int getWeaponsAllowed(){
        return weapons.size();
    }

    public int getRoomsAllowed(){
        return rooms.size();
    }


    public void sumCluePage(){
        this.cluePage++;
    }

    public int getCluePage(){
        return this.cluePage;
    }
    public void resetCluePage() {
        this.cluePage = 1;
    }

    public void investigateRoom(int ID){
        Room room = getRoomByID(ID);
        room.investigate();
    }

    public boolean validateVisitRoom(int ID){
        Room room = getRoomByID(ID);
        if (room.getVisitsMade() <= 1){
            return true;
        }
      return false;
    }

    public Player getPlayerByID(int ID) {
        for (Player player : players) {
            if (player.getID() == ID) {
                return player; // Retorna el jugador si el ID coincide
            }
        }
        return null; // Retorna null si no se encuentra ningún jugador con el ID proporcionado
    }

    public Weapon getWeaponByID(int ID) {
        for (Weapon weapon : weapons) {
            if (weapon.getID() == ID) {
                return weapon; // Retorna el arma si el ID coincide
            }
        }
        return null; // Retorna null si no se encuentra ningún arma con el ID proporcionado
    }


    public Room getRoomByID(int ID) {
        for (Room room : rooms) {
            if (room.getID() == ID) {
                return room;
            }
        }
        return null;
    }



    private User user;
    private Impostor impostor;
    private Crime crime;
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Weapon> weapons = new ArrayList<>();
    private ArrayList<Room> rooms = new ArrayList<>();
    private Clue clues = new Clue();
    private int plays;
    private final int maxPLays = 12;
    private int cluePage = 1;

}

