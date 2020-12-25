package com.example.kyrs;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class registrationActivity extends AppCompatActivity {

    private Button registrationNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        addOnButton();
    }

    public void addOnButton() {
        registrationNew = (Button) findViewById(R.id.registNew_but);


        registrationNew.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder a_builder = new AlertDialog.Builder(registrationActivity.this);
                        a_builder.setMessage("Регистрация успешно прошла!")
                                .setCancelable(true);
                        AlertDialog alert = a_builder.create();
                        //alert.setTitle("fcsdfgvs");
                        alert.show();
                    }
                }
        );
    }
}
