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
        tools = this.createTools();
        rooms = this.createRooms();
        impostor = this.generateImpostor();
        crime = this.generateCrime();
    }

    public ArrayList<Player> createPlayers() throws Exception {
        try {
            Player junior = new Player("Junior", "/Users/lautaroolmedo/IdeaProjects/clue-videogame/src/model/images/perfilCuco.jpeg", 1);
            Player semiSr = new Player("SemiSr", "/Users/lautaroolmedo/IdeaProjects/clue-videogame/src/model/images/perfilCuco.jpeg", 2);
            Player senior = new Player("Senior", "/Users/lautaroolmedo/IdeaProjects/clue-videogame/src/model/images/perfilCuco.jpeg", 3);
            System.out.println("players created correctly");
            players.add(junior);
            players.add(semiSr);
            players.add(senior);
            System.out.println("players added to arrayList correctly");
        }catch (Exception e){
            System.out.println("Failed to create players or load images: " + e.getMessage());
            e.printStackTrace();
        }
        return players;
    }

  public ArrayList<Tools> createTools() throws Exception{
      try {
            Tools pen = new Tools(1, "", "");
            Tools VPN = new Tools(2, "", "");
            Tools principalServer = new Tools(3, "", "");
      } catch (Exception e) {
          System.out.println("Failed to create tools or load images: " + e.getMessage());
          e.printStackTrace();
      }
      return tools;
  }

    public ArrayList<Room> createRooms(){
        try{
            Room kitchen = new Room("kitchen", 1);
            Room diningRoom = new Room("diningRoom", 2);
            Room balcony = new Room("balcony", 3);
            Room masterBathroom = new Room("masterBathroom", 4);
            Room study = new Room("study", 5);
            Room sittingRoom = new Room("sittingRoom", 5);
            Room basement = new Room("basement", 6);
            Room masterBedroom = new Room("masterBedroom", 7);
            rooms.add(kitchen);
            rooms.add(diningRoom);
            rooms.add(balcony);
            rooms.add(masterBathroom);
            rooms.add(study);
            rooms.add(sittingRoom);
            rooms.add(basement);
            rooms.add(masterBedroom);

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
        return random.nextInt(3) + 1; // Genera un número entre 0 y 2, luego suma 1 para obtener entre 1 y 3
    }

    public Player getPlayerByName(String name) {
        Iterator<Player> playerIterator = players.iterator();
        while (playerIterator.hasNext()) {
            Player player = playerIterator.next();
            if (player.getPlayerName().equalsIgnoreCase(name)) { // Comparación ignorando mayúsculas y minúsculas
                return player;
            }
        }
        return null; // Devuelve null si no se encuentra el jugador
    }

    public Tools getToolByName(String name) {
        Iterator<Tools> toolsIterator = tools.iterator();
        while (toolsIterator.hasNext()) {
            Tools tool = toolsIterator.next();
            if (tool.getToolName().equalsIgnoreCase(name)) {
                return tool;
            }
        }
        return null; // Devuelve null si no se encuentra la herramienta con el nombre especificado
    }

    public Room getRoomByName(String name) {
        Iterator<Room> roomIterator = rooms.iterator();
        while (roomIterator.hasNext()) {
            Room room = roomIterator.next();
            if (room.getRoomName().equalsIgnoreCase(name)) { // Comparación ignorando mayúsculas y minúsculas
                return room;
            }
        }
        return null; // Devuelve null si no se encuentra la habitación
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

    private Tools getRandomTool(){
        Iterator<Tools> toolsIterator = tools.iterator();
        int random = getRandomNumber();
        Tools selectedTool = null;
        while(toolsIterator.hasNext()){
            Tools tool = toolsIterator.next();
            if(tool.getID() == random){
                selectedTool = tool;
            }
        }
        return selectedTool;
    }

    private Room getRandomRoom(){
        Iterator<Room> roomIterator = rooms.iterator();
        int random = getRandomNumber();
        Room selectedRoom = null;
        while(roomIterator.hasNext()){
            Room room = roomIterator.next();
            if(room.getID() == random){
                selectedRoom = room;
            }
        }
        return selectedRoom;
    }

    public Crime generateCrime(){
        crime = new Crime(impostor, this.getRandomTool(), this.getRandomRoom());
        return crime;
    }

    public void investigateRoom(Room room){
        if(crime.getRoom().equals(room)){
            System.out.println("evento correspondiente a habitacion correcta");
        }else{
            System.out.println("evento correspondiente a habicacion incorrecta");
        }
    }

    public boolean accusePlayer(Player player, Room room, Tools tool){
        return verifyAccusation(player, room, tool);
    }

    private boolean verifyAccusation(Player player, Room room, Tools tool){
        return crime.getRoom().equals(room ) && crime.getTool().equals(tool) && impostor.getImposterPlayer().equals(player);
    }

    public Impostor getImpostor() {
        return impostor;
    }

    public Crime getCrime() {
        return crime;
    }

    private User user;
    private Impostor impostor;
    private Crime crime;
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Tools> tools = new ArrayList<>();
    private ArrayList<Room> rooms = new ArrayList<>();
}

 /*   public void selectPlayer(String playerName){
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getPlayerName().equals(playerName)){
                player.setUsertoPlayer(user);
                System.out.printf("user %s has chose player %s.\n", user.getUserName(), player.getPlayerName());

            }
        }
    }*/