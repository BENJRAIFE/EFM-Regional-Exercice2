package com.example.exercice2_efm_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button mybuttonOk;
EditText poid,taille;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        poid=findViewById(R.id.poid);
        taille=findViewById(R.id.taille);
        mybuttonOk=findViewById(R.id.button);
        mybuttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double poidSaisirParUser=Double.parseDouble(poid.getText().toString());
                double tailleSaisirParUser=Double.parseDouble(taille.getText().toString());
                IMC(poidSaisirParUser,tailleSaisirParUser);
            }
        });
    }
    public void IMC(double poid,double taille){
        double res=poid/taille;
        String imc="";
        if (res<18.5){ imc="Maigreur";}else if(res>=18.5 && res <25){ imc="Normal";}
        else if(res>=25 && res<40){ imc="Surpoid";}else if(res>40){imc="Obésité";}
        Toast.makeText(this, imc, Toast.LENGTH_SHORT).show();
    }
}

