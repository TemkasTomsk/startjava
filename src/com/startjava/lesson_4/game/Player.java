package com.startjava.lesson_4.game;

public class Player {

	private String name;
	private int[] num = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int number, int index) {
		this.num[index] = number;
	}

	public int[] setNumber() {
		return this.num;
	}
}