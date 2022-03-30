package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {

    TextView Email, Password;

    String email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihatdata);

        Email = findViewById(R.id.tvEmail);
        Password = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();

        email = bundle.getString("a");
        pass = bundle.getString("b");

        Email.setText(email);
        Password.setText(pass);
    }
}