package com.pokemon.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokeApi {
    private static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";

    public String buscarPokemon(String nome) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + nome))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                System.err.println("Pokémon não encontrado.");
                return null;
}
            return response.body();
        } catch (IOException | InterruptedException e) {
            System.err.println("Nenhum pokemon encontrado! Erro ao buscar pokemon:" + e.getMessage());
            return null;
            
        }
    }
}


