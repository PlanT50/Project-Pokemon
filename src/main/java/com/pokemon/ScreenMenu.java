package com.pokemon;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.pokemon.api.PokeApi;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScreenMenu {
    private final PokeApi pokeApi = new PokeApi();

    public void show(Stage stage) {
        Label instrucao = new Label("Digite o nome do Pokémon:");

        TextField campoNome = new TextField();
        campoNome.setPromptText("Exemplo: charmander");

        Button botaoStatus = new Button("Ver status");
        Button botaoBatalha = new Button("Batalha");
        Label mensagem = new Label();

        botaoStatus.setOnAction(evento -> {
            String nome = campoNome.getText().trim();

            if (nome.isEmpty()) {
                return;
            }

            buscarPokemon(nome, mensagem);
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
                botaoBatalha,
                mensagem
        );

        Scene cena = new Scene(layout, 500, 350);

        stage.setTitle("Pokédex");
        stage.setScene(cena);
        stage.show();
    }

    private void buscarPokemon(String nome, Label mensagem) {
        String json = pokeApi.buscarPokemon(nome);

        if(json == null){
            mensagem.setText("Pokemon não encontrado");
            return;
        }

        JsonObject pokemon = JsonParser.parseString(json).getAsJsonObject();

        String name = pokemon.get("name").getAsString();
        int id = pokemon.get("id").getAsInt();
        int hp = pokemon.getAsJsonArray("stats").get(0).getAsJsonObject().get("base_stat").getAsInt();
        int atk = pokemon.getAsJsonArray("stats").get(1).getAsJsonObject().get("base_stat").getAsInt();
        int def = pokemon.getAsJsonArray("stats").get( 2).getAsJsonObject().get("base_stat").getAsInt();
        int spatk = pokemon.getAsJsonArray("stats").get(3).getAsJsonObject().get("base_stat").getAsInt();
        int spdef = pokemon.getAsJsonArray("stats").get(4).getAsJsonObject().get("base_stat").getAsInt();
        int spd = pokemon.getAsJsonArray("stats").get(5).getAsJsonObject().get("base_stat").getAsInt();
        String spriteUrl = pokemon.getAsJsonObject("sprites").get("front_default").getAsString();

        Pokemon pokemonInfo = new Pokemon(id , name, hp, atk, def, spatk, spdef, spd, spriteUrl);

        mensagem.setText("Pokemon encontrado");
    }
}