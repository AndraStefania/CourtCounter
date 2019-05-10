package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsTeamOne = 0;
    int goalsTeamTwo = 0;
    int yellowTeamOne = 0;
    int yellowTeamTwo = 0;
    int redTeamOne = 0;
    int redTeamTwo = 0;
    int penaltyTeamOne = 0;
    int penaltyTeamTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the goal for Team One by 1 point.
     */
    public void addGoalTeamOne(View v) {
        goalsTeamOne += 1;
        displayGoalsTeamOne(goalsTeamOne);
    }

    /**
     * Increase the yellow card for Team One by 1 point.
     */
    public void addYellowCardTeamOne(View v) {
        yellowTeamOne += 1;
        displayYellowTeamOne(yellowTeamOne);
    }

    /**
     * Increase the red card for Team One by 1 point.
     */
    public void addRedTeamOne(View v) {
        redTeamOne += 1;
        displayRedTeamOne(redTeamOne);
    }

    /**
     * Increase the penalty for Team One by 1 point.
     */
    public void addPenaltyTeamOne(View v) {
        penaltyTeamOne += 1;
        displayPenaltyTeamOne(penaltyTeamOne);
    }

    /**
     * Displays the given goals for Team One.
     */
    public void displayGoalsTeamOne(int goalsTeamOne) {
        TextView scoreView = (TextView) findViewById(R.id.goalsTeamOne);
        scoreView.setText(String.valueOf(goalsTeamOne));
    }

    /**
     * Displays the given yellow card for Team One.
     */
    public void displayYellowTeamOne(int yellowTeamOne) {
        TextView scoreView = (TextView) findViewById(R.id.yellowTeamOne);
        scoreView.setText(String.valueOf(yellowTeamOne));
    }

    /**
     * Displays the given red card for Team One.
     */
    public void displayRedTeamOne(int redTeamOne) {
        TextView scoreView = (TextView) findViewById(R.id.redTeamOne);
        scoreView.setText(String.valueOf(redTeamOne));
    }

    /**
     * Displays the given penalty for Team One.
     */
    public void displayPenaltyTeamOne(int penaltyTeamOne) {
        TextView scoreView = (TextView) findViewById(R.id.penaltyTeamOne);
        scoreView.setText(String.valueOf(penaltyTeamOne));
    }

    /**
     * Increase the goal for Team Two by 1 point.
     */
    public void addGoalTeamTwo(View v) {
        goalsTeamTwo += 1;
        displayGoalsTeamTwo(goalsTeamTwo);
    }

    /**
     * Increase the yellow card for Team Two by 1 point.
     */
    public void addYellowCardTeamTwo(View v) {
        yellowTeamTwo += 1;
        displayYellowTeamTwo(yellowTeamTwo);
    }

    /**
     * Increase the red card for Team Two by 1 point.
     */
    public void addRedTeamTwo(View v) {
        redTeamTwo += 1;
        displayRedTeamTwo(redTeamTwo);
    }

    /**
     * Increase the penalty for Team Two by 1 point.
     */
    public void addPenaltyTeamTwo(View v) {
        penaltyTeamTwo += 1;
        displayPenaltyTeamTwo(penaltyTeamTwo);
    }

    /**
     * Reset the given goals, yellow, red and penalty for Team One and Two.
     */
    public void resetScore(View v) {
        goalsTeamOne = 0;
        goalsTeamTwo = 0;
        yellowTeamOne = 0;
        yellowTeamTwo = 0;
        redTeamOne = 0;
        redTeamTwo = 0;
        penaltyTeamOne = 0;
        penaltyTeamTwo = 0;
        displayGoalsTeamOne(0);
        displayYellowTeamOne(0);
        displayRedTeamOne(0);
        displayPenaltyTeamOne(0);
        displayGoalsTeamTwo(0);
        displayYellowTeamTwo(0);
        displayRedTeamTwo(0);
        displayPenaltyTeamTwo(0);
    }

    /**
     * Displays the given goals for Team Two.
     */
    public void displayGoalsTeamTwo(int goalsTeamTwo) {
        TextView scoreView = (TextView) findViewById(R.id.goalsTeamTwo);
        scoreView.setText(String.valueOf(goalsTeamTwo));
    }

    /**
     * Displays the given yellow card for Team Two.
     */
    public void displayYellowTeamTwo(int yellowTeamTwo) {
        TextView scoreView = (TextView) findViewById(R.id.yellowTeamTwo);
        scoreView.setText(String.valueOf(yellowTeamTwo));
    }

    /**
     * Displays the given red card for Team Two.
     */
    public void displayRedTeamTwo(int redTeamTwo) {
        TextView scoreView = (TextView) findViewById(R.id.redTeamTwo);
        scoreView.setText(String.valueOf(redTeamTwo));
    }

    /**
     * Displays the given penalty for Team Two.
     */
    public void displayPenaltyTeamTwo(int penaltyTeamTwo) {
        TextView scoreView = (TextView) findViewById(R.id.penaltyTeamTwo);
        scoreView.setText(String.valueOf(penaltyTeamTwo));
    }
}