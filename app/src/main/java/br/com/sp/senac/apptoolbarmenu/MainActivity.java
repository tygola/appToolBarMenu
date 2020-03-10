package br.com.sp.senac.apptoolbarmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //variavel global

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //apresentação do objeto java paea objeto layout

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setTitle("TygolaNoBeat");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.msalvar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no salvar",
                        Toast.LENGTH_SHORT).show();
                ;
                break;
        }
        switch (item.getItemId()) {
            case R.id.malterar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no alterar",
                        Toast.LENGTH_SHORT).show();
                ;
                break;
        }
        switch (item.getItemId()) {
            case R.id.mexcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no excluir",
                        Toast.LENGTH_SHORT).show();
                ;
                break;
        }
        switch (item.getItemId()) {
            case R.id.mbuscar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no buscar",
                        Toast.LENGTH_SHORT).show();
                ;
                break;
        }
        switch (item.getItemId()) {
            case R.id.msair:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no sair",
                        Toast.LENGTH_SHORT).show();
                ;
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
