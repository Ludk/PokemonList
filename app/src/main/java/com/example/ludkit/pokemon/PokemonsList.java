package com.example.ludkit.pokemon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class PokemonsList extends AppCompatActivity {

    private RecyclerView recView;

    private ArrayList<Pokemon> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemons_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //inicialización de la lista de datos de ejemplo
        datos = new ArrayList<Pokemon>();

        datos.add(new Pokemon("Pokemon: Pikachu","Tipo: Rayo"));
        datos.add(new Pokemon("Pokemon: Charmander","Tipo: Fuego"));
        datos.add(new Pokemon("Pokemon: Squirtle","Tipo: Agua"));
        datos.add(new Pokemon("Pokemon: Pidgeotto","Tipo: Aire"));
        datos.add(new Pokemon("Pokemon: Diglett","Tipo: Tierra"));
        datos.add(new Pokemon("Pokemon: Snorlax","Tipo: Normal"));
        datos.add(new Pokemon("Pokemon: Lapras","Tipo: Agua"));
        datos.add(new Pokemon("Pokemon: Zapdos","Tipo: Electrico"));
        datos.add(new Pokemon("Pokemon: Kadabra","Tipo: Psiquico"));
        datos.add(new Pokemon("Pokemon: Magmar","Tipo: Fuego"));
        datos.add(new Pokemon("Pokemon: Weesing","Tipo: Veneno"));
        datos.add(new Pokemon("Pokemon: Chicorita","Tipo: PLanta"));
        datos.add(new Pokemon("Pokemon: Newtwo","Tipo: Psiquico"));


        //Inicialización RecyclerView
        recView = (RecyclerView) findViewById(R.id.RecView);
        recView.setHasFixedSize(true);

        final AdaptadorPokemon adaptador = new AdaptadorPokemon(datos);

        recView.setAdapter(adaptador);
        recView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }

}
