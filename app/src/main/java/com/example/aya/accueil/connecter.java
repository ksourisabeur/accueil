package com.example.aya.accueil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class connecter extends AppCompatActivity {
    final String EXTRA_LOGIN = "user_login";
    final String EXTRA_PASSWORD = "user_password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_connecter);


    }
    public void onClicktow(View view) {
        final EditText login = (EditText) findViewById(R.id.user_email);
        final EditText pass = (EditText) findViewById(R.id.user_password);
        final Button loginButton = (Button) findViewById(R.id.connect);

        final String loginTxt = login.getText().toString();
        final String passTxt = pass.getText().toString();
        // On vérifie que le login et le password ne sont pas vides
        if (loginTxt.equals("") || passTxt.equals("")) {
            Toast.makeText(connecter.this, R.string.email_or_password_empty, Toast.LENGTH_SHORT).show();
            return;
        }
        // On déclare le pattern que l’on doit vérifier
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        // On déclare un matcher, qui comparera le pattern avec la string passée en argument
        Matcher m = p.matcher(loginTxt);
        // Si l’adresse mail saisie ne correspond pas au format d’une adresse mail, on affiche un message à l'utilisateur
        if (!m.matches()) {
            Toast.makeText(connecter.this, R.string.email_format_error, Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(connecter.this, afficheconnecter.class );
        intent.putExtra(EXTRA_LOGIN, loginTxt);
        intent.putExtra(EXTRA_PASSWORD, passTxt);
        startActivity(intent);
    }
}



