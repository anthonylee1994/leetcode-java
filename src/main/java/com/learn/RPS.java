package com.learn;

/**
 * @author anthonylee
 */
public class RPS {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else if (p1.equals("rock") && p2.equals("scissors") || p1.equals("paper") && p2.equals("rock") || p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        }
        return "Player 2 won!";
    }

    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors")); // Player 1 won!
        System.out.println(rps("scissors", "paper")); // Player 1 won!
        System.out.println(rps("paper", "rock")); // Player 1 won!
        System.out.println(rps("rock", "rock")); // Draw!
        System.out.println(rps("scissors", "scissors")); // Draw!
        System.out.println(rps("paper", "paper")); // Draw!
        System.out.println(rps("scissors", "rock")); // Player 2 won!
        System.out.println(rps("paper", "scissors")); // Player 2 won!
        System.out.println(rps("rock", "paper")); // Player 2 won!
    }
}
