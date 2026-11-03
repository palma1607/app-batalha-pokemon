package br.com.unicuritiba.appbatalhapokemon;

import java.util.ArrayList;
import java.util.Random;

public class FactoryPokemon {

    public Pokemon createPokemon(int elemento){
        ArrayList<Pokemon> pokemons = getPokemonTipoTerra();
        int numberRandom = new Random().nextInt(pokemons.size());
        return pokemons.get(numberRandom);
    }

    private ArrayList<Pokemon> getPokemonTipoTerra(){

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Pokemon(
            "Onix",
                Pokemon.TERRA,
                70,
                80,
                90,
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/showdown/95.gif",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/showdown/back/95.gif"
        ));


        pokemons.add(new Pokemon(
                "Geodude",
                Pokemon.TERRA,
                70,
                80,
                90,
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/showdown/74.gif",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/showdown/back/74.gif"
        ));
        return pokemons;
    }
}
