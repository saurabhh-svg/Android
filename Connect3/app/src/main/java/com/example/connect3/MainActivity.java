package com.example.connect3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;

import kotlin.io.LineReader;

public class MainActivity extends AppCompatActivity {

    // 0 -> yellow , 1-> red

    int activePlayer=0;
    boolean isGameActive=true;

    int []gameState={2,2,2,2,2,2,2,2,2};

    int [][] winningPositions={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    public void dropIn(View view){
        ImageView counter = (ImageView) view;

        int taggedCounter = Integer.parseInt( counter.getTag().toString());
        // System.out.println(counter.getTag().toString());
        if(gameState[taggedCounter]==2 && isGameActive) {

            gameState[taggedCounter]=activePlayer;
            counter.setTranslationY(-1000f);
            if (activePlayer == 0) {
                activePlayer = 1;
                counter.setImageResource(R.drawable.yellow);
            } else {
                activePlayer = 0;
                counter.setImageResource(R.drawable.red);
            }
        }

        counter.animate().translationYBy(1000f).rotationBy(100).setDuration(300);

        for(int []w : winningPositions){
            if(gameState[w[0]]==gameState[w[1]] && gameState[w[2]]==gameState[w[1]] && gameState[w[0]]!=2 ){
                String winner="Red";
                if(gameState[w[0]]==0) winner="Yellow";

            System.out.println(gameState[w[0]]);
            //Some one has won !!!
                TextView winnerMessage=(TextView) findViewById(R.id.winnerMessage);
                winnerMessage.setText(winner + " Has Won !!!");
                LinearLayout layout = (LinearLayout)findViewById(R.id.playAgainLayout);
                layout.setVisibility(View.VISIBLE);
                isGameActive=false;
            }else{
                boolean isGameOver=true;
                for(int c:gameState){
                    if(c==2) isGameOver=false;
                }
                if(isGameOver){
                    TextView winnerMessage=(TextView) findViewById(R.id.winnerMessage);
                    winnerMessage.setText(" Match Tied. Try Again !!!");
                    LinearLayout layout = (LinearLayout)findViewById(R.id.playAgainLayout);
                    layout.setVisibility(View.VISIBLE);
                }
            }

        }

    }

    public void playAgain(View view){
        LinearLayout layout = (LinearLayout)findViewById(R.id.playAgainLayout);
        layout.setVisibility(View.INVISIBLE);

        isGameActive=true;
        activePlayer=0;
        Arrays.fill(gameState, 2);

        GridLayout gridLayout = (GridLayout)findViewById(R.id.gridLayout);
        for(int i=0;i<gridLayout.getChildCount();i++){
           ((ImageView)gridLayout.getChildAt(i)).setImageResource(0);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}