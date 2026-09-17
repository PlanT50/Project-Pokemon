package com.pokemon;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScreenMenu {

    public void show(Stage stage) {
        Label instrucao = new Label("Digite o nome do Pokémon:");

        TextField campoNome = new TextField();
        campoNome.setPromptText("Exemplo: charmander");

        Button botaoStatus = new Button("Ver status");
        Button botaoBatalha = new Button("Batalha");

        botaoStatus.setOnAction(evento -> {
            String nome = campoNome.getText().trim();

            if (nome.isEmpty()) {
                return;
            }

            buscarPokemon(nome);
        });

        botaoBatalha.setOnAction(evento -> {
            System.out.println("A batalha será implementada depois.");
        });

        VBox layout = new VBox(12);
        layout.setPadding(new Insets(30));
        layout.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(
                instrucao,
                campoNome,
                botaoStatus,
                botaoBatalha
        );

        Scene cena = new Scene(layout, 500, 350);

        stage.setTitle("Pokédex");
        stage.setScene(cena);
        stage.show();
    }

    private void buscarPokemon(String nome) {
        System.out.println("Buscar Pokémon: " + nome);
    }
}