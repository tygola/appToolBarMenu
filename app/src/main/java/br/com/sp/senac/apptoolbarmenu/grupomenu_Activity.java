package br.com.sp.senac.apptoolbarmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class grupomenu_Activity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grupomenu_layout);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.grupomenu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mgbfav:
                Toast.makeText(getApplicationContext(), "Cliquei no favoritos",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mgbspam:
                Toast.makeText(getApplicationContext(), "Cliquei no spam",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mgblixeira:
                Toast.makeText(getApplicationContext(), "Cliquei na lixeira",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mgbsair:
                finish();
                break;

        }

        return true;
    }
}
