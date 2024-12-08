package view;

import javax.swing.*;

public class RoomsCluePanel extends JPanel {
    public RoomsCluePanel() {
        this.setLayout(null);
        this.setRoomsClues();
    }

    public void setRoomsClues(){
        // Botón principal "Habitaciones"
        roomsButton = new JButton("Habitaciones");
        roomsButton.setBounds(350, 6, 200, 50); // Debajo del botón "Armas"
        this.add(roomsButton);

        // Botones de habitaciones (6 botones en una fila)
        roomOneButton = new JButton();
        roomOneButton = new JButton();
        roomOneButton.setOpaque(false);
        roomOneButton.setContentAreaFilled(false);
        roomOneButton.setBorderPainted(false);
        //roomOneButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/library.jpeg"));
        roomOneButton.setBounds(-10, 60, 230, 350); // Primer botón
        this.add(roomOneButton);

        roomTwoButton = new JButton();
        roomTwoButton = new JButton();
        roomTwoButton.setOpaque(false);
        roomTwoButton.setContentAreaFilled(false);
        roomTwoButton.setBorderPainted(false);
        //roomTwoButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/library.jpeg"));
        roomTwoButton.setBounds(220, 60, 230, 350);
        this.add(roomTwoButton);

        roomThreeButton = new JButton();
        roomThreeButton.setOpaque(false);
        roomThreeButton.setContentAreaFilled(false);
        roomThreeButton.setBorderPainted(false);
        //roomThreeButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/library.jpeg"));
        roomThreeButton.setBounds(450, 60, 230, 350); // Tercer botón
        this.add(roomThreeButton);

        roomFourButton = new JButton();
        roomFourButton = new JButton();
        roomFourButton.setOpaque(false);
        roomFourButton.setContentAreaFilled(false);
        roomFourButton.setBorderPainted(false);
        //roomFourButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/library.jpeg"));
        roomFourButton.setBounds(680, 60, 230, 350); // Cuarto botón
        this.add(roomFourButton);

        roomFiveButton = new JButton();
        roomFiveButton = new JButton();
        roomFiveButton.setOpaque(false);
        roomFiveButton.setContentAreaFilled(false);
        roomFiveButton.setBorderPainted(false);
        //roomFiveButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/library.jpeg"));
        roomFiveButton.setBounds(-10, 410, 230, 350); // Quinto botón
        this.add(roomFiveButton);

        roomSixButton = new JButton();
        roomSixButton = new JButton();
        roomSixButton.setOpaque(false);
        roomSixButton.setContentAreaFilled(false);
        roomSixButton.setBorderPainted(false);
        //roomSixButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/library.jpeg"));
        roomSixButton.setBounds(220, 410, 230, 350); // Sexto botón
        this.add(roomSixButton);

        roomSevenButton = new JButton();
        roomSevenButton = new JButton();
        roomSevenButton.setOpaque(false);
        roomSevenButton.setContentAreaFilled(false);
        roomSevenButton.setBorderPainted(false);
        //roomSevenButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/library.jpeg"));
        roomSevenButton.setBounds(450, 410, 230, 350); // Sexto botón
        this.add(roomSevenButton);

        roomEightButton = new JButton();
        roomEightButton = new JButton();
        roomEightButton.setOpaque(false);
        roomEightButton.setContentAreaFilled(false);
        roomEightButton.setBorderPainted(false);
        //roomEightButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/rooms/library.jpeg"));
        roomEightButton.setBounds(680, 410, 230, 350); // Sexto botón
        this.add(roomEightButton);
    }

    public void addRoomClue(ImageIcon roomImage) {
        if(roomOneButton.getIcon() == null) {
            roomOneButton.setIcon(roomImage);
        }else if(roomTwoButton.getIcon() == null) {
            roomTwoButton.setIcon(roomImage);
        }else if(roomThreeButton.getIcon() == null) {
            roomThreeButton.setIcon(roomImage);
        }else if(roomFourButton.getIcon() == null) {
            roomFourButton.setIcon(roomImage);
        }else if(roomFiveButton.getIcon() == null) {
            roomFiveButton.setIcon(roomImage);
        }else if(roomSixButton.getIcon() == null) {
            roomSixButton.setIcon(roomImage);
        }else if(roomSevenButton.getIcon() == null) {
            roomSevenButton.setIcon(roomImage);
        }else{
            roomEightButton.setIcon(roomImage);
        }
    }

    private JButton roomsButton;
    private JButton roomOneButton;
    private JButton roomTwoButton;
    private JButton roomThreeButton;
    private JButton roomFourButton;
    private JButton roomFiveButton;
    private JButton roomSixButton;
    private JButton roomSevenButton;
    private JButton roomEightButton;
    private JButton roomNineButton;
}
