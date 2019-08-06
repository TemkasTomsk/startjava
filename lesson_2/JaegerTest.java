public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaegerGispyDanger = new Jaeger("Gispy Danger", "Mark-6", "USA", 79.25f, 1.980f, 7, 6);

		System.out.println(jaegerGispyDanger.getModelName());
		System.out.println(jaegerGispyDanger.getMark());
		System.out.println(jaegerGispyDanger.getCountry());
		System.out.println(jaegerGispyDanger.getHeight());
		System.out.println(jaegerGispyDanger.getWeight());
		System.out.println(jaegerGispyDanger.getSpeed());
		System.out.println(jaegerGispyDanger.getArmor());

		jaegerGispyDanger.move();
		jaegerGispyDanger.drift();
		jaegerGispyDanger.scanKaiju();
		jaegerGispyDanger.useVortexCannon();
		System.out.println("");

		Jaeger jaegerChernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "RUSSIA", 85.34f, 2.412f, 3, 10);

		System.out.println(jaegerChernoAlpha.getModelName());
		System.out.println(jaegerChernoAlpha.getMark());
		System.out.println(jaegerChernoAlpha.getCountry());
		System.out.println(jaegerChernoAlpha.getHeight());
		System.out.println(jaegerChernoAlpha.getWeight());
		System.out.println(jaegerChernoAlpha.getSpeed());
		System.out.println(jaegerChernoAlpha.getArmor());

		jaegerChernoAlpha.move();
		jaegerChernoAlpha.drift();
		jaegerChernoAlpha.scanKaiju();
		jaegerChernoAlpha.useVortexCannon();
	}
}