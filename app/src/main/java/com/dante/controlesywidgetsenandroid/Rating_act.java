package com.dante.controlesywidgetsenandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class Rating_act extends AppCompatActivity {

    private RatingBar ratin;
    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_act);

        ratin = (RatingBar)findViewById(R.id.rt);
        but = (Button)findViewById(R.id.button6);
    }

    public void calificar(View v){
        ratin.setRating(3);

    }
}