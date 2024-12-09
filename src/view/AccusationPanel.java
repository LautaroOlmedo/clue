package view;

import javax.swing.*;
import java.awt.*;

public class AccusationPanel extends JPanel {
    public AccusationPanel() {
        this.setLayout(null);
        this.cluesBackground = new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/clues-background.jpg").getImage();
        this.setAccusePanel();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(cluesBackground, 0, 0, getWidth(), getHeight(), this);
    }

    public void setAccusePanel() {

        accuseButton = new JButton("Acusar");
        //accusedPlayerButton.setOpaque(false);
        //accusedPlayerButton.setContentAreaFilled(false);
        //accusedPlayerButton.setBorderPainted(false);
        accuseButton.setBounds(340, 620, 200, 50);
        this.add(accuseButton);

        accusedPlayerButton = new JButton();
        accusedPlayerButton.setOpaque(false);
        accusedPlayerButton.setContentAreaFilled(false);
        accusedPlayerButton.setBorderPainted(false);
        accusedPlayerButton.setBounds(10, 230, 260, 350);
        this.add(accusedPlayerButton);

        accusedWeaponButton = new JButton();
        accusedWeaponButton.setOpaque(false);
        accusedWeaponButton.setContentAreaFilled(false);
        accusedWeaponButton.setBorderPainted(false);
        accusedWeaponButton.setBounds(310, 230, 260, 350); // Segundo botón
        this.add(accusedWeaponButton);


        accusedRoomButton = new JButton();
        accusedRoomButton.setOpaque(false);
        accusedRoomButton.setContentAreaFilled(false);
        accusedRoomButton.setBorderPainted(false);
        accusedRoomButton.setBounds(610, 230, 260, 350); // Tercer botón
        this.add(accusedRoomButton);


        bar = new JMenuBar();

        // Crear menús
        playersList = new JMenu("Jugadores");
        weaponsList = new JMenu("Armas");
        roomsList = new JMenu("Habitaciones");

        // Crear ítems dentro del menú de jugadores
        firstPlayer = new JRadioButtonMenuItem("Mrs Peacock");
        secondPlayer = new JRadioButtonMenuItem("Miss Scarlet");
        thirdPlayer = new JRadioButtonMenuItem("Mr Green");
        fourthPlayer = new JRadioButtonMenuItem("Prof Plum");

        firstWeapon = new JRadioButtonMenuItem("Candelabro");
        secondWeapon  = new JRadioButtonMenuItem("Cuchillo");
        thirdWeapon  = new JRadioButtonMenuItem("Revolver");
        fourthWeapon  = new JRadioButtonMenuItem("Tubería");

        firstRoom = new JRadioButtonMenuItem("Kitchen");
        secondRoom = new JRadioButtonMenuItem("Dining Room");
        thirdRoom = new JRadioButtonMenuItem("Ball Room");
        fourthRoom = new JRadioButtonMenuItem("Billiard Room");
        fivethRoom = new JRadioButtonMenuItem("Hall");
        sixthRoom = new JRadioButtonMenuItem("Library");
        seventhRoom = new JRadioButtonMenuItem("Lounge");
        eighthRoom = new JRadioButtonMenuItem("Study");
        ninthRoom = new JRadioButtonMenuItem("Conservatory");


        ButtonGroup playerGroup = new ButtonGroup();
        playerGroup.add(firstPlayer);
        playerGroup.add(secondPlayer);
        playerGroup.add(thirdPlayer);
        playerGroup.add(fourthPlayer);

        playersList.add(firstPlayer);
        playersList.add(secondPlayer);
        playersList.add(thirdPlayer);
        playersList.add(fourthPlayer);

        ButtonGroup weaponGroup = new ButtonGroup();
        weaponGroup.add(firstWeapon);
        weaponGroup.add(secondWeapon);
        weaponGroup.add(thirdWeapon);
        weaponGroup.add(fourthWeapon);

        weaponsList.add(firstWeapon);
        weaponsList.add(secondWeapon);
        weaponsList.add(thirdWeapon);
        weaponsList.add(fourthWeapon);

        ButtonGroup roomGroup = new ButtonGroup();
        weaponGroup.add(firstRoom);
        weaponGroup.add(secondRoom);
        weaponGroup.add(thirdRoom);
        weaponGroup.add(fourthRoom);
        weaponGroup.add(fivethRoom);
        weaponGroup.add(sixthRoom);
        weaponGroup.add(seventhRoom);
        weaponGroup.add(eighthRoom);
        weaponGroup.add(ninthRoom);

        roomsList.add(firstRoom);
        roomsList.add(secondRoom);
        roomsList.add(thirdRoom);
        roomsList.add(fourthRoom);
        roomsList.add(fivethRoom);
        roomsList.add(sixthRoom);
        roomsList.add(seventhRoom);
        roomsList.add(eighthRoom);
        roomsList.add(ninthRoom);



        bar.add(playersList);
        bar.add(Box.createHorizontalStrut(150)); // Espacio fijo de 60 píxeles
        bar.add(weaponsList);
        bar.add(Box.createHorizontalStrut(150)); // Otro espacio fijo
        bar.add(roomsList);

        bar.setBounds(190, 10, 546, 40);
        this.add(bar);
    }

    public JButton getAccuseButton() {
        return accuseButton;
    }

    public JButton getAccusedPlayerButton() {
        return accusedPlayerButton;
    }
    public JRadioButtonMenuItem getFirstPlayer() {
        return firstPlayer;
    }
    public JRadioButtonMenuItem getSecondPlayer() {
        return secondPlayer;
    }
    public JRadioButtonMenuItem getThirdPlayer() {
        return thirdPlayer;
    }
    public JRadioButtonMenuItem getFourthPlayer() {
        return fourthPlayer;
    }

    public JButton getAccusedWeaponButton() {
        return accusedWeaponButton;
    }

    public JRadioButtonMenuItem getFirstWeapon() {
        return firstWeapon;
    }

    public JRadioButtonMenuItem getSecondWeapon() {
        return secondWeapon;
    }

    public JRadioButtonMenuItem getThirdWeapon() {
        return thirdWeapon;
    }

    public JRadioButtonMenuItem getFourthWeapon() {
        return fourthWeapon;
    }

    public JButton getAccusedRoomButton() {
        return accusedRoomButton;
    }

    public JRadioButtonMenuItem getFirstRoom() {
        return firstRoom;
    }

    public JRadioButtonMenuItem getSecondRoom() {
        return secondRoom;
    }

    public JRadioButtonMenuItem getThirdRoom() {
        return thirdRoom;
    }

    public JRadioButtonMenuItem getFourthRoom() {
        return fourthRoom;
    }

    public JRadioButtonMenuItem getFivethRoom() {
        return fivethRoom;
    }

    public JRadioButtonMenuItem getSixthRoom() {
        return sixthRoom;
    }

    public JRadioButtonMenuItem getSeventhRoom() {
        return seventhRoom;
    }

    public JRadioButtonMenuItem getEighthRoom() {
        return eighthRoom;
    }

    public JRadioButtonMenuItem getNinthRoom() {
        return ninthRoom;
    }

    public void setPLayerAccused() {
        if (firstPlayer.isSelected()) {
            this.accusedPlayerButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/players/miss-blue.jpeg"));
        }else if (secondPlayer.isSelected()) {
            this.accusedPlayerButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/players/miss-red.jpeg"));
        }else if (thirdPlayer.isSelected()) {
            this.accusedPlayerButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/players/mr-green.jpeg"));
        }else if (fourthPlayer.isSelected()) {
            this.accusedPlayerButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/players/violet.jpeg"));
        }
    }

    public void setWeaponAccused(){
        if (firstWeapon.isSelected()){
            this.accusedWeaponButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/weapons/vela.jpeg"));
        } else if (secondWeapon.isSelected()) {
            this.accusedWeaponButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/weapons/knife.jpeg"));
        }else if (thirdWeapon.isSelected()) {
            this.accusedWeaponButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/weapons/gun.jpeg"));
        }else if (fourthWeapon.isSelected()) {
            this.accusedWeaponButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/weapons/pipe.jpeg"));
        }
    }

    public void setRoomAccused(){
        if (firstRoom.isSelected()){
            this.accusedRoomButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/kitchen.png"));
        } else if (secondRoom.isSelected()) {
            this.accusedRoomButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/dining-room.jpeg"));
        }else if (thirdRoom.isSelected()) {
            this.accusedRoomButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/ball-room.jpeg"));
        }else if (fourthRoom.isSelected()) {
            this.accusedRoomButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/billiard-room.jpeg"));
        }else if (fivethRoom.isSelected()) {
            this.accusedRoomButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/hall.jpeg"));
        } else if (sixthRoom.isSelected()) {
            this.accusedRoomButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/library.jpeg"));
        } else if (seventhRoom.isSelected()) {
            this.accusedRoomButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/lounge.jpeg"));
        }else if (eighthRoom.isSelected()) {
            this.accusedRoomButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/study.jpeg"));
        }else if (ninthRoom.isSelected()) {
            this.accusedRoomButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/conservatory.jpeg"));
        }
    }

    public boolean validatePlayersIconButtons(){
        return firstPlayer.getIcon() != null || secondPlayer.getIcon() != null || thirdPlayer.getIcon() != null || fourthPlayer.getIcon() != null;
    }
    public boolean validateWeaponsIconButtons() {
        return firstWeapon.getIcon() != null || secondWeapon.getIcon() != null ||
                thirdWeapon.getIcon() != null || fourthWeapon.getIcon() != null;
    }
    public boolean validateRoomsIconButtons() {
        return firstRoom.getIcon() != null || secondRoom.getIcon() != null ||
                thirdRoom.getIcon() != null || fourthRoom.getIcon() != null ||
                fivethRoom.getIcon() != null || sixthRoom.getIcon() != null ||
                seventhRoom.getIcon() != null || eighthRoom.getIcon() != null ||
                ninthRoom.getIcon() != null;
    }


    JMenuBar bar;

    private JButton accuseButton;
    private JButton accusedPlayerButton;
    private JButton accusedWeaponButton;
    private JButton accusedRoomButton;


    private JMenu playersList;
    private JMenu weaponsList;
    private JMenu roomsList;

    private JRadioButtonMenuItem firstPlayer;
    private JRadioButtonMenuItem secondPlayer;
    private JRadioButtonMenuItem thirdPlayer;
    private JRadioButtonMenuItem fourthPlayer;

    private JRadioButtonMenuItem firstWeapon;
    private JRadioButtonMenuItem secondWeapon;
    private JRadioButtonMenuItem thirdWeapon;
    private JRadioButtonMenuItem fourthWeapon;

    private JRadioButtonMenuItem firstRoom;
    private JRadioButtonMenuItem secondRoom;
    private JRadioButtonMenuItem thirdRoom;
    private JRadioButtonMenuItem fourthRoom;
    private JRadioButtonMenuItem fivethRoom;
    private JRadioButtonMenuItem sixthRoom;
    private JRadioButtonMenuItem seventhRoom;
    private JRadioButtonMenuItem eighthRoom;
    private JRadioButtonMenuItem ninthRoom;


    private Image cluesBackground;

}
