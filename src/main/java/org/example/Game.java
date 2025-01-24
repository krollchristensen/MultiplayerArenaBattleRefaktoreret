package org.example;

import java.util.List;

public class Game {
    private PlayerManager playerManager = new PlayerManager();
    private ScoreManager scoreManager = new ScoreManager();
    private Leaderboard leaderboard = new Leaderboard();
    private GameSaver gameSaver = new GameSaver();

    public void addPlayer(String player) {
        playerManager.addPlayer(player);
    }

    public void removePlayer(String player) {
        playerManager.removePlayer(player);
    }

    public void calculateScore(String action) {
        scoreManager.calculateScore(action);
    }

    public void displayLeaderboard() {
        List<String> players = playerManager.getPlayers();
        leaderboard.display(players);
    }

    public void saveGame() {
        gameSaver.saveGame(playerManager.getPlayers(), scoreManager.getScore());
    }

    public void loadGame() {
        gameSaver.loadGame(playerManager, scoreManager);
    }
}
