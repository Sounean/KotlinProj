package com.example.kotlinproj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @NonNull
    String token = "token";

    @NonNull
    private AppCompatEditText et_username;
    private AppCompatEditText et_password;
    private AppCompatEditText et_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        et_code = findViewById(R.id.et_code);

    }

    @Override
    public void onClick(View view) {

    }
}