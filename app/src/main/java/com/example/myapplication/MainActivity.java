package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMyButtonClick(View view)
    {
        // выводим сообщение
        Toast.makeText(this, "ОНИ ИДУТ! ШТАНЫ В НОСКИ!!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, acarlsWeb.class);
        startActivity(intent);
    }
}
