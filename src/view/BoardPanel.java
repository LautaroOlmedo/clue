package view;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {
    public BoardPanel() {
        setPreferredSize(new Dimension(500, 500)); // Ajusta el tamaño total del tablero

        setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        createBoard();
    }

    private void createBoard() {
        String[][] board = {
                {"kitchen", "", "dining-room", "", "balcony"},
                {"", "", "", "", ""},
                {"master-bathroom", "", "study", "", "sitting-room"},
                {"", "", "", "", ""},
                {"basement", "", "master-bedroom", "", "perfilCuco"}
        };

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                JButton button;
                switch (board[i][j]) {
                    case "kitchen" -> button = kitchenButton;
                    case "dining-room" -> button = diningRoomButtom;
                    case "balcony" -> button = balconyButtom;
                    case "master-bathroom" -> button = masterBathroomButton;
                    case "study" -> button = studyButton;
                    case "sitting-room" -> button = sittingRoomButton;
                    case "basement" -> button = basementButton;
                    case "master-bedroom" -> button = masterBedroomButton;
                    case "perfilCuco" -> button = habitacion3Button;
                    default -> button = new JButton();
                }
                button.setText(board[i][j]);

                button.setPreferredSize(new Dimension(200, 200));
                button.setPreferredSize(new Dimension(TILE_SIZE, TILE_SIZE));
                button.setBackground(board[i][j].isEmpty() ? Color.LIGHT_GRAY : new Color(200, 200, 255)); // Color claro para las habitaciones y gris para pasillos
                button.setOpaque(true);
                button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                add(button);

                if (!board[i][j].isEmpty()) {
                    try {
                        // Cargar la imagen desde los recursos
                        ImageIcon icon = new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/test.jpeg");
                        // Redimensionar la imagen al tamaño del botón
                        Image scaledImage = icon.getImage().getScaledInstance(300, 200, 50);
                        button.setIcon(new ImageIcon(scaledImage));

                        // Eliminar texto y bordes para mostrar solo la imagen
                        button.setText("");
                        button.setBorderPainted(true);
                        button.setFocusPainted(false);
                       // button.setContentAreaFilled(false);
                    } catch (Exception e) {
                        System.err.println("No se pudo cargar la imagen para " + board[i][j]);
                    }
                }else{
                    ImageIcon icon = new ImageIcon();
                    if (i != 1 && i != 3) {
                        icon = new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/road.png");
                    }else{
                        icon = new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/road-2.png");
                    }
                    Image scaledImage = icon.getImage().getScaledInstance(300, 300, 50);
                    button.setIcon(new ImageIcon(scaledImage));

                    // Eliminar texto y bordes para mostrar solo la imagen
                    button.setText("");
                    button.setBorderPainted(true);
                    button.setFocusPainted(false);
                }

                add(button);
            }
        }
    }

    // Métodos de acceso para los botones de las habitaciones
    public JButton getKitchenButton() { return kitchenButton; }

    public JButton getDiningRoomButton() {
        return diningRoomButtom;
    }

    public JButton getBalconyButton() {
        return balconyButtom;
    }

    public JButton getMasterBathroomButton() {
        return masterBathroomButton;
    }

    public JButton getStudyButton() {
        return studyButton;
    }

    public JButton getSittingRoomButton() {
        return sittingRoomButton;
    }

    public JButton getBasementButton() {
        return basementButton;
    }

    public JButton getMasterBedroomButton() {
        return masterBedroomButton;
    }

    public JButton getHabitacion3Button() { return habitacion3Button; }

    private final int TILE_SIZE = 80;
    private final int BOARD_SIZE = 5;
    private JButton kitchenButton = new JButton();
    private JButton diningRoomButtom = new JButton();
    private JButton balconyButtom = new JButton();
    private JButton masterBathroomButton = new JButton();
    private JButton studyButton = new JButton();
    private JButton sittingRoomButton = new JButton();
    private JButton basementButton = new JButton();
    private JButton masterBedroomButton = new JButton();
    private JButton habitacion3Button = new JButton();
}









