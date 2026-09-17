package com.pokemon;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Pokemon {

    private final int id;
    private final String name;
    private final int hpmaximo;
    private int hp;
    private final int atk;
    private final int def;
    private final int spatk;
    private final int spdef;
    private final int spd;
    private final String spriteUrl;

    public Pokemon(int id, String name, int hpmaximo, int atk, int def, int spatk, int spdef, int spd, String spriteUrl){
        this.id = id;
        this.name = name;
        this.hpmaximo = hpmaximo;
        this.hp = hpmaximo;
        this.atk = atk;
        this.def = def;
        this.spatk = spatk;
        this.spdef = spdef;
        this.spd = spd;
        this.spriteUrl = spriteUrl;

    }






    public void showStatus(){
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

