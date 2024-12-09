package view;

import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {
    public BoardPanel() {
        this.setLayout(null);
        this.boardBackground = new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/fondo.png").getImage();
        this.createBoard();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(boardBackground, 0, 0, getWidth(), getHeight(), this);
    }

    private void createBoard() {

        kitchenButton = new JButton();
        kitchenButton.setBounds(55, 49, 191, 173);
        kitchenButton.setOpaque(false);
        kitchenButton.setContentAreaFilled(false);
        kitchenButton.setBorderPainted(false);
        this.add(kitchenButton);

        ballRoomButtom = new JButton();
        ballRoomButtom.setBounds(310, 90, 256, 160);
        ballRoomButtom.setOpaque(false);
        ballRoomButtom.setContentAreaFilled(false);
        ballRoomButtom.setBorderPainted(false);
        this.add(ballRoomButtom);

        conservatoryButton = new JButton();
        conservatoryButton.setBounds(630, 62, 199, 133);
        conservatoryButton.setOpaque(false);
        conservatoryButton.setContentAreaFilled(false);
        conservatoryButton.setBorderPainted(false);
        this.add(conservatoryButton);

        billardRoomButton = new JButton();
        billardRoomButton.setBounds(630, 252, 199, 133);
        billardRoomButton.setOpaque(false);
        billardRoomButton.setContentAreaFilled(false);
        billardRoomButton.setBorderPainted(false);
        this.add(billardRoomButton);

        libraryRoomButton = new JButton();
        libraryRoomButton.setBounds(630, 415, 199, 131);
        libraryRoomButton.setOpaque(false);
        libraryRoomButton.setContentAreaFilled(false);
        libraryRoomButton.setBorderPainted(false);
        this.add(libraryRoomButton);

        studyRoomButton = new JButton();
        studyRoomButton.setBounds(607, 603, 223, 115);
        studyRoomButton.setOpaque(false);
        studyRoomButton.setContentAreaFilled(false);
        studyRoomButton.setBorderPainted(false);
        this.add(studyRoomButton);

        hallRoomButton = new JButton();
        hallRoomButton.setBounds(348, 526, 190, 185);
        hallRoomButton.setOpaque(false);
        hallRoomButton.setContentAreaFilled(false);
        hallRoomButton.setBorderPainted(false);
        this.add(hallRoomButton);

        loungeRoomButtom = new JButton();
        loungeRoomButtom.setBounds(63, 551, 216, 165);
        loungeRoomButtom.setOpaque(false);
        loungeRoomButtom.setContentAreaFilled(false);
        loungeRoomButtom.setBorderPainted(false);
        this.add(loungeRoomButtom);

        diningRoomButton = new JButton();
        diningRoomButton.setBounds(60, 282, 252, 183);
        diningRoomButton.setOpaque(false);
        diningRoomButton.setContentAreaFilled(false);
        diningRoomButton.setBorderPainted(false);
        this.add(diningRoomButton);


    }

    // Métodos de acceso para los botones de las habitaciones
    public JButton getKitchenButton() { return kitchenButton; }

    public JButton getBallRoomButton() {
        return ballRoomButtom;
    }

    public JButton getLoungeRoomButton() {
        return loungeRoomButtom;
    }

    public JButton getHallRoomButton() {
        return hallRoomButton;
    }

    public JButton getStudyRoomButton() {
        return studyRoomButton;
    }

    public JButton getBillardRoomButton() {
        return billardRoomButton;
    }

    public JButton getLibraryRoomButton() {
        return libraryRoomButton;
    }
    public JButton getConservatoryButton() { return conservatoryButton; }

    public JButton getBallRoomButtom() {
        return ballRoomButtom;
    }

    public JButton getLoungeRoomButtom() {
        return loungeRoomButtom;
    }

    public JButton getDiningRoomButton() {
        return diningRoomButton;
    }

    private JButton kitchenButton;
    private JButton ballRoomButtom;
    private JButton loungeRoomButtom;
    private JButton hallRoomButton;
    private JButton studyRoomButton;
    private JButton diningRoomButton;
    private JButton billardRoomButton;
    private JButton libraryRoomButton;
    private JButton conservatoryButton;
    private Image boardBackground;
}
