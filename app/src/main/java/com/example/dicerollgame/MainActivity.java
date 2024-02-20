package com.example.dicerollgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView winner;
    ImageView p1,p2;
    Button run;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = findViewById(R.id.person1);
        p2 = findViewById(R.id.person2);
        winner = findViewById(R.id.Winner);
        run = findViewById(R.id.run);

        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int d1 = random.nextInt(6)+1;
                switch(d1){
                    case 1:  p1.setImageResource(R.drawable.dice_01); break;
                    case 2:  p1.setImageResource(R.drawable.dice_02); break;
                    case 3:  p1.setImageResource(R.drawable.dice_03); break;
                    case 4:  p1.setImageResource(R.drawable.dice_04); break;
                    case 5:  p1.setImageResource(R.drawable.dice_05); break;
                    case 6:  p1.setImageResource(R.drawable.dice_06); break;
                }

                int d2 = random.nextInt(6)+1;
                switch(d2){
                    case 1:  p2.setImageResource(R.drawable.dice_01); break;
                    case 2:  p2.setImageResource(R.drawable.dice_02); break;
                    case 3:  p2.setImageResource(R.drawable.dice_03); break;
                    case 4:  p2.setImageResource(R.drawable.dice_04); break;
                    case 5:  p2.setImageResource(R.drawable.dice_05); break;
                    case 6:  p2.setImageResource(R.drawable.dice_06); break;
                }
                winner.setTextAppearance(R.style.result);
                if(d1 == d2){
                    winner.setText("Tie Match");
                }
                else if(d1 > d2){
                    winner.setText("Player 1 is the winner");
                }
                else{
                    winner.setText("Player 2 is the winner");
                }
            }
        });

    }
}