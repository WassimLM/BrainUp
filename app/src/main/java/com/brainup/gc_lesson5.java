package com.brainup;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class gc_lesson5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gc_quiz5);


        Button btnc=findViewById(R.id.button5);
        Button btn1=findViewById(R.id.button11);
        Button btn3=findViewById(R.id.button12);
        Button btn4=findViewById(R.id.button13);


        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AlertDialog.Builder(gc_lesson5.this)
                        .setTitle(getText(R.string.corr))
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                        new AlertDialog.Builder(gc_lesson5.this)
                                .setTitle(getText(R.string.congratulation))
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent intent = new Intent(gc_lesson5.this,chapters.class);
                                        startActivity(intent);
                                    }
                                })
                                .show();


                            }
                        })

                        .show();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AlertDialog.Builder(gc_lesson5.this)
                        .setTitle(getText(R.string.fal))
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })

                        .show();
            }
        });



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AlertDialog.Builder(gc_lesson5.this)
                        .setTitle(getText(R.string.fal))
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })

                        .show();
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AlertDialog.Builder(gc_lesson5.this)
                        .setTitle(getText(R.string.fal))
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })

                        .show();
            }
        });

    }

}
