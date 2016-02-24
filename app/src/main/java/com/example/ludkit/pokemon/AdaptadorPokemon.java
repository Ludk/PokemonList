package com.example.ludkit.pokemon;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ed on 23/02/2016.
 */
public class AdaptadorPokemon extends RecyclerView.Adapter<AdaptadorPokemon.PokemonViewHolder> {


    private ArrayList<Pokemon> datos;

    public static class PokemonViewHolder
            extends RecyclerView.ViewHolder {

        private TextView txtNombre;
        private TextView txtTipo;

        public PokemonViewHolder(View itemView) {
            super(itemView);

            txtNombre = (TextView)itemView.findViewById(R.id.Nombre);
            txtTipo = (TextView)itemView.findViewById(R.id.Tipo);
        }

        public void bindPokemon(Pokemon p) {
            txtNombre.setText(p.getNombre());
            txtTipo.setText(p.getTipo());
        }
    }

    public AdaptadorPokemon(ArrayList<Pokemon> datos) {
        this.datos = datos;
    }

    @Override
    public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista, parent, false);

        PokemonViewHolder pvh = new PokemonViewHolder(itemView);

        return pvh;
    }

    @Override
    public void onBindViewHolder(PokemonViewHolder holder, int position) {

        Pokemon item = datos.get(position);

        holder.bindPokemon(item);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
