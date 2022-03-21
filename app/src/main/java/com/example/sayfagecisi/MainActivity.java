package com.example.sayfagecisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button goToPage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToPage2=findViewById(R.id.btn1);
        // when click first buton
        goToPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //sayfa degistirme
                Intent sayfaiki=new Intent(MainActivity.this,page2.class);
                startActivity(sayfaiki);
            }
        });
    }
}