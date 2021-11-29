package com.example.fisei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TercerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
    }

    public void clickMostrarActivity(View va){
        //mostrar una actividad
        Intent intent=new Intent(this, MainActivity.class);

        this.startActivity(intent);
    }
}