package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int runsTeamA = 0;
    int runsTeamB = 0;
    int outsTeamA = 0;
    int outsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given runs for Team A.
     */
    public void displayRunsForTeamA(int runsTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_runs);
        scoreView.setText(String.valueOf(runsTeamA));
    }

    /**
     * Displays the given outs for Team A.
     */
    public void displayOutsForTeamA(int outsTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_outs);
        scoreView.setText(String.valueOf(outsTeamA));
    }

    /**
     * This method is called when the team a add run button is clicked
     */
    public void addRunTeamA(View view) {
        runsTeamA = runsTeamA + 1;
        displayRunsForTeamA(runsTeamA);
    }

    /**
     * This method is called when the team a add out button is clicked
     */
    public void addOutTeamA(View view) {
        outsTeamA = outsTeamA + 1;
        displayOutsForTeamA(outsTeamA);
    }

    public void displayRunsForTeamB(int runsTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_runs);
        scoreView.setText(String.valueOf(runsTeamB));
    }

    public void displayOutsForTeamB(int outsTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_outs);
        scoreView.setText(String.valueOf(outsTeamB));
    }

    /**
     * This method is called when the team B add run button is clicked
     */
    public void addRunTeamB(View view) {
        runsTeamB = runsTeamB + 1;
        displayRunsForTeamB(runsTeamB);
    }

    /**
     * This method is called when the team b add an out button is clicked
     */
    public void addOutTeamB(View view) {
        outsTeamB = outsTeamB + 1;
        displayOutsForTeamB(outsTeamB);
    }



    /**
     * This method is called when the reset button is pressed
     */
    public void reset(View view) {
        runsTeamA = 0;
        runsTeamB = 0;
        displayRunsForTeamA(runsTeamA);
        displayRunsForTeamB(runsTeamB);
        outsTeamA = 0;
        outsTeamB = 0;
        displayOutsForTeamA(outsTeamA);
        displayOutsForTeamB(outsTeamB);

    }

    /**
     * This method is called when the reset button is pressed
     */
    public void newInning(View view) {
        outsTeamA = 0;
        outsTeamB = 0;
        displayOutsForTeamA(outsTeamA);
        displayOutsForTeamB(outsTeamB);

    }
}
