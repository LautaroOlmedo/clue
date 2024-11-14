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
    public void switchToBoard() {
        // Cambia el tamaño de la ventana para el tablero
        setSize(800, 800); // Ajusta según el tamaño que desees para el tablero

        // Remueve el panel de inicio y muestra el tablero
        remove(initialPanel);
        BoardPanel boardPanel = new BoardPanel();
        add(boardPanel);
        revalidate();
        repaint();
    }
    private InitialPanel initialPanel;
}



/*private void createBoard() {
    // Nombres de las habitaciones
    String[] rooms = {
            "Cocina", "Comedor", "Sala de Estar", "Biblioteca", "Estudio", "Baño",
            "Habitación 1", "Habitación 2", "Habitación 3", "Habitación 4", "Habitación 5", "Habitación 6"
    };

    // Añade los botones que representan cada habitación
    for (int i = 0; i < BOARD_SIZE * BOARD_SIZE; i++) {
        JButton roomButton;
        if (i < rooms.length) {
            roomButton = new JButton(rooms[i]);
        } else {
            roomButton = new JButton(""); // Casillas vacías
        }
        roomButton.setPreferredSize(new Dimension(TILE_SIZE, TILE_SIZE));
        roomButton.setBackground(Color.LIGHT_GRAY);
        roomButton.setOpaque(true);
        roomButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add(roomButton);
    }
}*/
