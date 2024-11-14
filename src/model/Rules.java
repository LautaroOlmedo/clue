package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Rules {
    public User createUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        user = new User(scanner.nextLine());
        return user;
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
  //ToDo: createPlayers debe guardar los players en el arrayList o solo debe crearlos y otro método debe guardarlos, como llamar a ese método desde createPlayers?

  /*  public void savePlayers(ArrayList<Player> players)  {

    }*/
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
            Room securityRoom = new Room("SECURITY ROOM", 1);
            Room comonRoom = new Room("SECURITY ROOM", 2);
            Room laboratory = new Room("SECURITY ROOM", 3);
            Room kitchen = new Room("SECURITY ROOM", 6);
            Room office = new Room("SECURITY ROOM", 5);
            Room library = new Room("SECURITY ROOM", 1);
            rooms.add(securityRoom);
            rooms.add(comonRoom);
            rooms.add(laboratory);
            rooms.add(kitchen);
            rooms.add(office);
            rooms.add(library);
        } catch (Exception e) {
            System.out.println("Failed to create rooms or load images: " + e.getMessage());
            e.printStackTrace();
        }
        return rooms;
    }

    public Impostor generateImpostor(){
        Player selectedPlayer = getRandomPlayer();
        imposter = new Impostor(selectedPlayer);
        return imposter;
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(3) + 1; // Genera un número entre 0 y 2, luego suma 1 para obtener entre 1 y 3
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
        crime = new Crime(imposter, this.getRandomTool(), this.getRandomRoom());
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

    public boolean verifyAccusation(Player player, Room room, Tools tool){
        return crime.getRoom().equals(room ) && crime.getTool().equals(tool) && imposter.getImposterPlayer().equals(player);
    }

    private User user;
    private Impostor imposter;
    private Crime crime;
    private final ArrayList<Player> players = new ArrayList<>();
    private final ArrayList<Tools> tools = new ArrayList<>();
    private final ArrayList<Room> rooms = new ArrayList<>();
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