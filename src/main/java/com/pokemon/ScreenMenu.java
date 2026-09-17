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

        JLabel instrucao = new JLabel("Digite o nome de um Pokémon:");
        JTextField campoNome = new JTextField();

        JButton botaoStatus = new JButton("Ver status");
        JButton botaoBatalha = new JButton("Batalha");


        window.add(instrucao);
        window.add(campoNome);
        window.add(botaoStatus);
        window.add(botaoBatalha);

        window.add(panel);
        window.setSize(350, 250);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
