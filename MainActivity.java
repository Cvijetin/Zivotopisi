package com.example.cvijetin.bodyweight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ispisImena, ispisPrezimena, ispisSrednje, ispisFaksa, ispisIskustva, ispisMaila;
    EditText unosImena, unosPrezimena, unosSrednje, unosFakulteta, unosIskustva, unosMaila;
    Button click;
        String i,p,s,f,is,m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ispisImena = (TextView) findViewById(R.id.IspisIme);
        ispisPrezimena = (TextView) findViewById(R.id.IspisPrezime);
        ispisSrednje = (TextView) findViewById(R.id.IspisSrednja);
        ispisFaksa = (TextView) findViewById(R.id.IspisFaks);
        ispisIskustva = (TextView) findViewById(R.id.IspisIskustvo);
        ispisMaila = (TextView) findViewById(R.id.IspisMail);

        unosImena = (EditText) findViewById(R.id.Ime);
        unosPrezimena = (EditText) findViewById(R.id.Prezime);
        unosSrednje = (EditText) findViewById(R.id.Srednja);
        unosFakulteta = (EditText) findViewById(R.id.Fakultet);
        unosIskustva = (EditText) findViewById(R.id.Experience);
        unosMaila = (EditText) findViewById(R.id.Mail);

        click = (Button) findViewById(R.id.Gumb);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = String.valueOf(unosImena.getText());
                ispisImena.setText(String.valueOf(i));
                String s = String.valueOf(unosSrednje.getText());
                ispisSrednje.setText(String.valueOf(s));
                String f = String.valueOf(unosFakulteta.getText());
                ispisFaksa.setText(String.valueOf(f));
                String is = String.valueOf(unosIskustva.getText());
                ispisIskustva.setText(String.valueOf(is));
                String m = String.valueOf(unosMaila.getText());
                ispisMaila.setText(String.valueOf(m));
            }


    });


    }
}


