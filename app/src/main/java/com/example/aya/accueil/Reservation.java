package com.example.aya.accueil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toolbar;

public class Reservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        EditText text1=(EditText)findViewById(R.id.dep);
        EditText text2=(EditText)findViewById(R.id.rp);
        EditText text3=(EditText)findViewById(R.id.datehdp);
        EditText text4=(EditText)findViewById(R.id.datehdr);



    }
    public  void btnOnclick(View view)
    {
        Intent n = new Intent(Reservation.this,listcar.class);
        startActivity(n);

    }
}


