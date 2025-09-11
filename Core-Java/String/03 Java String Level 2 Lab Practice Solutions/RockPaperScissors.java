
// Write a program to play Rock-Paper-Scissors between a user and computer

import java.util.Scanner;

class RockPaperScissors {
    public static String computerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "rock";
        else if (n == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int userWins = 0, compWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("Enter rock, paper, or scissors: ");
            String user = sc.next();
            String comp = computerChoice();
            String winner = findWinner(user, comp);
            System.out.println("Computer chose: " + comp + " -> Winner: " + winner);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }
        System.out.println("User wins: " + userWins);
        System.out.println("Computer wins: " + compWins);
    }
}
