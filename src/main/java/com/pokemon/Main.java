package com.pokemon;

import java.util.Scanner;

import com.pokemon.api.PokeApi;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class Main {
    public static void main(String[] args){
        PokeApi pokeApi = new PokeApi();
        Scanner scan = new Scanner(System.in);
    while (true) {

        System.out.println("Qual pokemon quer ver?");
        String pokemonName = scan.nextLine();

        if (pokemonName.equalsIgnoreCase("sair")) {
            System.out.println("Obrigado, volte logo");
            break;
        }
    
        String json = pokeApi.buscarPokemon(pokemonName);

        if (json == null) {
            System.out.println("Pokemon não existe. Digite Novamente");
            clearTer();  
            continue;
        }

        JsonObject pokemon = JsonParser.parseString(json).getAsJsonObject();

        Pokemon pokemonInfo = new Pokemon();
        clearTer();
        pokemonInfo.pokeStats(pokemon);
    }
}

public static void clearTer(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
}