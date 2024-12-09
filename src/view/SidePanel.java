package view;

import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel {
    public SidePanel() {
        setLayout(new GridBagLayout());


        cluesButton.setBackground(Color.DARK_GRAY);
        cluesButton.setPreferredSize(new Dimension(200, 40));
        GridBagConstraints gbcClues = new GridBagConstraints();
        gbcClues.gridx = 0;
        gbcClues.gridy = 0; // Primera fila
        gbcClues.anchor = GridBagConstraints.CENTER;
        gbcClues.insets = new Insets(10, 0, 10, 0);
        add(cluesButton, gbcClues);


        accusePlayerButton.setBackground(Color.DARK_GRAY);
        accusePlayerButton.setPreferredSize(new Dimension(200, 40));
        GridBagConstraints gbcAccuse = new GridBagConstraints();
        gbcAccuse.gridx = 0;
        gbcAccuse.gridy = 1; // Segunda fila
        gbcAccuse.anchor = GridBagConstraints.CENTER;
        gbcAccuse.insets = new Insets(10, 0, 10, 0);
        add(accusePlayerButton, gbcAccuse);


        investigateButton.setBackground(Color.DARK_GRAY);
        investigateButton.setPreferredSize(new Dimension(200, 40));
        GridBagConstraints gbcInvestigate = new GridBagConstraints();
        gbcInvestigate.gridx = 0;
        gbcInvestigate.gridy = 2; // Tercera fila
        gbcInvestigate.anchor = GridBagConstraints.CENTER;
        gbcInvestigate.insets = new Insets(10, 0, 10, 0);
        investigateButton.setEnabled(false);
        add(investigateButton, gbcInvestigate);


        goBackButton.setBackground(Color.DARK_GRAY);
        goBackButton.setPreferredSize(new Dimension(200, 40));
        GridBagConstraints gbcGoBack = new GridBagConstraints();
        gbcGoBack.gridx = 0;
        gbcGoBack.gridy = 3; // Cuarta fila
        gbcGoBack.anchor = GridBagConstraints.CENTER;
        gbcGoBack.insets = new Insets(10, 0, 10, 0);
        goBackButton.setEnabled(false);
        add(goBackButton, gbcGoBack);


        nextPageButton.setBackground(Color.DARK_GRAY);
        nextPageButton.setPreferredSize(new Dimension(200, 40));
        GridBagConstraints gbcNextPage = new GridBagConstraints();
        gbcNextPage.gridx = 0;
        gbcNextPage.gridy = 4; // Quinta fila
        gbcNextPage.anchor = GridBagConstraints.CENTER;
        gbcNextPage.insets = new Insets(10, 0, 10, 0);
        nextPageButton.setEnabled(false);
        add(nextPageButton, gbcNextPage);


        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        textArea1.setEditable(false);
        JScrollPane scrollPane1 = new JScrollPane(textArea1);

        GridBagConstraints gbcScrollPane = new GridBagConstraints();
        gbcScrollPane.gridx = 0;
        gbcScrollPane.gridy = 5;
        gbcScrollPane.fill = GridBagConstraints.BOTH;
        gbcScrollPane.weightx = 1.0;
        gbcScrollPane.weighty = 0.1;
        gbcScrollPane.insets = new Insets(10, 10, 10, 10);
        add(scrollPane1, gbcScrollPane);
        scrollPane1.setPreferredSize(new Dimension(200, 10));


        setPreferredSize(new Dimension(300, 20));
    }


    public void appendTextToFirstArea(String text) {
        textArea1.append(text + "\n");
    }

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


    private JButton cluesButton = new JButton("PISTAS");
    private JButton accusePlayerButton = new JButton("ACUSAR");
    private JButton investigateButton = new JButton("INVESTIGAR");
    private JButton goBackButton = new JButton("VOLVER");


    private JTextArea textArea1 = new JTextArea();


    private JButton nextPageButton = new JButton("SIGUIENTE");
}

