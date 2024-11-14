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
        // ----- INITIAL PANEL -----
        this.gameFrame.getInitialPanel().getStartButton().addActionListener(this);
        this.gameFrame.getInitialPanel().getExitButton().addActionListener(this);
        // ----- BOARD PANEL -----
        this.gameFrame.getBoardPanel().getComonRoomButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getKitchenButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getLibraryButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getLaboratoryButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getSecurityRoomButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getOfficeButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getTerraceButton().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.gameFrame.getInitialPanel().getStartButton())){
            System.out.println("in controller");
            this.gameFrame.switchToBoard();
            try {
                this.rules.startGame();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }else if(e.getSource().equals(this.gameFrame.getInitialPanel().getExitButton())){
            System.exit(0);
        }
    }


    private Rules rules;
    private GameFrame gameFrame;
}
