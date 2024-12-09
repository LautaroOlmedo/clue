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

        // ----- ACCUSATION PANEL -----
        this.gameFrame.getAccusationPanel().getAccuseButton().addActionListener(this);
        this.gameFrame.getAccusationPanel().getAccusedPlayerButton().addActionListener(this);
        this.gameFrame.getAccusationPanel().getFirstPlayer().addActionListener(e -> this.gameFrame.getAccusationPanel().setPLayerAccused());
        this.gameFrame.getAccusationPanel().getSecondPlayer().addActionListener(e -> this.gameFrame.getAccusationPanel().setPLayerAccused());
        this.gameFrame.getAccusationPanel().getThirdPlayer().addActionListener(e -> this.gameFrame.getAccusationPanel().setPLayerAccused());
        this.gameFrame.getAccusationPanel().getFourthPlayer().addActionListener(e -> this.gameFrame.getAccusationPanel().setPLayerAccused());

        this.gameFrame.getAccusationPanel().getAccusedWeaponButton().addActionListener(this);
        this.gameFrame.getAccusationPanel().getFirstWeapon().addActionListener(e -> this.gameFrame.getAccusationPanel().setWeaponAccused());
        this.gameFrame.getAccusationPanel().getSecondWeapon().addActionListener(e -> this.gameFrame.getAccusationPanel().setWeaponAccused());
        this.gameFrame.getAccusationPanel().getThirdWeapon().addActionListener(e -> this.gameFrame.getAccusationPanel().setWeaponAccused());
        this.gameFrame.getAccusationPanel().getFourthWeapon().addActionListener(e -> this.gameFrame.getAccusationPanel().setWeaponAccused());

        this.gameFrame.getAccusationPanel().getAccusedRoomButton().addActionListener(this);
        this.gameFrame.getAccusationPanel().getFirstRoom().addActionListener(e -> this.gameFrame.getAccusationPanel().setRoomAccused());
        this.gameFrame.getAccusationPanel().getSecondRoom().addActionListener(e -> this.gameFrame.getAccusationPanel().setRoomAccused());
        this.gameFrame.getAccusationPanel().getThirdRoom().addActionListener(e -> this.gameFrame.getAccusationPanel().setRoomAccused());
        this.gameFrame.getAccusationPanel().getFourthRoom().addActionListener(e -> this.gameFrame.getAccusationPanel().setRoomAccused());
        this.gameFrame.getAccusationPanel().getFivethRoom().addActionListener(e -> this.gameFrame.getAccusationPanel().setRoomAccused());
        this.gameFrame.getAccusationPanel().getSixthRoom().addActionListener(e -> this.gameFrame.getAccusationPanel().setRoomAccused());
        this.gameFrame.getAccusationPanel().getSeventhRoom().addActionListener(e -> this.gameFrame.getAccusationPanel().setRoomAccused());
        this.gameFrame.getAccusationPanel().getEighthRoom().addActionListener(e -> this.gameFrame.getAccusationPanel().setRoomAccused());
        this.gameFrame.getAccusationPanel().getNinthRoom().addActionListener(e -> this.gameFrame.getAccusationPanel().setRoomAccused());

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

        this.gameFrame.getAccusationPanel().getAccuseButton().setEnabled(false);
       this.gameFrame.getSidePanel().getInvestigateButton().setEnabled(false);
        if (this.rules.getCluePage() >= 2) { // IMPIDE CONTINUAR CON EL PAGINADO
            this.gameFrame.getSidePanel().getNextPageButton().setEnabled(false);
        }

        if(e.getSource().equals(this.gameFrame.getSidePanel().getCluesButton())){ // VER PANEL PISTAS
            this.gameFrame.getSidePanel().getGoBackButton().setEnabled(true);
            if (this.rules.getCluePage() < 4) {
                this.gameFrame.getSidePanel().getNextPageButton().setEnabled(true);
            }
            this.gameFrame.switchToCluesPanel(this.rules.getCluePage());
        }
        if (e.getSource().equals(this.gameFrame.getSidePanel().getAccusePlayerButton())) { // VER PANEL ACUSAR
            this.gameFrame.getSidePanel().getGoBackButton().setEnabled(true);
            this.rules.resetCluePage();
            if(this.gameFrame.getAccusationPanel().validatePlayersIconButtons() && this.gameFrame.getAccusationPanel().validateWeaponsIconButtons() && this.gameFrame.getAccusationPanel().validateRoomsIconButtons()){
                this.gameFrame.getAccusationPanel().getAccuseButton().setEnabled(true);
            }
            this.gameFrame.switchToAccusationPanel();

        }
    /*    if (e.getSource().equals(this.gameFrame.getAccusationPanel().getAccuseButton())) { // ACUSAR

        }*/
        if(e.getSource().equals(this.gameFrame.getSidePanel().getGoBackButton())){ // VOLVER AL PANEL PRINCIPAL
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
                switch (randomNumber) {
                    case 1:
                        if (this.rules.getPlayersAllowed() > 1) {
                            Player player = this.rules.getInocentPlayer();
                            if (player == null){
                                break;
                            }
                            this.gameFrame.getPlayersCluesPanel().addPlayerClue(player.getPlayerImage());
                            addedClue = true;
                        }
                        break;
                    case 2:
                        if (this.rules.getWeaponsAllowed() > 1) {
                            Weapon weapon = this.rules.getInocentWeapon();
                            if (weapon == null){
                                break;
                            }
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

            if(!this.gameFrame.getSidePanel().getInvestigateButton().isEnabled()){
                this.gameFrame.getSidePanel().getFirstTextArea().setText("");
                this.gameFrame.getSidePanel().appendTextToFirstArea("Ya investigaste dos veces la cocina. Busca pistas en otras salas.");
            }
            if(this.rules.areThereCluesLeftToAdd()){
                if (this.rules.validateVisitRoom(1)){

                    this.gameFrame.getSidePanel().getInvestigateButton().setEnabled(true);
                    this.rules.investigateRoom(1);
                    this.gameFrame.getSidePanel().appendTextToFirstArea("Encontraste una pista...");
                }
            }

            this.gameFrame.getSidePanel().getFirstTextArea().setText("");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Investigando la cocina...");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Verificando utencilios de cocina...");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Buscando pistas..");

        }else if(e.getSource().equals(this.gameFrame.getBoardPanel().getDiningRoomButton())){

            if(this.rules.areThereCluesLeftToAdd()){
                if (this.rules.validateVisitRoom(2)){
                    this.gameFrame.getSidePanel().getInvestigateButton().setEnabled(true);
                    this.rules.investigateRoom(2);
                    //this.gameFrame.getSidePanel().appendTextToFirstArea("Encontraste una pista...");
                }
            }

            this.gameFrame.getSidePanel().getFirstTextArea().setText("");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Investigando el comedor...");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Chequeando debajo de la mesa...");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Buscando pistas..");

        }else if(e.getSource().equals(this.gameFrame.getBoardPanel().getBallRoomButtom())){
            if(this.rules.areThereCluesLeftToAdd()){
                if (this.rules.validateVisitRoom(3)){
                    this.gameFrame.getSidePanel().getInvestigateButton().setEnabled(true);
                    this.rules.investigateRoom(3);
                    //this.gameFrame.getSidePanel().appendTextToFirstArea("Encontraste una pista...");
                }
            }

            this.gameFrame.getSidePanel().getFirstTextArea().setText("");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Investigando el la sala...");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Chequeando piano...");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Buscando pistas..");
        }
    }
    private Rules rules;
    private GameFrame gameFrame;
}
