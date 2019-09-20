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

    public void setInputNumbers(int index, int number) {
        this.inputNumbers[index - 1] = number;
    }

    public int getInputNumbers(int attempt) {
        return inputNumbers[attempt - 1];
    }

    public int[] getCopyInputNumbers(int attempt) {
        return Arrays.copyOf(inputNumbers, attempt);
    }

    public void fillInputNumbers(int attempt) {
        Arrays.fill(inputNumbers, 0, attempt, 0);
    }
}