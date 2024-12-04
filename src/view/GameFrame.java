package view;

import model.Clues;

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
        cluesPanel = new CluesPanel();

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

    public void switchToCluesPanel(){
        setSize(1200, 800);
        remove(boardPanel);
        add(cluesPanel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
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

    public CluesPanel getCluesPanel() {
        return cluesPanel;
    }

    private InitialPanel initialPanel;
    private BoardPanel boardPanel;
    private SidePanel sidePanel;
    CluesPanel cluesPanel;
}




