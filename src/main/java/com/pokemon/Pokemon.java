package com.pokemon;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Pokemon {
    public void pokeStats(JsonObject pokemon){

    String name = pokemon.get("name").getAsString();
    int id = pokemon.get("id").getAsInt();
    int hp = pokemon.getAsJsonArray("stats").get(0).getAsJsonObject().get("base_stat").getAsInt();
    int atk = pokemon.getAsJsonArray("stats").get(1).getAsJsonObject().get("base_stat").getAsInt();

    System.out.println("Id: " + id);
    System.out.println("Name: " + name);
    System.out.println("hp: " + hp);
    System.out.println("atk: " + atk);

    }
}
