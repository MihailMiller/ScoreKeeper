package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int touchdown_points = 6;
    int field_goal_points = 3;
    int extra_points = 1;
    int safety_points = 2;
    int score_team_a = 0;
    int score_team_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Update Scores
     */
    public void resetScores(View v) {
        score_team_a = 0;
        score_team_b = 0;
        displayTeamAScore(score_team_a);
        displayTeamBScore(score_team_b);
    }

    public void updateTeamScore(View v) {
        switch(v.getId()) {
            case R.id.touchdown_team_a:
                score_team_a += touchdown_points;
                break;
            case R.id.field_goal_team_a:
                score_team_a += field_goal_points;
                break;
            case R.id.extra_point_team_a:
                score_team_a += extra_points;
                break;
            case R.id.safety_team_a:
                score_team_a += safety_points;
                break;

            case R.id.touchdown_team_b:
                score_team_b += touchdown_points;
                break;
            case R.id.field_goal_team_b:
                score_team_b += field_goal_points;
                break;
            case R.id.extra_point_team_b:
                score_team_b += extra_points;
                break;
            case R.id.safety_team_b:
                score_team_b += safety_points;
                break;

            default:
                break;
        }

        displayTeamAScore(score_team_a);
        displayTeamBScore(score_team_b);
    }

    /**
     * Display Scores
     */
    public void displayTeamAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeamBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }
}