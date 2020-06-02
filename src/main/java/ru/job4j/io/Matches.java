package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static char playerNo(boolean in) {
        return !in ? '1' : '2';
    }

    public static void main(String[] args) {
        System.out.println("Игра \"11\"\n"
                + "На столе 11 спичек. Двое игроков тянут по очереди от 1 до 3 спичек."
                + " Кто вытянет последние спички, тот выиграл.");
        System.out.println("Спичек: 11");
        int left = 11;
        boolean player = false;
        Scanner sc = new Scanner(System.in);
        byte answer;
        for (; left > 3;) {
            System.out.println("Ход игрока " + playerNo(player));
            answer = sc.nextByte();
            if (answer > 0 && answer < 4) {
                left -= answer;
                System.out.println("Спичек: " + left);
                player = !player;
            }
        }
        if (left < 4) {
            System.out.println("Игрок " + playerNo(player) + " выиграл!");
        }

    }
}
