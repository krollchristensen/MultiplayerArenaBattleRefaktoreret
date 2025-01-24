package org.example;

import java.util.List;

public class Leaderboard {
    public void display(List<String> players) {
        System.out.println("Leaderboard:");
        for (String player : players) {
            System.out.println("- " + player);
        }
    }
}
