package com.example.myapplication;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import classes.Quiz;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btnStart = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        TextView pytanie = findViewById(R.id.pytanie);
        Quiz quiz = new Quiz();
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnStart.setVisibility(INVISIBLE);
                button1.setVisibility(VISIBLE);
                button2.setVisibility(VISIBLE);
                button3.setVisibility(VISIBLE);
                pytanie.setVisibility(VISIBLE);
                quiz.Losuj();
            }
        });

        for(int i = 0; i < 5; i++){
            pytanie.setText(quiz.Question(i));
            int rand = random.nextInt(3);
            int score = 0;
            switch(rand){
                case 1:
                    return button1.setText(quiz.questions[i, 1]);
                    button2.setText(quiz.wrongAnswers[i, 0]);
                    button3.setText(quiz.wrongAnswers[i, 1]);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            score++;
                            break;
                        }
                    }
                break;
                case 2:
                    return button2.setText(quiz.questions[i, 1]);
                    button1.setText(quiz.wrongAnswers[i, 0]);
                    button3.setText(quiz.wrongAnswers[i, 1]);
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            score++;
                            break;
                        }
                    }
                break;
                case 3:
                    return button3.setText(quiz.questions[i, 1]);
                    button2.setText(quiz.wrongAnswers[i, 0]);
                    button1.setText(quiz.wrongAnswers[i, 1]);
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            score++;
                            break;
                        }
                    }
                break;
            }
        }
    }
}