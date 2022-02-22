package rene.delarosa.holamundo.ejemplo.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }

    public void Anterior (View view){
        Intent Anterior = new Intent(this, MainActivity.class); //Creacion de Intent Anterior
        //Esta linea nos devuelve al activity del MainActivity.java
        startActivity(Anterior); //iniciar Activity con parámetro Intent
    }
}