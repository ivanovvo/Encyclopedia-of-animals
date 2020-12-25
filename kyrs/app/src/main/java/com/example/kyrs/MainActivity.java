package com.example.kyrs;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button registration, mainMenu;


    public void addOnButton(){
        registration = (Button)findViewById(R.id.registration_but);
        mainMenu = (Button)findViewById(R.id.entrance_but);


        mainMenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                        a_builder.setMessage("Вход успешен!")
                                .setCancelable(false)
                                .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                                     @Override
                                     public void onClick(DialogInterface dialog, int which) {
                                         dialog.cancel();
                                         Intent intent = new Intent(".MainMenuActivity");
                                         startActivity(intent);
                                     }
                                });
                        AlertDialog alert = a_builder.create();
                        //alert.setTitle("fcsdfgvs");
                        alert.show();

                    }
                }
        );

        registration.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                     public void onClick(View v){
                        Intent intent = new Intent(".registrationActivity");
                        startActivity(intent);

                        /*AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                        a_builder.setMessage("fsdgsg")
                                .setCancelable(true)
                                .setNegativeButton("vvcxb", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert = a_builder.create();
                        alert.setTitle("fcsdfgvs");
                        alert.show();*/
                     }
                }
        );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addOnButton();
    }
}
