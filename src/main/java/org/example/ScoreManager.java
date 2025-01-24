package org.example;

public class ScoreManager {
    private int score = 0;

    public void calculateScore(String action) {
        if (action.equals("kill")) {
            score += 10;
        } else if (action.equals("assist")) {
            score += 5;
        } else if (action.equals("death")) {
            score -= 5;
        }
        System.out.println("Score updated: " + score);
    }

    public int getScore() {
        return score;
    }
}
