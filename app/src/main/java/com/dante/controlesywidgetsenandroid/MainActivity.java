package com.dante.controlesywidgetsenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox che1, che2;
    private TextView te1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        che1 = (CheckBox)findViewById(R.id.check1);
        che2 = (CheckBox)findViewById(R.id.check2);
        te1 = (TextView)findViewById(R.id.text1);


    }
    public void Radiob(View v)
    {
        Intent i = new Intent(this, Radiobuttons_act.class);
        startActivity(i);
    }
    public void Mostrar(View V)
    {
        if (che1.isChecked() == true){

            te1.setText("Hola mundillo");
        }
        else if (che2.isChecked() == true){
            te1.setText("Chao mundo");
        }

    }

}