package view;

import javax.swing.*;
import java.awt.*;

public class WeaponsCluesPanel extends JPanel {
    public WeaponsCluesPanel() {
        this.setLayout(null);
        this.cluesBackground = new ImageIcon("/Users/lautaroolmedo/IdeaProjects/clue/src/view/images/clues-background.jpg").getImage();
        this.setWeaponsClues();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(cluesBackground, 0, 0, getWidth(), getHeight(), this);
    }

    public void setWeaponsClues(){
        weaponOneButton = new JButton();
        weaponOneButton.setOpaque(false);
        weaponOneButton.setContentAreaFilled(false);
        weaponOneButton.setBorderPainted(false);
        weaponOneButton.setBounds(10, 80, 260, 350);
        this.add(weaponOneButton);

        weaponTwoButton = new JButton();
        weaponTwoButton.setOpaque(false);
        weaponTwoButton.setContentAreaFilled(false);
        weaponTwoButton.setBorderPainted(false);
        weaponTwoButton.setBounds(310, 80, 260, 350); // Segundo botón
        this.add(weaponTwoButton);

        weaponThreeButton = new JButton();
        weaponThreeButton.setOpaque(false);
        weaponThreeButton.setContentAreaFilled(false);
        weaponThreeButton.setBorderPainted(false);
        weaponThreeButton.setBounds(610, 80, 260, 350); // Tercer botón
        this.add(weaponThreeButton);
    }

    public void addWeaponClue(ImageIcon weaponImage) {
        if(weaponOneButton.getIcon() == null){
            this.weaponOneButton.setIcon(weaponImage);
        }else if(weaponTwoButton.getIcon() == null){
            this.weaponTwoButton.setIcon(weaponImage);
        }else{
            this.weaponThreeButton.setIcon(weaponImage);
        }
    }

    private JButton weaponsButton;
    private JButton weaponOneButton;
    private JButton weaponTwoButton;
    private JButton weaponThreeButton;

    private Image cluesBackground;
}
