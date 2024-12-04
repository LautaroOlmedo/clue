package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InitialPanel extends JPanel {

    public InitialPanel() {
        backgroundImage = new ImageIcon("/home/lautaro/IdeaProjects/clue/src/view/images/clue-start-image.jpg").getImage();
        startButton = new JButton("Start");
        startButton.setBackground(Color.DARK_GRAY);
        startButton.setPreferredSize(new Dimension(100, 50));
        exitButton = new JButton("Exit");
        exitButton.setBackground(Color.DARK_GRAY);
        exitButton.setPreferredSize(new Dimension(100, 50));

        setLayout(new GridBagLayout());
        GridBagConstraints gbcStart = new GridBagConstraints();
        gbcStart.gridx = 0;
        gbcStart.gridy = 0;
        gbcStart.anchor = GridBagConstraints.CENTER;
        gbcStart.insets = new Insets(-10, 0, 0, 0); // Mueve el botón "Start" hacia arriba
        add(startButton, gbcStart);


        GridBagConstraints gbcExit = new GridBagConstraints();
        gbcExit.gridx = 0;
        gbcExit.gridy = 1; // Colocar el botón "Exit" en la siguiente fila
        gbcExit.anchor = GridBagConstraints.CENTER;
        gbcExit.insets = new Insets(10, 0, 0, 0); // Margen superior para el botón "Exit"
        add(exitButton, gbcExit);

        setPreferredSize(new Dimension(400, 600));
    }

    public JButton getStartButton() {
        return startButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar la imagen de fondo
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
    private final JButton startButton;
    private final JButton exitButton;
    private final Image backgroundImage;
}
