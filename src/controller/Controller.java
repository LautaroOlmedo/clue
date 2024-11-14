package controller;

import model.*;
import view.GameFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller implements ActionListener {
    public Controller(Rules rules, GameFrame gameFrame){
        this.rules = rules;
        this.gameFrame = gameFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.gameFrame.getInitialPanel().getStartButton())){
            this.gameFrame.switchToBoard();
        }else if(e.getSource().equals(this.gameFrame.getInitialPanel().getExitButton())){
            System.exit(0);
        }
    }

   public void StartGame() throws Exception {
        User user = this.rules.createUser();
       ArrayList<Player> players = this.rules.createPlayers();
       ArrayList<Tools> tools = this.rules.createTools();
       ArrayList<Room> rooms = this.rules.createRooms();
       Impostor impostor = this.rules.generateImpostor();
       //this.rules.selectPlayer("junior");
       Crime crime = this.rules.generateCrime();
   }

    private Rules rules;
    private GameFrame gameFrame;


}
