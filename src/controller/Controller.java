package controller;

import model.Rules;
import model.User;
import view.View;
import model.Player;

import java.util.ArrayList;

public class Controller {

    public Controller(Rules rules, View view) {
        this.rules = rules;
        this.view = view;
    }

   public void StartGame() throws Exception {
        User user = this.rules.createUser();
       ArrayList<Player> players = this.rules.createPlayers();
       this.rules.selectPlayer("junior");
       // Tools tools = createTools();
       // Impostor imposter = this.rules.createImpostor();
   }

    private Rules rules;
    private View view;
}
