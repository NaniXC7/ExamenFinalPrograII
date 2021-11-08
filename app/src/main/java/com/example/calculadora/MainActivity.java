package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView num, hola;
    Button btncero, btnuno, btndos, btntres, btncuatro, btncinco, btnseis, btnsiete, btnocho, btnnueve;
    Button btnlimpiar, btninfo, btndividir, btnmultiplicar, btnrestar, btnsumar, btnresultado, btnpunto;

    String numtext = "", help = "";
    float ingreso1, ingreso2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = findViewById(R.id.num);
        hola = findViewById(R.id.hola);

        btncero = findViewById(R.id.btncero);
        btnuno = findViewById(R.id.btnuno);
        btndos = findViewById(R.id.btndos);
        btntres = findViewById(R.id.btntres);
        btncuatro = findViewById(R.id.btncuatro);
        btncinco = findViewById(R.id.btncinco);
        btnseis = findViewById(R.id.btnseis);
        btnsiete = findViewById(R.id.btnsiete);
        btnocho = findViewById(R.id.btnocho);
        btnnueve = findViewById(R.id.btnnueve);

        btnlimpiar = findViewById(R.id.btnlimpiar);
        btninfo = findViewById(R.id.btninfo);
        btndividir = findViewById(R.id.btndividir);
        btnmultiplicar = findViewById(R.id.btnmultiplicar);
        btnrestar = findViewById(R.id.btnrestar);
        btnsumar = findViewById(R.id.btnsumar);
        btnresultado = findViewById(R.id.btnresultado);
        btnpunto = findViewById(R.id.btnpunto);

        //funcion boton enviar a la informacion
        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(i);
            }
        });

        //funcoin boton limpiar
        btnlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText("");
                hola.setText("");
                ingreso1 = 0;
                ingreso2 = 0;
                help = "";
                numtext = "";
            }
        });

        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num.getText().toString().length() > 0){

                    numtext = num.getText().toString();
                    num.setText(".");

                }else{

                    numtext = num.getText().toString();
                    num.setText(numtext+"0.");

                }

            }
        });

        btncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(num.getText().toString().length() >= 0){

                    numtext = num.getText().toString();
                    num.setText(numtext+"0");

                }else{

                    num.setText("0");

                }

            }
        });

        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(num.getText().toString().length() > 0){

                    numtext = num.getText().toString();
                    num.setText(numtext+"1");

                }else{

                    num.setText(numtext+"1");

                }

            }
        });

        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(num.getText().toString().length() > 0){

                    numtext = num.getText().toString();
                    num.setText(numtext+"2");

                }else{

                    num.setText(numtext+"2");

                }

            }
        });

        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(num.getText().toString().length() > 0){

                    numtext = num.getText().toString();
                    num.setText(numtext+"3");

                }else{

                    num.setText(numtext+"3");

                }

            }
        });

        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(num.getText().toString().length() > 0){

                    numtext = num.getText().toString();
                    num.setText(numtext+"4");

                }else{

                    num.setText(numtext+"4");

                }

            }
        });

        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(num.getText().toString().length() > 0){

                    numtext = num.getText().toString();
                    num.setText(numtext+"5");

                }else{

                    num.setText(numtext+"5");

                }

            }
        });

        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(num.getText().toString().length() > 0){

                    numtext = num.getText().toString();
                    num.setText(numtext+"6");

                }else{

                    num.setText(numtext+"6");

                }

            }
        });

        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(num.getText().toString().length() > 0){

                    numtext = num.getText().toString();
                    num.setText(numtext+"7");

                }else{

                    num.setText(numtext+"7");

                }

            }
        });

        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(num.getText().toString().length() > 0){

                    numtext = num.getText().toString();
                    num.setText(numtext+"8");

                }else{

                    num.setText(numtext+"8");

                }

            }
        });

        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num.getText().toString().length() > 0){

                    numtext = num.getText().toString();
                    num.setText(numtext+"9");

                }else{

                    num.setText(numtext+"9");

                }

            }
        });

        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numtext = num.getText().toString();
                ingreso1 = Float.parseFloat(numtext);
                hola.setText(String.valueOf(ingreso1)+"/");
                help = numtext+"/";
                numtext = "";
                num.setText("");

            }
        });

        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numtext = num.getText().toString();
                ingreso1 = Float.parseFloat(numtext);
                hola.setText(String.valueOf(ingreso1)+"+");
                help = numtext+"+";
                numtext = "";
                num.setText("");

            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numtext = num.getText().toString();
                ingreso1 = Float.parseFloat(numtext);
                hola.setText(String.valueOf(ingreso1)+"-");
                help = numtext+"-";
                numtext = "";
                num.setText("");

            }
        });

        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numtext = num.getText().toString();
                ingreso1 = Float.parseFloat(numtext);
                hola.setText(String.valueOf(ingreso1)+"*");
                help = numtext+"*";
                numtext = "";
                num.setText("");

            }
        });

        btnresultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(help.contains("/") == true){


                    numtext = num.getText().toString();

                    ingreso2 = Float.parseFloat(numtext);

                    if(ingreso2 == 0){

                        hola.setText(String.valueOf(ingreso1)+"/"+String.valueOf(ingreso2));
                        num.setText("Error");

                    }else{

                        hola.setText(String.valueOf(ingreso1)+"/"+String.valueOf(ingreso2));
                        num.setText(String.valueOf(ingreso1/ingreso2));

                    }

                }else if(help.contains("+") == true){

                    numtext = num.getText().toString();
                    ingreso2 = Float.parseFloat(numtext);
                    hola.setText(String.valueOf(ingreso1)+"+"+String.valueOf(ingreso2));
                    num.setText(String.valueOf(ingreso2+ingreso1));

                }else if(help.contains("-")){

                    numtext = num.getText().toString();
                    ingreso2 = Float.parseFloat(numtext);
                    hola.setText(String.valueOf(ingreso1)+"-"+String.valueOf(ingreso2));
                    num.setText(String.valueOf(ingreso2-ingreso1));

                }else if(help.contains("*")){

                    numtext = num.getText().toString();
                    ingreso2 = Float.parseFloat(numtext);
                    hola.setText(String.valueOf(ingreso1)+"*"+String.valueOf(ingreso2));
                    num.setText(String.valueOf(ingreso2*ingreso1));

                }


            }
        });
    }
}