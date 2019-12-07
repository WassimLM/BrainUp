package com.brainup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class chapters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);
        Button hb = findViewById(R.id.button);
        Button sb = findViewById(R.id.button3);
        Button gcb = findViewById(R.id.button2);

        hb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chapters.this,s_lesson.class);
                startActivity(intent);
            }

        });

        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chapters.this,h_lesson.class);
                startActivity(intent);
            }
        });

        gcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chapters.this,gc_lesson.class);
                startActivity(intent);
            }
        });


    }
}
