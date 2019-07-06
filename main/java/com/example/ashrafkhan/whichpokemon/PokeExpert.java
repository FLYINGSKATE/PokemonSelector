package com.example.ashrafkhan.whichpokemon;

import java.util.ArrayList;
import java.util.List;

public class PokeExpert {
    List<String> getPokemon(String PokemonRegion){
        List<String> pokemons=new ArrayList<String>();
        if(PokemonRegion.equals("Kanto")){
            pokemons.add("Charmeleon");
            pokemons.add("Squirtle");
            pokemons.add("Bulbasaur");
        }
        else if(PokemonRegion.equals("Kalos")){
            pokemons.add("Froakie");
            pokemons.add("Fenniken");
            pokemons.add("Chespin");
        }
        else if(PokemonRegion.equals("Sinnoh")){
            pokemons.add("Chimchar");
            pokemons.add("Piplup");
            pokemons.add("Turtwig");
        }
        else{
            pokemons.add("Pikachu");
            pokemons.add("Charizard");
            pokemons.add("Tortera");
        }
        return pokemons;
    }
}


