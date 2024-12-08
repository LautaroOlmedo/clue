package view;

import javax.swing.*;

public class PlayersCluesPanel extends JPanel {
    public PlayersCluesPanel() {
        this.setLayout(null);
        this.setPlayersClues();
    }

    public void setPlayersClues() {
        // Botón principal "Jugadores"
        playersButton = new JButton("Jugadores");
        playersButton.setBounds(350, 10, 200, 50); // Posición inicial
        this.add(playersButton);

        // Botones de jugadores (con tamaño aumentado para imágenes)
        playerOneButton = new JButton();
        playerOneButton.setOpaque(false);
        playerOneButton.setContentAreaFilled(false);
        playerOneButton.setBorderPainted(false);
        //playerOneButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/players/miss-red.jpeg"));
        playerOneButton.setBounds(10, 80, 260, 350); // Primer botón
        this.add(playerOneButton);

        playerTwoButton = new JButton();
        playerTwoButton.setOpaque(false);
        playerTwoButton.setContentAreaFilled(false);
        playerTwoButton.setBorderPainted(false);
        //playerTwoButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/players/mr-violete.jpeg"));
        playerTwoButton.setBounds(310, 80, 260, 350); // Segundo botón
        this.add(playerTwoButton);

        playerThreeButton = new JButton();
        //playerThreeButton.setOpaque(false);
        //playerThreeButton.setContentAreaFilled(false);
        //playerThreeButton.setBorderPainted(false);
        //playerThreeButton.setIcon(new ImageIcon("/home/lautaro/IdeaProjects/clue/src/model/images/players/mr-green.jpeg"));
        playerThreeButton.setBounds(610, 80, 260, 350); // Tercer botón
        this.add(playerThreeButton);
    }

    public void addPlayerClue(ImageIcon playerImage) {
        if(playerOneButton.getIcon() == null){
            this.playerOneButton.setIcon(playerImage);
        }else if(playerTwoButton.getIcon() == null){
            this.playerTwoButton.setIcon(playerImage);
        }else{
            this.playerThreeButton.setIcon(playerImage);
        }
    }

    private JButton playersButton;
    private JButton playerOneButton;
    private JButton playerTwoButton;
    private JButton playerThreeButton;


}
