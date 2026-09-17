package com.pokemon;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ScreenMenu menu = new ScreenMenu();
            menu.show();
        });
    }
}