package view;

import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel {
    public SidePanel() {
        setLayout(new GridBagLayout());

        // Botón Clues
        cluesButton.setBackground(Color.DARK_GRAY);
        cluesButton.setPreferredSize(new Dimension(200, 40));
        GridBagConstraints gbcClues = new GridBagConstraints();
        gbcClues.gridx = 0;
        gbcClues.gridy = 0; // Primera fila
        gbcClues.anchor = GridBagConstraints.CENTER;
        gbcClues.insets = new Insets(10, 0, 10, 0); // Márgenes
        add(cluesButton, gbcClues);

        // Botón Accuse
        accusePlayerButton.setBackground(Color.DARK_GRAY);
        accusePlayerButton.setPreferredSize(new Dimension(200, 40));
        GridBagConstraints gbcAccuse = new GridBagConstraints();
        gbcAccuse.gridx = 0;
        gbcAccuse.gridy = 1; // Segunda fila
        gbcAccuse.anchor = GridBagConstraints.CENTER;
        gbcAccuse.insets = new Insets(10, 0, 10, 0); // Márgenes
        add(accusePlayerButton, gbcAccuse);

        // Botón Investigate
        investigateButton.setBackground(Color.DARK_GRAY);
        investigateButton.setPreferredSize(new Dimension(200, 40));
        GridBagConstraints gbcInvestigate = new GridBagConstraints();
        gbcInvestigate.gridx = 0;
        gbcInvestigate.gridy = 2; // Tercera fila
        gbcInvestigate.anchor = GridBagConstraints.CENTER;
        gbcInvestigate.insets = new Insets(10, 0, 10, 0); // Márgenes
        investigateButton.setEnabled(false);
        add(investigateButton, gbcInvestigate);

        // Botón Go Back
        goBackButton.setBackground(Color.DARK_GRAY);
        goBackButton.setPreferredSize(new Dimension(200, 40));
        GridBagConstraints gbcGoBack = new GridBagConstraints();
        gbcGoBack.gridx = 0;
        gbcGoBack.gridy = 3; // Cuarta fila
        gbcGoBack.anchor = GridBagConstraints.CENTER;
        gbcGoBack.insets = new Insets(10, 0, 10, 0); // Márgenes
        goBackButton.setEnabled(false);
        add(goBackButton, gbcGoBack);

        // Botón Next Page
        nextPageButton.setBackground(Color.DARK_GRAY);
        nextPageButton.setPreferredSize(new Dimension(200, 40));
        GridBagConstraints gbcNextPage = new GridBagConstraints();
        gbcNextPage.gridx = 0;
        gbcNextPage.gridy = 4; // Quinta fila
        gbcNextPage.anchor = GridBagConstraints.CENTER;
        gbcNextPage.insets = new Insets(10, 0, 10, 0); // Márgenes
        nextPageButton.setEnabled(false);
        add(nextPageButton, gbcNextPage);

        // Primera JTextArea con ScrollPane
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        textArea1.setEditable(false);
        JScrollPane scrollPane1 = new JScrollPane(textArea1);

        GridBagConstraints gbcScrollPane = new GridBagConstraints();
        gbcScrollPane.gridx = 0;
        gbcScrollPane.gridy = 5; // Sexta fila
        gbcScrollPane.fill = GridBagConstraints.BOTH;
        gbcScrollPane.weightx = 1.0;
        gbcScrollPane.weighty = 1.0;
        gbcScrollPane.insets = new Insets(10, 10, 10, 10); // Márgenes
        add(scrollPane1, gbcScrollPane);

        // Configurar tamaño del panel
        setPreferredSize(new Dimension(300, 20));
    }

    // Métodos para agregar texto a las JTextAreas
    public void appendTextToFirstArea(String text) {
        textArea1.append(text + "\n");
    }

    public void appendTextToSecondArea(String text) {
        textArea2.append(text + "\n");
    }

    // Métodos de acceso para los botones
    public JButton getCluesButton() {
        return cluesButton;
    }

    public JButton getAccusePlayerButton() {
        return accusePlayerButton;
    }

    public JButton getInvestigateButton() {
        return investigateButton;
    }

    public JButton getGoBackButton() {
        return goBackButton;
    }

    public JTextArea getFirstTextArea() {
        return textArea1;
    }

    public JButton getNextPageButton() {
        return nextPageButton;
    }

    // Variables tamaño del tablero
    private final int TILE_SIZE = 80;
    private final int BOARD_SIZE = 5;

    // Botones para acciones
    private JButton cluesButton = new JButton("PISTAS");
    private JButton accusePlayerButton = new JButton("ACUSAR");
    private JButton investigateButton = new JButton("INVESTIGAR");
    private JButton goBackButton = new JButton("VOLVER");

    // Áreas de texto divididas
    private JTextArea textArea1 = new JTextArea();
    private JTextArea textArea2 = new JTextArea();

    private JButton nextPageButton = new JButton("SIGUIENTE");
}


 // ------------------
/*public class SidePanel extends JPanel {
    public SidePanel() {
        setLayout(new GridBagLayout());

        cluesButton.setBackground(Color.DARK_GRAY);
        cluesButton.setPreferredSize(new Dimension(200, 50));
        GridBagConstraints gbcClues = new GridBagConstraints();
        gbcClues.gridx = 0;
        gbcClues.gridy = 0;
        gbcClues.anchor = GridBagConstraints.CENTER;
        gbcClues.insets = new Insets(50, 0, 0, 0); // Espaciado superior
        add(cluesButton, gbcClues);

        accusePlayerButton.setBackground(Color.DARK_GRAY);
        accusePlayerButton.setPreferredSize(new Dimension(200, 50));
        GridBagConstraints gbcAccuse = new GridBagConstraints();
        gbcAccuse.gridx = 0;
        gbcAccuse.gridy = 1;
        gbcAccuse.anchor = GridBagConstraints.CENTER;
        gbcAccuse.insets = new Insets(50, 0, 0, 0);
        add(accusePlayerButton, gbcAccuse);

        investigateButton.setBackground(Color.DARK_GRAY);
        investigateButton.setPreferredSize(new Dimension(200, 50));
        GridBagConstraints gbcInvestigate = new GridBagConstraints();
        gbcInvestigate.gridx = 0;
        gbcInvestigate.gridy = 2;
        gbcInvestigate.anchor = GridBagConstraints.CENTER;
        gbcInvestigate.insets = new Insets(50, 0, 0, 0);
        add(investigateButton, gbcInvestigate);

        // Crear JTextArea dentro de un JScrollPane
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false); // Solo para mostrar texto
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(250, 150));

        GridBagConstraints gbcTextArea = new GridBagConstraints();
        gbcTextArea.gridx = 0;
        gbcTextArea.gridy = 3;
        gbcTextArea.fill = GridBagConstraints.BOTH;
        gbcTextArea.weightx = 1.0; // Para que ocupe todo el ancho disponible
        gbcTextArea.weighty = 1.0; // Para expandirse verticalmente
        gbcTextArea.insets = new Insets(50, 10, 10, 10); // Margen alrededor
        add(scrollPane, gbcTextArea);

        setPreferredSize(new Dimension(300, TILE_SIZE * BOARD_SIZE));
    }

    public void appendText(String text) {
        textArea.append(text + "\n");
    }

    // Métodos de acceso para los botones de acciones
    public JButton getCluesButton() {
        return cluesButton;
    }

    public JButton getAccusePlayerButton() {
        return accusePlayerButton;
    }

    public JButton getInvestigateButton() {
        return investigateButton;
    }

    public JTextArea getJText() {return textArea;}

    // Variables tamaño del tablero
    private final int TILE_SIZE = 80;
    private final int BOARD_SIZE = 5; // Tamaño total del tablero
    // Botones  para acciones
    private JButton cluesButton = new JButton("CLUES");
    private JButton accusePlayerButton = new JButton("ACCUSE");
    private JButton investigateButton = new JButton("INVESTIGATE");
    private JTextArea textArea = new JTextArea();
}*/

// JTextArea textArea = new JTextArea();
//public JTextArea getJText() {return textArea;}
  /* textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        scrollPane.setPreferredSize(new Dimension(200, 150));
        GridBagConstraints gbcTextArea = new GridBagConstraints();
        gbcTextArea.gridx = 0;
        gbcTextArea.gridy = 0;
        gbcTextArea.fill = GridBagConstraints.BOTH;
        gbcTextArea.weightx = 1.0;
        gbcTextArea.weighty = 1.0;
        sidePanel.add(scrollPane, gbcTextArea);*/
