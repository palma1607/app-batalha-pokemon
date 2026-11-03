package br.com.unicuritiba.appbatalhapokemon;

import java.util.ArrayList;

public class Treinador {

    private String nome;
    private int idade;
    private String cidadeOrigem;
    private ArrayList<Pokemon> pokemons;

    public Treinador(String nome, int idade, String cidadeOrigem) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeOrigem = cidadeOrigem;
        this.pokemons = new ArrayList<>();
    }

    public Treinador(String nome, int idade, String cidadeOrigem, ArrayList<Pokemon> pokemons) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeOrigem = cidadeOrigem;
        this.pokemons = pokemons;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        if(pokemons == null){
            pokemons = new ArrayList<>();
        }
        pokemons.add(pokemon);
    }
}
