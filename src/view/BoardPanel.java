package view;

import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {

    private final int TILE_SIZE = 80;
    private final int BOARD_SIZE = 5; // Tamaño total del tablero

    // Variables privadas para cada habitación


    public BoardPanel() {
        setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        createBoard();
    }

    private void createBoard() {
        // Crear una matriz para organizar las habitaciones y pasillos
        String[][] board = {
                {"Cocina", "", "Comedor", "", "Sala de Estar"},
                {"", "", "", "", ""},
                {"Biblioteca", "", "Estudio", "", "Baño"},
                {"", "", "", "", ""},
                {"Habitación 1", "", "Habitación 2", "", "Habitación 3"}
        };

        // Añade botones al panel según la matriz
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                JButton button;
                switch (board[i][j]) {
                    case "Cocina" -> {
                        kitchenButton = new JButton("KITCHEN");
                        button = kitchenButton;
                    }
                    case "Comedor" -> {
                         securityRoom= new JButton("SECURITY ROOM");
                        button = securityRoom;
                    }
                    case "Sala de Estar" -> {
                        comonRoomButton = new JButton("COMON ROOM");
                        button = comonRoomButton;
                    }
                    case "Biblioteca" -> {
                        libraryButton = new JButton("LIBRARY");
                        button = libraryButton;
                    }
                    case "Estudio" -> {
                        officeButton = new JButton("OFFICE");
                        button = officeButton;
                    }
                    case "Baño" -> {
                        terraceButton = new JButton("TERRACE");
                        button = terraceButton;
                    }
                    case "Habitación 1" -> {
                        laboratoryButton = new JButton("LABORATORY");
                        button = laboratoryButton;
                    }
                    case "Habitación 2" -> {
                        habitacion2Button = new JButton("Habitación 2");
                        button = habitacion2Button;
                    }
                    case "Habitación 3" -> {
                        habitacion3Button = new JButton("Habitación 3");
                        button = habitacion3Button;
                    }
                    default -> {
                        button = new JButton(); // Pasillos vacíos
                    }
                }
                button.setPreferredSize(new Dimension(TILE_SIZE, TILE_SIZE));
                button.setBackground(board[i][j].isEmpty() ? Color.LIGHT_GRAY : new Color(200, 200, 255)); // Color claro para las habitaciones y gris para pasillos
                button.setOpaque(true);
                button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                add(button);
            }
        }
    }

    public JButton getKitchenButton() {
        return kitchenButton;
    }

    public JButton getSecurityRoomButton() {
        return this.securityRoom;
    }

    public JButton getComonRoomButton() {
        return comonRoomButton;
    }

    public JButton getLibraryButton() {
        return libraryButton;
    }

    public JButton getOfficeButton() {
        return officeButton;
    }

    public JButton getTerraceButton() {
        return terraceButton;
    }

    public JButton getLaboratoryButton() {
        return laboratoryButton;
    }

    public JButton getHabitacion2Button() {
        return habitacion2Button;
    }

    public JButton getHabitacion3Button() {
        return habitacion3Button;
    }

    private JButton kitchenButton;
    private JButton securityRoom;
    private JButton comonRoomButton;
    private JButton libraryButton;
    private JButton officeButton;
    private JButton terraceButton;
    private JButton laboratoryButton;
    private JButton habitacion2Button;
    private JButton habitacion3Button;
}





