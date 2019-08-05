public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		jaegerOne.setModelName("Gispy Danger");
		jaegerOne.setMark("Mark-6");
		jaegerOne.setCountry("USA");
		jaegerOne.setHeight(79.25f);
		jaegerOne.setWeight(1.980f);
		jaegerOne.setSpeed(7);
		jaegerOne.setArmor(6);

		System.out.println(jaegerOne.getModelName());
		System.out.println(jaegerOne.getMark());
		System.out.println(jaegerOne.getCountry());
		System.out.println(jaegerOne.getHeight());
		System.out.println(jaegerOne.getWeight());
		System.out.println(jaegerOne.getSpeed());
		System.out.println(jaegerOne.getArmor());

		jaegerOne.move();
		jaegerOne.drift();
		jaegerOne.scanKaiju();
		jaegerOne.useVortexCannon();
		System.out.println("");

		Jaeger jaegerTwo = new Jaeger();
		jaegerTwo.setModelName("Cherno Alpha");
		jaegerTwo.setMark("Mark-1");
		jaegerTwo.setCountry("RUSSIA");
		jaegerTwo.setHeight(85.34f);
		jaegerTwo.setWeight(2.412f);
		jaegerTwo.setSpeed(3);
		jaegerTwo.setArmor(10);

		System.out.println(jaegerTwo.getModelName());
		System.out.println(jaegerTwo.getMark());
		System.out.println(jaegerTwo.getCountry());
		System.out.println(jaegerTwo.getHeight());
		System.out.println(jaegerTwo.getWeight());
		System.out.println(jaegerTwo.getSpeed());
		System.out.println(jaegerTwo.getArmor());

		jaegerTwo.move();
		jaegerTwo.drift();
		jaegerTwo.scanKaiju();
		jaegerTwo.useVortexCannon();
	}
}