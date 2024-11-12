package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
            Player junior = new Player("Junior", "/Users/lautaroolmedo/IdeaProjects/clue-videogame/src/model/images/perfilCuco.jpeg");
            Player semiSr = new Player("SemiSr", "/Users/lautaroolmedo/IdeaProjects/clue-videogame/src/model/images/perfilCuco.jpeg");
            Player senior = new Player("Senior", "/Users/lautaroolmedo/IdeaProjects/clue-videogame/src/model/images/perfilCuco.jpeg");
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

    public void selectPlayer(String playerName){
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getPlayerName().equals(playerName)){
                player.setUsertoPlayer(user);
                System.out.printf("user %s has chose player %s.\n", user.getUserName(), player.getPlayerName());

            }
        }
    }

    public ArrayList<Room> createRooms(){
        return rooms;
    }



    public ArrayList<Tools> createTools(){
        return tools;
    }

      /* public Impostor createImpostor(){

    }*/

    public void investigateRoom(){

    }

    public void accusePlayer(Player player){}

    private User user;
    private final ArrayList<Player> players = new ArrayList<>();
    private final ArrayList<Tools> tools = new ArrayList<>();
    private final ArrayList<Room> rooms = new ArrayList<>();
}
