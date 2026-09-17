package com.pokemon;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScreenMenu {
    public void show(){
        JFrame window = new JFrame("Pokedéx");
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));

        JButton botaoStatus = new JButton("Ver status");
        JButton botaoBatalha = new JButton("Batalha");

        panel.add(botaoStatus);
        panel.add(botaoBatalha);

        window.add(panel);
        window.setSize(750, 750);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
