package com.example.sayfagecisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {


    Button gotopage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        gotopage1=findViewById(R.id.btn2);
        gotopage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfa1=new Intent(page2.this,MainActivity.class);
                startActivity(sayfa1);
            }
        });


    }
}