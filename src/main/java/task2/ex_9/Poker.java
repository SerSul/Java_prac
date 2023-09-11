package task2.ex_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine();


        List<String> deck = createDeck();

        Collections.shuffle(deck);


        int cardsPerPlayer = 5;
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("\nИгрок " + (i + 1) + ":");
            for (int j = 0; j < cardsPerPlayer; j++) {
                if (!deck.isEmpty()) {
                    String card = deck.remove(0);
                    System.out.println(card);
                } else {
                    System.out.println("Колода закончилась.");
                    break;
                }
            }
        }
    }


    public static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Пики", "Черви", "Бубны", "Крести"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                String card = rank + " " + suit;
                deck.add(card);
            }
        }

        return deck;
    }
}
