import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String next = "yes";
		GuessNumber game = new GuessNumber(); 

		while (next.equals("yes")) {	
			game.startGame();
			do {
				System.out.println("Хотите продолжить? [yes/no]: ");
				next = scan.next();
			} while (!next.equals("yes") && !next.equals("no"));
		}
	}
}