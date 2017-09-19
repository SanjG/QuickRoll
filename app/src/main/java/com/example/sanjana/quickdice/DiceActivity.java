package com.example.sanjana.quickdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {

    Button rollButton;
    ImageView dice6;
    Random r;
    int rolledNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        rollButton = (Button) findViewById(R.id.rollButton);
        dice6 = (ImageView) findViewById(R.id.dice6);
        r = new Random();

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolledNumber = r.nextInt(6) + 1;

                if (rolledNumber == 1) {
                    dice6.setImageResource(R.drawable.d1);
                } else if (rolledNumber == 2) {
                    dice6.setImageResource(R.drawable.d2);
                } else if (rolledNumber == 3) {
                    dice6.setImageResource(R.drawable.d3);
                } else if (rolledNumber == 4) {
                    dice6.setImageResource(R.drawable.d4);
                } else if (rolledNumber == 5) {
                    dice6.setImageResource(R.drawable.d5);
                } else if (rolledNumber == 6) {
                    dice6.setImageResource(R.drawable.d6);
                }
                Toast.makeText(DiceActivity.this, "Rolled!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
