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

        add(initialPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void switchToBoard() {
        // Configura el tamaño de la ventana
        setSize(800, 600); // Ajusta el tamaño según tus necesidades

        // Remueve el panel inicial
        remove(initialPanel);

        // Configura el diseño principal
        setLayout(new BorderLayout());

        // Agrega el tablero al centro y el panel lateral a la derecha
        add(boardPanel, BorderLayout.CENTER);
        add(sidePanel, BorderLayout.EAST);

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

    private InitialPanel initialPanel;
    private BoardPanel boardPanel;
    private SidePanel sidePanel;
}




