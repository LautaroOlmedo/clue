package view;

import javax.swing.*;
import java.awt.*;

public class RoomsCluePanel extends JPanel {
    public RoomsCluePanel() {
        this.setLayout(null);
        this.cluesBackground = new ImageIcon("/Users/lautaroolmedo/IdeaProjects/clue/src/view/images/clues-background.jpg").getImage();
        this.setRoomsClues();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(cluesBackground, 0, 0, getWidth(), getHeight(), this);
    }

    public void setRoomsClues(){

        roomOneButton = new JButton();
        roomOneButton = new JButton();
        roomOneButton.setOpaque(false);
        roomOneButton.setContentAreaFilled(false);
        roomOneButton.setBorderPainted(false);
        roomOneButton.setBounds(-10, 60, 230, 350);
        this.add(roomOneButton);

        roomTwoButton = new JButton();
        roomTwoButton = new JButton();
        roomTwoButton.setOpaque(false);
        roomTwoButton.setContentAreaFilled(false);
        roomTwoButton.setBorderPainted(false);
        roomTwoButton.setBounds(220, 60, 230, 350);
        this.add(roomTwoButton);

        roomThreeButton = new JButton();
        roomThreeButton.setOpaque(false);
        roomThreeButton.setContentAreaFilled(false);
        roomThreeButton.setBorderPainted(false);
        roomThreeButton.setBounds(450, 60, 230, 350);
        this.add(roomThreeButton);

        roomFourButton = new JButton();
        roomFourButton = new JButton();
        roomFourButton.setOpaque(false);
        roomFourButton.setContentAreaFilled(false);
        roomFourButton.setBorderPainted(false);
        roomFourButton.setBounds(680, 60, 230, 350);
        this.add(roomFourButton);

        roomFiveButton = new JButton();
        roomFiveButton = new JButton();
        roomFiveButton.setOpaque(false);
        roomFiveButton.setContentAreaFilled(false);
        roomFiveButton.setBorderPainted(false);
        roomFiveButton.setBounds(-10, 410, 230, 350);
        this.add(roomFiveButton);

        roomSixButton = new JButton();
        roomSixButton = new JButton();
        roomSixButton.setOpaque(false);
        roomSixButton.setContentAreaFilled(false);
        roomSixButton.setBorderPainted(false);
        roomSixButton.setBounds(220, 410, 230, 350);
        this.add(roomSixButton);

        roomSevenButton = new JButton();
        roomSevenButton = new JButton();
        roomSevenButton.setOpaque(false);
        roomSevenButton.setContentAreaFilled(false);
        roomSevenButton.setBorderPainted(false);
        roomSevenButton.setBounds(450, 410, 230, 350);
        this.add(roomSevenButton);

        roomEightButton = new JButton();
        roomEightButton = new JButton();
        roomEightButton.setOpaque(false);
        roomEightButton.setContentAreaFilled(false);
        roomEightButton.setBorderPainted(false);
        roomEightButton.setBounds(680, 410, 230, 350);
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

    private Image cluesBackground;
}
