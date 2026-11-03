package br.com.unicuritiba.appbatalhapokemon;

import java.util.ArrayList;
import java.util.Random;

public class FactoryTreinador {

    public Treinador getTreinador(){
        ArrayList<Treinador> treinadors = getTreinadores();
        int posicaoAleatoria = new Random().nextInt(treinadors.size());
        return treinadors.get(posicaoAleatoria);
    }

    private ArrayList<Treinador> getTreinadores(){

        ArrayList<Treinador> treinadores = new ArrayList<>();

        treinadores.add(new Treinador(
                "Brock",
                15,
                "Pewter"
        ));

        treinadores.add(new Treinador(
                "Ash Ketchum",
                10,
                "Pallet"
        ));

        treinadores.add(new Treinador(
                "Misty",
                10,
                "Cerulean"
        ));

        treinadores.add(new Treinador(
                "Gary",
                10,
                "Pallet"
        ));

        return treinadores;
    }
}
