package com.dante.controlesywidgetsenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Radiobuttons_act extends AppCompatActivity {

    private CheckBox checkBox, checkBox2;
    private EditText editText, editText2;
    private TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobuttons);

        checkBox = (CheckBox)findViewById(R.id.che1);
        checkBox2 = (CheckBox)findViewById(R.id.che2);
        editText = (EditText)findViewById(R.id.editTextTextPersonName);
        editText2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        text1 = (TextView)findViewById(R.id.te1);

    }
    public void siguiente(View v)
    {
        Intent i = new Intent(this, Rating_act.class);
        startActivity(i);
    }
    public void anterior(View v)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void Calculo(View V)
    {

     if(checkBox.isChecked()==true) {

         int numero = Integer.parseInt(editText.getText().toString());
         int nimerodos = Integer.parseInt(editText2.getText().toString());

         int operacion = numero + nimerodos;

         String resultado = String.valueOf(operacion);
         text1.setText("El resultado de la suma es: " + resultado);
     }

     else if (checkBox2.isChecked()==true){
         int numero = Integer.parseInt(editText.getText().toString());
         int numero2 = Integer.parseInt(editText2.getText().toString());

         int operacion = numero - numero2;
         String resultado = String.valueOf(operacion);
         text1.setText("El resultado de la suma es: " + resultado);
     }

     }
}