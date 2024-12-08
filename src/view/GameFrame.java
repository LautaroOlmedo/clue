package view;

import javax.swing.*;
import java.awt.*;
public class GameFrame extends JFrame {
    public GameFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("CLUE Encuentra al asesino");

        initialPanel = new InitialPanel();
        boardPanel = new BoardPanel();
        sidePanel = new SidePanel();
        playersCluesPanel = new PlayersCluesPanel();
        weaponsCluesPanel = new WeaponsCluesPanel();
        roomsCluePanel = new RoomsCluePanel();

        add(initialPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void switchToBoard() {
        setSize(1200, 800);
        remove(initialPanel);
        setLayout(new BorderLayout());

        add(boardPanel, BorderLayout.CENTER);
        add(sidePanel, BorderLayout.EAST);

        setLocationRelativeTo(null);
        revalidate();
        repaint();
    }

    public void switchToBoardPanel () {
        setSize(1200, 800);
        remove(playersCluesPanel);
        remove(weaponsCluesPanel);
        remove(roomsCluePanel);
        //remove accusationPanel
        setLayout(new BorderLayout());

        add(boardPanel, BorderLayout.CENTER);
        add(sidePanel, BorderLayout.EAST);
        this.sidePanel.getGoBackButton().setEnabled(false);
        setLocationRelativeTo(null);
        revalidate();
        repaint();
    }

    public void switchToCluesPanel(int numPage){
       if(numPage == 1){
           this.switchToPlayersCluesPanel();
       }else if(numPage == 2){
           this.switchToWeaponsCluesPanel();
       }else if(numPage == 3){
           this.switchToRoomsCluesPanel();
       }
    }

    public void switchToPlayersCluesPanel(){
        setSize(1200, 800);
        remove(boardPanel);
        add(playersCluesPanel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        //this.sidePanel.getGoBackButton().setEnabled(false);
        revalidate();
        repaint();
    }

    public void switchToWeaponsCluesPanel(){
        setSize(1200, 800);
        remove(playersCluesPanel);
        add(weaponsCluesPanel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        //this.sidePanel.getGoBackButton().setEnabled(false);
        revalidate();
        repaint();
    }

    public void switchToRoomsCluesPanel(){
        setSize(1200, 800);
        remove(playersCluesPanel);
        remove(weaponsCluesPanel);
        add(roomsCluePanel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        //this.sidePanel.getGoBackButton().setEnabled(false);
        revalidate();
        repaint();
    }

    public InitialPanel getInitialPanel() {
        return initialPanel;
    }

    public BoardPanel getBoardPanel() {
        return boardPanel;
    }

    public SidePanel getSidePanel() {
        return sidePanel;
    }



    public PlayersCluesPanel getPlayersCluesPanel() {
        return playersCluesPanel;
    }

    public WeaponsCluesPanel getWeaponsCluesPanel() {
        return weaponsCluesPanel;
    }

    public RoomsCluePanel getRoomsCluePanel() {
        return roomsCluePanel;
    }

    private InitialPanel initialPanel;
    private BoardPanel boardPanel;
    private SidePanel sidePanel;
    PlayersCluesPanel playersCluesPanel;
    WeaponsCluesPanel weaponsCluesPanel;
    RoomsCluePanel roomsCluePanel;
}




