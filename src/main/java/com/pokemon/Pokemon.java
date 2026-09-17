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
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------------------------");
        sb.append("STATS:");                
        sb.append("Id: " + id);               
        sb.append("Name: " + name);                     
        sb.append("hp: " + hp);                         
        sb.append("atk: " + atk); 
        sb.append("def: " + def);
        sb.append("spatk: " + spatk);
        sb.append("spdef: " + spdef);
        sb.append("spd: " + spd);
        sb.append("--------------------------------------------------------");
    }
}

