package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rollDie(View view) {
        Random r = new Random();
        int face = r.nextInt(6) + 1;
        changeImage(face);
    }

    public void changeImage(int face) {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        if(face == 1) {
            image.setImageResource(R.drawable.dice1);
        } else if(face == 2) {
            image.setImageResource(R.drawable.dice2);
        } else if(face == 3) {
            image.setImageResource(R.drawable.dice3);
        } else if(face == 4) {
            image.setImageResource(R.drawable.dice4);
        } else if(face == 5) {
            image.setImageResource(R.drawable.dice5);
        } else if(face == 6) {
            image.setImageResource(R.drawable.dice6);
        }
    }
}
