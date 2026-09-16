package com.pokemon;

import java.util.Scanner;

import com.pokemon.api.PokeApi;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class Main {
    public static void main(String[] args){
        PokeApi pokeApi = new PokeApi();
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Qual pokemon quer ver?");
    String pokemonName = scan.nextLine();
    
    String json = pokeApi.buscarPokemon(pokemonName);

    JsonObject pokemon = JsonParser.parseString(json).getAsJsonObject();

    Pokemon pokemonInfo = new Pokemon();
    pokemonInfo.pokeStats(pokemon);


    

    
    }
}