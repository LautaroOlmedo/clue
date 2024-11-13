package view;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        // Configura el marco principal
        setTitle("Juego de Clue");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Crea el panel del juego y lo añade al marco
        GamePanel gamePanel = new GamePanel();
        this.add(gamePanel);

        // Ajusta el tamaño de la ventana al contenido del panel
        pack();
        setLocationRelativeTo(null); // Centrar en la pantalla
    }
}

class GamePanel extends JPanel {
    private final int TILE_SIZE = 80; // Tamaño de cada casilla
    private final int BOARD_SIZE = 6;  // Tamaño del tablero 6x6

    public GamePanel() {
        this.setPreferredSize(new Dimension(TILE_SIZE * BOARD_SIZE, TILE_SIZE * BOARD_SIZE));
        this.setBackground(Color.WHITE);
        this.setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE)); // Establece un diseño de cuadrícula

        // Crea las habitaciones del tablero
        createBoard();
    }

    private void createBoard() {
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
    }
}