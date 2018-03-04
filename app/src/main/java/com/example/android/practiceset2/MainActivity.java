package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantityA = 0;
    int quantityB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View view) {
        quantityA = quantityA + 3;
        displayForTeamA(quantityA);
    }

    public void addTwoForTeamA(View view) {
        quantityA = quantityA + 2;
        displayForTeamA(quantityA);
    }

    public void addOneForTeamA(View view) {
        quantityA = quantityA + 1;
        displayForTeamA(quantityA);
    }

    public void resetAll(View view) {
        quantityA = 0;
        quantityB = 0;
        displayForTeamA(quantityA);
        displayForTeamB(quantityB);
    }

    public void addThreeForTeamB(View view) {
        quantityB = quantityB + 3;
        displayForTeamB(quantityB);
    }

    public void addTwoForTeamB(View view) {
        quantityB = quantityB + 2;
        displayForTeamB(quantityB);
    }

    public void addOneForTeamB(View view) {
        quantityB = quantityB + 1;
        displayForTeamB(quantityB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
