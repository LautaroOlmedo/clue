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

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.gameFrame.getSidePanel().getInvestigateButton().setEnabled(false);
        if(e.getSource().equals(this.gameFrame.getInitialPanel().getStartButton())){
            this.gameFrame.switchToBoard();
            try {
                this.rules.startGame();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }if(e.getSource().equals(this.gameFrame.getInitialPanel().getExitButton())){
            System.exit(0);
        }if(e.getSource().equals(this.gameFrame.getSidePanel().getCluesButton())){
            this.gameFrame.getSidePanel().getGoBackButton().setEnabled(true);
            this.gameFrame.switchToCluesPanel();
        }if(e.getSource().equals(this.gameFrame.getSidePanel().getGoBackButton())){
            this.gameFrame.switchToBoardPanel();
        } if(e.getSource().equals(this.gameFrame.getSidePanel().getInvestigateButton())){
            switch (this.getRandomNumberBetBetweenOneAndTwo()){
                case 1:
                    Player player = this.rules.getInocentPlayer();
                    this.rules.addPlayerClue(player);
                    this.gameFrame.getCluesPanel().addPlayerClue(player.getID());
                    break;
                case 2:
                   Room room = this.rules.getInocentRoom();
                    this.rules.addRoomClue(room);
                    this.gameFrame.getCluesPanel().addRoomClue(room.getID());
            }
        }

        if(e.getSource().equals(this.gameFrame.getBoardPanel().getKitchenButton())){
            this.gameFrame.getSidePanel().getInvestigateButton().setEnabled(true);

            this.gameFrame.getSidePanel().getFirstTextArea().setText("");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Investigando la cocina...");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Verificando utencilios de cocina...");
            if(this.rules.getCrime().getRoom().equals(this.rules.getRoomByName("kitchen"))){
                this.gameFrame.getSidePanel().getFirstTextArea().setText("Extrano..");
                this.gameFrame.getSidePanel().getFirstTextArea().setText("La noche anterior se cocino para mas de una persona. No es que el duque cenaba en soledad?...");
                this.gameFrame.getSidePanel().getFirstTextArea().setText("Mmhhh..");
            }else{
                this.gameFrame.getSidePanel().appendTextToFirstArea("No se encontraron anomalias..");
                this.gameFrame.getSidePanel().appendTextToFirstArea("Sala descartada...");
            }
        } else if(e.getSource().equals(this.gameFrame.getBoardPanel().getBallRoomButton())){
            this.gameFrame.getSidePanel().getFirstTextArea().setText("");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Investigando el comedor...");
            if(this.rules.getCrime().getRoom().equals(this.rules.getRoomByName("diningRoom"))){
                this.gameFrame.getSidePanel().getFirstTextArea().setText("Algo no va bien..");
                this.gameFrame.getSidePanel().getFirstTextArea().setText("Se utilizo mas de una silla durante la cena..");
                this.gameFrame.getSidePanel().getFirstTextArea().setText("La ventana esta abierta. Habran escapado por ahi?..");
            }else{
                this.gameFrame.getSidePanel().appendTextToFirstArea("No se encontraron anomalias..");
                this.gameFrame.getSidePanel().appendTextToFirstArea("Sala descartada...");
            }
        }else if(e.getSource().equals(this.gameFrame.getBoardPanel().getLoungeRoomButton())){
            this.gameFrame.getSidePanel().getFirstTextArea().setText("");
            this.gameFrame.getSidePanel().appendTextToFirstArea("Investigando la terraza...");

            if(this.rules.getCrime().getRoom().equals(this.rules.getRoomByName("balcony"))){
                this.gameFrame.getSidePanel().getFirstTextArea().setText("Algo no va bien..");
                this.gameFrame.getSidePanel().appendTextToFirstArea("Hay huellas de mas de una persona..");
                this.gameFrame.getSidePanel().appendTextToFirstArea("LA CORTINA TIENE SANGRE..");

            }else{
                this.gameFrame.getSidePanel().appendTextToFirstArea("No se encontraron anomalias..");
                this.gameFrame.getSidePanel().appendTextToFirstArea("Sala descartada...");
            }
        }
    }

    private int getRandomNumberBetBetweenOneAndTwo() {
        Random random = new Random();
        return random.nextInt(2) + 1;
    }

    private Rules rules;
    private GameFrame gameFrame;

}
