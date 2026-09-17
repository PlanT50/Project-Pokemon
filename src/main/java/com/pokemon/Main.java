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

        String name = pokemon.get("name").getAsString();
        int id = pokemon.get("id").getAsInt();
        int hp = pokemon.getAsJsonArray("stats").get(0).getAsJsonObject().get("base_stat").getAsInt();
        int atk = pokemon.getAsJsonArray("stats").get(1).getAsJsonObject().get("base_stat").getAsInt();
        int def = pokemon.getAsJsonArray("stats").get( 2).getAsJsonObject().get("base_stat").getAsInt();
        int spatk = pokemon.getAsJsonArray("stats").get(3).getAsJsonObject().get("base_stat").getAsInt();
        int spdef = pokemon.getAsJsonArray("stats").get(4).getAsJsonObject().get("base_stat").getAsInt();
        int spd = pokemon.getAsJsonArray("stats").get(5).getAsJsonObject().get("base_stat").getAsInt();
        String spriteUrl = pokemon.getAsJsonObject("sprites").get("front_default").getAsString();

        Pokemon pokemonInfo = new Pokemon(id,name,hp,atk,def,spatk,spdef,spd,spriteUrl);
        clearTer();
    }
}

public static void clearTer(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
}