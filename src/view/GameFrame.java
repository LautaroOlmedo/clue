package view;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        initialPanel = new InitialPanel();
        add(initialPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public InitialPanel getInitialPanel() {
        return initialPanel;
    }

    public BoardPanel getBoardPanel() {
        return boardPanel;
    }

    public void switchToBoard() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Cambia el tamaño de la ventana para el tablero
        setSize(800, 800); // Ajusta según el tamaño que desees para el tablero

        // Remueve el panel de inicio y muestra el tablero
        remove(initialPanel);
         boardPanel = new BoardPanel();
        add(boardPanel);
        setLocationRelativeTo(null);
        revalidate();
        repaint();
    }
    private InitialPanel initialPanel;
    private BoardPanel boardPanel;
}




