package controller;

import model.*;
import view.GameFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Controller implements ActionListener {
    public Controller(Rules rules, GameFrame gameFrame){
        this.rules = rules;
        this.gameFrame = gameFrame;
        // ----- INITIAL PANEL -----
        this.gameFrame.getInitialPanel().getStartButton().addActionListener(this);
        this.gameFrame.getInitialPanel().getExitButton().addActionListener(this);

        // ----- BOARD PANEL -----
        this.gameFrame.getBoardPanel().getKitchenButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getBallRoomButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getLoungeRoomButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getHallRoomButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getStudyRoomButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getDiningRoomButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getBillardRoomButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getLibraryRoomButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getBallRoomButtom().addActionListener(this);
        this.gameFrame.getBoardPanel().getConservatoryButton().addActionListener(this);
        this.gameFrame.getBoardPanel().getLoungeRoomButtom().addActionListener(this);


        // ----- SIDE PANEL -----
        this.gameFrame.getSidePanel().getCluesButton().addActionListener(this);
        this.gameFrame.getSidePanel().getInvestigateButton().addActionListener(this);
        this.gameFrame.getSidePanel().getAccusePlayerButton().addActionListener(this);
        this.gameFrame.getSidePanel().getGoBackButton().addActionListener(this);
        this.gameFrame.getSidePanel().getNextPageButton().addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(this.gameFrame.getInitialPanel().getStartButton())){
            this.gameFrame.switchToBoard();
            try {
                this.rules.startGame();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource().equals(this.gameFrame.getInitialPanel().getExitButton())){
            System.exit(0);
        }

       this.gameFrame.getSidePanel().getInvestigateButton().setEnabled(false);
        if (this.rules.getCluePage() >= 2) {
            this.gameFrame.getSidePanel().getNextPageButton().setEnabled(false);
        }

        if(e.getSource().equals(this.gameFrame.getSidePanel().getCluesButton())){ // VER PISTAS
            this.gameFrame.getSidePanel().getGoBackButton().setEnabled(true);
            if (this.rules.getCluePage() < 4) {
                this.gameFrame.getSidePanel().getNextPageButton().setEnabled(true);
            }
            this.gameFrame.switchToCluesPanel(this.rules.getCluePage());
        }
        if(e.getSource().equals(this.gameFrame.getSidePanel().getGoBackButton())){ // VOLVER AL PANEL
            this.gameFrame.getSidePanel().getNextPageButton().setEnabled(false);
            this.rules.resetCluePage();
            this.gameFrame.switchToBoardPanel();
        }
        if (e.getSource().equals(this.gameFrame.getSidePanel().getNextPageButton())) { // VER SIGUIENTE PAGINA DE PISTAS
            this.rules.sumCluePage();
            this.gameFrame.switchToCluesPanel(this.rules.getCluePage());
        }
        if (e.getSource().equals(this.gameFrame.getSidePanel().getInvestigateButton())) {
            boolean addedClue = false;

            do {
                int randomNumber = this.rules.getRandomNumberBetBetweenOneAndFour();
                //System.out.println("randomNumber: " + randomNumber);

                switch (randomNumber) {
                    case 1: // Agregar pista de jugador
                        if (this.rules.getPlayersAllowed() > 1) {
                            Player player = this.rules.getInocentPlayer();
                            if (player == null){
                                break;
                            }
                            System.out.println("deberia agregar a un player: " + player.getPlayerName());
                            this.rules.addPlayerClue(player);
                            this.gameFrame.getPlayersCluesPanel().addPlayerClue(player.getPlayerImage());
                            addedClue = true;
                        }
                        break;
                    case 2: // Agregar pista de arma
                        if (this.rules.getWeaponsAllowed() > 1) {
                            Weapon weapon = this.rules.getInocentWeapon();
                            if (weapon == null){
                                break;
                            }
                            System.out.println("deberia agregar a un arma: " + weapon.getWeaponName() + weapon.getWeaponImage());
                            this.rules.addWeaponClue(weapon);
                            this.gameFrame.getWeaponsCluesPanel().addWeaponClue(weapon.getWeaponImage());
                            addedClue = true;
                        }
                        break;
                    case 3, 4:
                        if (this.rules.getRoomsAllowed() > 1) {
                            Room room = this.rules.getInocentRoom();
                            if (room == null){
                                break;
                            }
                            System.out.println("deberia agregar a una habitacion: " + room.getRoomName());
                            this.rules.addRoomClue(room);
                            this.gameFrame.getRoomsCluePanel().addRoomClue(room.getRoomImage());
                            addedClue = true;
                        }
                        break;
                    default:
                        break;
                }
            } while (!addedClue);
        }

        if(e.getSource().equals(this.gameFrame.getBoardPanel().getKitchenButton())){
            if(this.rules.validateAllowedClues()){
                this.gameFrame.getSidePanel().getInvestigateButton().setEnabled(true);
            }
            this.gameFrame.getSidePanel().getFirstTextArea().setText("");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Investigando la cocina...");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Verificando utencilios de cocina...");

        }else if(e.getSource().equals(this.gameFrame.getBoardPanel().getDiningRoomButton())){
            this.gameFrame.getSidePanel().getInvestigateButton().setEnabled(true);

        }
    }



    private int getRandomNumberBetBetweenOneAndFour() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }


    private Rules rules;
    private GameFrame gameFrame;

}
