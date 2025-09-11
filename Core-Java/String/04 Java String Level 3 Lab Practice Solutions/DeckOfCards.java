// Write a program to create a deck of cards, shuffle the deck, and distribute to players

import java.util.Scanner;

class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static void distribute(String[] deck, int players, int cardsEach) {
        if (players * cardsEach > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return;
        }
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i+1) + ":");
            for (int j = 0; j < cardsEach; j++) {
                System.out.println("  " + deck[i*cardsEach + j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cards = sc.nextInt();
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        distribute(deck, players, cards);
    }
}
