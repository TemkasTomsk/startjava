public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 32;
		if(age > 20) {
			System.out.println("Старше");
		}

		boolean isMale = true;
		if(isMale) {
			System.out.println("Да, я мужского пола!");
		}

		if(!isMale) {
		 	System.out.println("Нет, я не женского пола!");	
		}

		float height = 1.88f;
		if(height < 1.80) {
			System.out.println("Мой рост меньше 1.80");
		} else {
			System.out.println("Мой рост больше 1.80");
		}

		char firstLetterName = 'А';
		if(firstLetterName == 'М') {
			System.out.println("Нет, не с буквы M ");
		} else if(firstLetterName == 'И') {
			System.out.println("Нет, не с буквы И");
		} else {
			System.out.println("Мое имя начинается с буквы A");
		}
	}
}