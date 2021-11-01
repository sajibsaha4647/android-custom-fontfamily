package com.example.usinggooglefonts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.typefont);

        typeface = Typeface.createFromAsset(getAssets(), "font/Roboto-Black.ttf");
        textView.setTypeface(typeface);


    }
}