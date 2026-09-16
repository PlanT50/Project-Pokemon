package com.pokemon;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Pokemon {
    public void pokeStats(JsonObject pokemon){

    String name = pokemon.get("name").getAsString();
    int id = pokemon.get("id").getAsInt();
    int hp = pokemon.getAsJsonArray("stats").get(0).getAsJsonObject().get("base_stat").getAsInt();
    int atk = pokemon.getAsJsonArray("stats").get(1).getAsJsonObject().get("base_stat").getAsInt();
    int def = pokemon.getAsJsonArray("stats").get( 2).getAsJsonObject().get("base_stat").getAsInt();
    int spatk = pokemon.getAsJsonArray("stats").get(3).getAsJsonObject().get("base_stat").getAsInt();
    int spdef = pokemon.getAsJsonArray("stats").get(4).getAsJsonObject().get("base_stat").getAsInt();
    int spd = pokemon.getAsJsonArray("stats").get(5).getAsJsonObject().get("base_stat").getAsInt();

    String spriteUrl = pokemon.getAsJsonObject("sprites").get("front_default").getAsString();


    System.out.println("--------------------------------------------------------");
    System.out.println("STATS:");                
    System.out.println("Id: " + id);               
    System.out.println("Name: " + name);                     TelaPokemon tela = new TelaPokemon();
    System.out.println("hp: " + hp);                         tela.mostrar(name, spriteUrl);
    System.out.println("atk: " + atk); 
    System.out.println("def: " + def);
    System.out.println("spatk: " + spatk);
    System.out.println("spdef: " + spdef);
    System.out.println("spd: " + spd);
    System.out.println("--------------------------------------------------------");

    }






}
