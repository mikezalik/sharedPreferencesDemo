package com.mikezalik.sharedpreferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.mikezalik.sharedpreferencesdemo", Context.MODE_PRIVATE);

        sharedPreferences.edit().putString("username", "Mike").apply();

        sharedPreferences.getString("username", "");
    }
}
