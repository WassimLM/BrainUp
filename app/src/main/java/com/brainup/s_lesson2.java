package com.brainup;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class s_lesson2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s_lesson2);

        ImageView ib = findViewById(R.id.imageView24);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.s_quiz2);

                Button btnc=findViewById(R.id.button5);
                Button btn1=findViewById(R.id.button11);
                Button btn3=findViewById(R.id.button12);
                Button btn4=findViewById(R.id.button13);


                btnc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        new AlertDialog.Builder(s_lesson2.this)
                                .setTitle(getText(R.string.corr))
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {

                                        Intent intent = new Intent(s_lesson2.this,s_lesson3.class);
                                        startActivity(intent);

                                    }
                                })

                                .show();
                    }
                });

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        new AlertDialog.Builder(s_lesson2.this)
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

                        new AlertDialog.Builder(s_lesson2.this)
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

                        new AlertDialog.Builder(s_lesson2.this)
                                .setTitle(getText(R.string.fal))
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                })

                                .show();
                    }
                });

            }
        });
        ImageView iv23 = findViewById(R.id.imageView23);
        iv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(s_lesson2.this,s_lesson3.class);
                startActivity(intent);
            }
        });
    }
}
