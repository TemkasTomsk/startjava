public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setGender("Male");
		wolfOne.setNickName("Volner");
		wolfOne.setAge(11);
		wolfOne.setColor("grey");
		
		System.out.println("Пол волка = " + wolfOne.getGender());
		System.out.println("Кличка волка = " + wolfOne.getNickName());
		System.out.println("Возраст волка = " + wolfOne.getAge());
		System.out.println("Цвет волка = " + wolfOne.getColor());

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}