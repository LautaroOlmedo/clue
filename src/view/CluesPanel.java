package view;
import javax.swing.*;



import javax.swing.*;

public class CluesPanel extends JPanel {
    public CluesPanel() {
        this.setLayout(null);
        this.setClues();
    }

    private void setClues() {
        // Botón principal "Jugadores"
        playersButton = new JButton("Jugadores");
        playersButton.setBounds(400, 20, 150, 50); // Posición inicial
        this.add(playersButton);

        // Botones de jugadores (con tamaño aumentado para imágenes)
        playerOneButton = new JButton("Jugador 1");
        playerOneButton.setBounds(240, 80, 150, 120); // Primer botón
        this.add(playerOneButton);

        playerTwoButton = new JButton("Jugador 2");
        playerTwoButton.setBounds(400, 80, 150, 120); // Segundo botón
        this.add(playerTwoButton);

        playerThreeButton = new JButton("Jugador 3");
        playerThreeButton.setBounds(560, 80, 150, 120); // Tercer botón
        this.add(playerThreeButton);

        // Botón principal "Armas"
        weaponsButton = new JButton("Armas");
        weaponsButton.setBounds(400, 230, 150, 50); // Debajo del botón "Jugadores"
        this.add(weaponsButton);

        // Botones de armas (con tamaño aumentado para imágenes)
        weaponOneButton = new JButton("Arma 1");
        weaponOneButton.setBounds(240, 290, 150, 120); // Primer botón
        this.add(weaponOneButton);

        weaponTwoButton = new JButton("Arma 2");
        weaponTwoButton.setBounds(400, 290, 150, 120); // Segundo botón
        this.add(weaponTwoButton);

        weaponThreeButton = new JButton("Arma 3");
        weaponThreeButton.setBounds(560, 290, 150, 120); // Tercer botón
        this.add(weaponThreeButton);

        // Botón principal "Habitaciones"
        roomsButton = new JButton("Habitaciones");
        roomsButton.setBounds(400, 440, 150, 50); // Debajo del botón "Armas"
        this.add(roomsButton);

        // Botones de habitaciones (6 botones en una fila)
        roomOneButton = new JButton("Habitación 1");
        roomOneButton.setBounds(70, 500, 120, 120); // Primer botón
        this.add(roomOneButton);

        roomTwoButton = new JButton("Habitación 2");
        roomTwoButton.setBounds(200, 500, 120, 120); // Segundo botón
        this.add(roomTwoButton);

        roomThreeButton = new JButton("Habitación 3");
        roomThreeButton.setBounds(330, 500, 120, 120); // Tercer botón
        this.add(roomThreeButton);

        roomFourButton = new JButton("Habitación 4");
        roomFourButton.setBounds(460, 500, 120, 120); // Cuarto botón
        this.add(roomFourButton);

        roomFiveButton = new JButton("Habitación 5");
        roomFiveButton.setBounds(590, 500, 120, 120); // Quinto botón
        this.add(roomFiveButton);

        roomSixButton = new JButton("Habitación 6");
        roomSixButton.setBounds(720, 500, 120, 120); // Sexto botón
        this.add(roomSixButton);

    }

    public void addPlayerClue(int playerID) {
        switch (playerID) {
            case 1:
                playerOneButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/gun.jpeg"));
                break;
            case 2:
                playerTwoButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/clue-start-image.jpg"));
                break;
            case 3:
                playerThreeButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/clue-start-image.jpg"));
                break;
            default:
                break;
        }
    }

    public void addRoomClue(int roomID) {
        switch (roomID) {
            case 1:
                playerOneButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/gun.jpeg"));
                break;
            case 2:
                playerTwoButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/clue-start-image.jpg"));
                break;
            case 3:
                playerThreeButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/clue-start-image.jpg"));
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
    }

    private JButton playersButton;
    private JButton playerOneButton;
    private JButton playerTwoButton;
    private JButton playerThreeButton;

    private JButton weaponsButton;
    private JButton weaponOneButton;
    private JButton weaponTwoButton;
    private JButton weaponThreeButton;

    private JButton roomsButton;
    private JButton roomOneButton;
    private JButton roomTwoButton;
    private JButton roomThreeButton;
    private JButton roomFourButton;
    private JButton roomFiveButton;
    private JButton roomSixButton;

}
