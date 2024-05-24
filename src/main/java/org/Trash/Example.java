package org.Trash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    public Example() {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel pane = new JPanel(gbl);
        gbc.anchor = GridBagConstraints.WEST;

        JLabel unitLbl = new JLabel("Unit");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(3, 3, 3, 30);
        gbl.setConstraints(unitLbl, gbc);
        pane.add(unitLbl);

        JLabel typeLbl = new JLabel("Type");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbl.setConstraints(typeLbl, gbc);
        pane.add(typeLbl);

        gbc.weightx = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);

        JTextField unitField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbl.setConstraints(unitField, gbc);
        pane.add(unitField);

        String[] type = { "All", "Verb", "Noun", "Adjective" };
        JComboBox<String> comboBox = new JComboBox<String>(type);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbl.setConstraints(comboBox, gbc);
        pane.add(comboBox);

        final JButton someButton = new JButton("Click me");
        someButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(someButton, "You have clicked " + someButton.getText());
            }
        });

        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        pane.add(someButton, gbc);
        add(pane, BorderLayout.CENTER);
        setSize(new Dimension(400, 300));
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Example();
            }
        });
    }
}