package rene.delarosa.holamundo.ejemplo.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo del boton siguiente
    public void Siguiente (View view){
        Intent Siguiente = new Intent(this, SegundoActivity.class); //Creacion de Intent
        //Parametros (activity actual, activity a la que queremos ir)
        startActivity(Siguiente);

    }
}