package org.example;

import java.util.List;

public class GameSaver {
    public void saveGame(List<String> players, int score) {
        System.out.println("Saving game...");
        System.out.println("Players: " + players);
        System.out.println("Score: " + score);
        System.out.println("Game saved!");
    }

    public void loadGame(PlayerManager playerManager, ScoreManager scoreManager) {
        System.out.println("Loading game...");
        playerManager.addPlayer("Player1");
        playerManager.addPlayer("Player2");
        scoreManager.calculateScore("kill"); // Eksempel på forudindstillet score
        System.out.println("Game loaded!");
    }
}
