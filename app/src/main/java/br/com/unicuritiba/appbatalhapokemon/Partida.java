package br.com.unicuritiba.appbatalhapokemon;

public class Partida {

    private Treinador jogador1;

    private Treinador jogador2;

    public Partida(Treinador jogador1, Treinador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public Treinador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Treinador jogador1) {
        this.jogador1 = jogador1;
    }

    public Treinador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Treinador jogador2) {
        this.jogador2 = jogador2;
    }
}
