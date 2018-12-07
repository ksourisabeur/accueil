package com.example.aya.accueil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {
    //ConstraintLayout mylayout;
    ConstraintLayout mylayout;
    //AnimationDrawable animationDrawable ;
            final String Reservation = "Reserver_vous";
            final String nous = "Apropos_nous";
            final String Agence ="Nos_agence";
            final String EXTRA_LOGIN = "user_login";
            final String EXTRA_PASSWORD = "user_password";

            @SuppressLint("WrongViewCast")
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

               // mylayout = (ConstraintLayout) findViewById(R.id.mylayout);



                  /*  public void pro (View view){
                        Intent intent = new Intent(MainActivity.this,Apropos.class);
                        String message = loginButton.getText().toString();
                        intent.putExtra(nous, message);
                        startActivity(intent);
                    }
                    public void reserve (View view){
                        Intent intent = new Intent(MainActivity.this,Reservation.class);
                        String message = loginButton.getText().toString();
                        intent.putExtra(Reservation, message);
                        startActivity(intent);}
                    public void agen(View view){
                        Intent intent = new Intent(MainActivity.this,Apropos.class);
                        String message = loginButton.getText().toString();
                        intent.putExtra(Agence, message);
                        startActivity(intent);   }*/


            }


    public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,connecter.class);
                startActivity(in);
    }

    public void Quinous(View view) {
        Intent in = new Intent(MainActivity.this,Apropos.class);
        startActivity(in);
    }
    public void Reserver(View view) {
        Intent in = new Intent(MainActivity.this,listcar.class);
        startActivity(in);
    }

    public void Reserverbtn(View view) {
        Intent in = new Intent(MainActivity.this,Reservation.class);
        startActivity(in);
    }
}