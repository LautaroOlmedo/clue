package view;

import javax.swing.*;
import java.awt.*;

class BoardPanel extends JPanel {


    public BoardPanel() {
        setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));
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
            add(roomButton);
        }
    }
    private final int TILE_SIZE = 80;
    private final int BOARD_SIZE = 6; // Ajusta al tamaño de tu tablero
}