package org.example;

public class Main {
    public static void main(String[] args) {
        // Opret et nyt spil
        Game game = new Game();

        // Tilføj spillere
        game.addPlayer("Player1");
        game.addPlayer("Player2");
        game.addPlayer("Player3");

        // Udfør handlinger og beregn score
        game.calculateScore("kill");
        game.calculateScore("assist");
        game.calculateScore("death");

        // Vis leaderboard
        game.displayLeaderboard();

        // Gem spillet
        System.out.println("\n--- Gemmer spil ---");
        game.saveGame();

        // Fjern en spiller
        game.removePlayer("Player3");

        // Indlæs spillet igen
        System.out.println("\n--- Indlæser spil ---");
        game.loadGame();

        // Vis leaderboard igen efter indlæsning
        game.displayLeaderboard();
    }
}
