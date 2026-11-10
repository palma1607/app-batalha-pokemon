package br.com.unicuritiba.appbatalhapokemon;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    private ImageView imageViewPokemon1;
    private ImageView imageViewPokemon2;
    private TextView textViewPokemon1;
    private TextView textViewPokemon2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageViewPokemon1 = findViewById(R.id.imageViewPlayer1);
        imageViewPokemon2 = findViewById(R.id.imageViewPlayer2);

        textViewPokemon1 = findViewById(R.id.textViewPlayer1);
        textViewPokemon2 = findViewById(R.id.textViewPlayer2);

        Partida partidaAtual = new FactoryPartida().criarPartida();
        configuraPartida(partidaAtual);
    }

    private void configuraPartida(Partida partida){

        Pokemon pokemonTreinador1 = partida.getJogador1().getPokemons().get(0);

        configurePokemonInfo(
                pokemonTreinador1.getImagemFrente(),
                imageViewPokemon1,
                pokemonTreinador1.getNome(),
                textViewPokemon1
        );

        Pokemon pokemonTreinador2 = partida.getJogador2().getPokemons().get(0);

        configurePokemonInfo(
                pokemonTreinador2.getImagemCosta(),
                imageViewPokemon2,
                pokemonTreinador2.getNome(),
                textViewPokemon2
        );

    }

    private void configurePokemonInfo(String imagem,
                                  ImageView imageView,
                                  String texto,
                                  TextView textView){
        textView.setText(texto);
        Picasso.get().load(imagem).into(imageView);
    }
}
