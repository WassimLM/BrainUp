package com.brainup;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class h_lesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_lesson);

        ImageView ib = findViewById(R.id.imageView18);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.h_quiz);

                Button btn1=findViewById(R.id.button5);
                Button btnc=findViewById(R.id.button11);
                Button btn3=findViewById(R.id.button12);
                Button btn4=findViewById(R.id.button13);


                btnc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        new AlertDialog.Builder(h_lesson.this)
                                .setTitle(getText(R.string.corr))
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {

                                    Intent intent = new Intent(h_lesson.this,h_lesson2.class);
                                    startActivity(intent);

                                    }
                                })

                                .show();
                    }
                });

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        new AlertDialog.Builder(h_lesson.this)
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

                        new AlertDialog.Builder(h_lesson.this)
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

                        new AlertDialog.Builder(h_lesson.this)
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
        ImageView iv17 = findViewById(R.id.imageView17);
        iv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(h_lesson.this,h_lesson2.class);
                startActivity(intent);
            }
        });
    }
}
