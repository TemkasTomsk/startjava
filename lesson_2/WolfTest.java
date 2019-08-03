public class WolfTest {
	public static void main(String[] args) {

		Wolf wolfOne = new Wolf();
		wolfOne.gender = "Male";
		wolfOne.nickName = "Volner";
		wolfOne.age = 10;
		wolfOne.color = "grey";
		
		System.out.println("Пол волка = " + wolfOne.gender);
		System.out.println("Кличка волка = " + wolfOne.nickName);
		System.out.println("Возраст волка = " + wolfOne.age);
		System.out.println("Цвет волка = " + wolfOne.color);
		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}