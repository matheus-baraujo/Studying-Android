package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto (View view){
        TextView texto = findViewById(R.id.textView5);
        texto.setText("Funcionou !!!!!");
    }

    public void sorteio (View view) {

        TextView input = findViewById(R.id.editTextTextPersonName3);

    //    if (input == " ") {

            int x = new Random().nextInt(11);
            TextView texto = findViewById(R.id.textView5);
            texto.setText("O número sorteado foi:" + x);

        }
    //}
}