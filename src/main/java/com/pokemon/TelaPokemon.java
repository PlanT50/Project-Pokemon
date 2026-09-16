package com.pokemon;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TelaPokemon {

    public void mostrar(String nome, String spriteUrl) {
        try {
            ImageIcon sprite = new ImageIcon(new URL(spriteUrl));

            JFrame janela = new JFrame("Pokédex");
            JLabel conteudo = new JLabel(nome, sprite, SwingConstants.CENTER);

            conteudo.setVerticalTextPosition(SwingConstants.BOTTOM);
            conteudo.setHorizontalTextPosition(SwingConstants.CENTER);

            janela.add(conteudo);
            janela.setSize(350, 350);
            janela.setLocationRelativeTo(null);
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janela.setVisible(true);

        } catch (MalformedURLException e) {
            System.err.println("URL do sprite inválida.");
        }
    }
}