package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    private Player firstPlayer, secondPlayer;
    private int uknownNumber;
    private int attempt;
    private boolean isWin;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame() {
        initGame();
        for (attempt = 1; attempt <= 10; attempt++) {
            makeMove(firstPlayer);
            outLastAttempt(firstPlayer);
            if (isWin) {
                completeGame(firstPlayer);
                fillInputNumbers(firstPlayer);
                break;
            }
            makeMove(secondPlayer);
            outLastAttempt(secondPlayer);
            if (isWin) {
                completeGame(secondPlayer);
                fillInputNumbers(secondPlayer);
                break;
            }
        }
        if (!isWin) {
            attempt--;
            outInputNumber();
            fillInputNumbers();
        }
    }

    private void initGame() {
        uknownNumber = (int) (Math.random() * 101);
        isWin = false;
        System.out.println("Number = " + uknownNumber);
    }

    private void makeMove(Player player) {
        enterNumber(player);
        compareNumber(player);
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + " введите число:");
        player.setInputNumber(attempt, scan.nextInt());
    }

    private void compareNumber(Player player) {
        if (player.getInputNumber(attempt) > uknownNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер, введите снова: ");
        } else if (player.getInputNumber(attempt) < uknownNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер, введите снова: ");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + uknownNumber + " с " + attempt + " попытки");
            isWin = true;
        }
    }

    private void completeGame(Player player) {
        if (player == firstPlayer) {
            System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(firstPlayer.getAllNumbers(attempt), attempt)));
            System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(secondPlayer.getAllNumbers(attempt), attempt - 1)));
        } else {
            System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(firstPlayer.getAllNumbers(attempt), attempt)));
            System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(secondPlayer.getAllNumbers(attempt), attempt)));
        }
        fillInputNumbers(player);
    }

    private void outLastAttempt(Player player) {
        if (attempt == 10 && !isWin) {
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        }
    }

    private void outInputNumber() {
        System.out.println("Первый игрок ввел числа: " + Arrays.toString(Arrays.copyOf(firstPlayer.getAllNumbers(attempt), attempt)));
        System.out.println("Второй игрок ввел числа: " + Arrays.toString(Arrays.copyOf(secondPlayer.getAllNumbers(attempt), attempt)));
    }

    private void fillInputNumbers(Player player) {
        if (player == firstPlayer) {
            firstPlayer.fillInputNumbers(attempt);
            secondPlayer.fillInputNumbers(attempt - 1);
        } else {
            firstPlayer.fillInputNumbers(attempt);
            secondPlayer.fillInputNumbers(attempt);
        }
    }

    private void fillInputNumbers() {
        firstPlayer.fillInputNumbers(attempt);
        secondPlayer.fillInputNumbers(attempt);
    }
}
