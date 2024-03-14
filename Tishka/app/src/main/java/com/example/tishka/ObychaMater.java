package com.example.tishka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ObychaMater extends AppCompatActivity {
    private ImageView strelka;
    private Button loginBtn,loginBtn2, zadBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obycha_mater);

        strelka=(ImageView) findViewById(R.id.strelka);
        strelka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regIntent= new Intent(ObychaMater.this, Admin.class);
                startActivity(regIntent);
            }
        });
        loginBtn2=(Button) findViewById(R.id.login_btn2);
        loginBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regIntent= new Intent(ObychaMater.this, Instrukcia.class);
                startActivity(regIntent);
            }
        });
    }
}