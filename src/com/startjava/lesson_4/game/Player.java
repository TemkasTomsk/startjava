package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] inputNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setInputNumber(int index, int number) {
        inputNumbers[index - 1] = number;
    }

    public int getInputNumber(int attempt) {
        return inputNumbers[attempt - 1];
    }

    public int[] getAllNumbers(int attempt) {
        return Arrays.copyOf(inputNumbers, attempt);
    }

    public void fillInputNumbers(int attempt) {
        Arrays.fill(inputNumbers, 0, attempt, 0);
    }
}