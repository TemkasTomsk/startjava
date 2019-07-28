public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		int i = 6;
		while(i >= -6) {
			System.out.println(i);
			i-=2;
		}
		int a = 10;
		int sum = 0;
		do {
			if(a % 2 == 1) {
				System.out.println(a);
				sum = sum + a;
			}
			a++;
		} while(a < 20);
		System.out.println("11 + 13 + 15 + 17 +19 = " + sum);
	}
}