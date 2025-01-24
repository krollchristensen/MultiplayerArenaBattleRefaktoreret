package org.example;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager {
    private List<String> players = new ArrayList<>();

    public void addPlayer(String player) {
        players.add(player);
        System.out.println(player + " has joined the game!");
    }

    public void removePlayer(String player) {
        players.remove(player);
        System.out.println(player + " has left the game.");
    }

    public List<String> getPlayers() {
        return players;
    }
}
