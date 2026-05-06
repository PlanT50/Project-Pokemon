package com.pokemon.api;

public class PokeApi {
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
            return response.body();
        } catch (IOException | InterruptedException e) {
            return "Erro ao buscar Pokemon: " + e.getMessage();
        }
    }
}

}
