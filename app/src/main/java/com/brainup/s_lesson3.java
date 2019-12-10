package com.brainup;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class s_lesson3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s_lesson3);

        ImageView ib = findViewById(R.id.imageView24);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.s_qiuz3);

                Button btn1=findViewById(R.id.button5);
                Button btn4=findViewById(R.id.button11);
                Button btn3=findViewById(R.id.button12);
                Button btnc=findViewById(R.id.button13);


                btnc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        new AlertDialog.Builder(s_lesson3.this)
                                .setTitle(getText(R.string.corr))
                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {

                                        new AlertDialog.Builder(s_lesson3.this)
                                                .setTitle(getText(R.string.congratulation))
                                                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                                    @Override
                                                    public void onClick(DialogInterface dialogInterface, int i) {
                                                        Intent intent = new Intent(s_lesson3.this,chapters.class);
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

                        new AlertDialog.Builder(s_lesson3.this)
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

                        new AlertDialog.Builder(s_lesson3.this)
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

                        new AlertDialog.Builder(s_lesson3.this)
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
    }
}
