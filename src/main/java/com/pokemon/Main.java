package com.pokemon;

import com.pokemon.api.PokeApi;

public class Main {
    public static void main(String[] args){
        PokeApi pokeApi = new PokeApi();
    
    String pokemonName = "Pikachu";
    String json = pokeApi.buscarPokemon(pokemonName);

    System.out.println(json);
    }
}