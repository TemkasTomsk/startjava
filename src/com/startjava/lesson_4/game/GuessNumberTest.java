package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String next = "yes";
		System.out.println("Введите имя первого игрока: ");
		Player firstPlayer = new Player(scan.next());
		System.out.println("Введите имя второго игрока: ");
		Player secondPlayer = new Player(scan.next());
		
		GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

		while (next.equals("yes")) {	
			game.startGame();
			do {
				System.out.println("Хотите продолжить? [yes/no]: ");
				next = scan.next();
			} while (!next.equals("yes") && !next.equals("no"));
		}
	}
}