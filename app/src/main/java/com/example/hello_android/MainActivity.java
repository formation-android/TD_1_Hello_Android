package com.example.hello_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt_hello = new TextView(this);
        txt_hello.setText("Bonjour Fouad systems");

        setContentView(txt_hello);
        // setContentView(R.layout.activity_main);
    }
}
