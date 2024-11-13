package controller;

import model.Rules;
import model.User;
import view.GameFrame;
import model.Player;

import java.util.ArrayList;

public class Controller {

    public Controller(Rules rules, GameFrame gameFrame) {
        this.rules = rules;
        this.gameFrame = gameFrame;
    }

   public void StartGame() throws Exception {
        User user = this.rules.createUser();
       ArrayList<Player> players = this.rules.createPlayers();
       this.rules.selectPlayer("junior");
       // Tools tools = createTools();
       // Impostor imposter = this.rules.createImpostor();
   }

    private Rules rules;
    private GameFrame gameFrame;
}
