package com.pokemon;

import com.pokemon.api.PokeApi;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.pokemon.api.PokeApi;



public class Main {
    public static void main(String[] args){
        PokeApi pokeApi = new PokeApi();
    
    String pokemonName = "Pikachu";
    String json = pokeApi.buscarPokemon(pokemonName);

    JsonObject pokemon = JsonParser.parseString(json).getAsJsonObject();

    String name = pokemon.get("name").getAsString();
    int id = pokemon.get("id").getAsInt();
    int hp = pokemon.get("hp").getAsInt();
    int atk = pokemon.get("attack").getAsInt();

    System.out.println("Id: " + id);
    System.out.println("Name: " + name);
    System.out.println("hp: " + hp);
    System.out.println("atk: " + atk);


    
    }
}