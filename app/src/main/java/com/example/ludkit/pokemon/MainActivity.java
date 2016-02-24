package com.example.ludkit.pokemon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txt_Pokemon;
    EditText txt_Tipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txt_Pokemon = (EditText)findViewById(R.id.editText);
        txt_Tipo = (EditText)findViewById(R.id.editText2);


    }
    public void ingresar(View v){

        if ((txt_Pokemon.getText().toString().equals("Pikachu") && txt_Tipo.getText().toString().equals("Rayo"))
                ||(txt_Pokemon.getText().toString().equals("Charmander")&& txt_Tipo.getText().toString().equals("Fuego"))
                ||(txt_Pokemon.getText().toString().equals("Squirtle")&& txt_Tipo.getText().toString().equals("Agua"))
                ||(txt_Pokemon.getText().toString().equals("Pidgeotto")&& txt_Tipo.getText().toString().equals("Aire"))
                ||(txt_Pokemon.getText().toString().equals("Diglett")&& txt_Tipo.getText().toString().equals("Tierra")))
        {

            Intent pokemones = new Intent(this,PokemonsList.class);
            startActivity(pokemones);

        }else{

            Toast toast = Toast.makeText(this, "Información Incorrecta", Toast.LENGTH_SHORT);
            toast.show();


        }}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
