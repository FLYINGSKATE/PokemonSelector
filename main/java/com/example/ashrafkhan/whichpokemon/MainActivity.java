package com.example.ashrafkhan.whichpokemon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private PokeExpert PE=new PokeExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findPokemon(View view){
        TextView tv=(TextView)findViewById(R.id.pname);
        Spinner poke=(Spinner)findViewById(R.id.spinner);
        String PokemonRegion=String.valueOf(poke.getSelectedItem());
        List<String> pokelist=PE.getPokemon(PokemonRegion);
        StringBuilder pokeFormatted=new StringBuilder();
        for(String pokemons:pokelist){
            pokeFormatted.append(pokemons).append('\n');
        }
        tv.setText(pokeFormatted);

    }
}
