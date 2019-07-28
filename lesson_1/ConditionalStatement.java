public class ConditionalStatement {
	public static void main(String[] args) {
		int youAge = 32;
		if(youAge > 20) {
			System.out.println("Старше");
		}	
		boolean youMale = true;
		if(youMale) {
			System.out.println("Yes Male");
		}	
		boolean youFemale = true;
		if(youFemale) {
		 	System.out.println("No Female");	
		}
		float youHeight = 1.88f;
		if(youHeight < 1.80) {
			System.out.println("Мой рост меньше 1.88");
		} else {
			System.out.println("Мой рост больше 1.88");
		}
		char youFirstLetterNameM = '\u004D';
		char youFirstLetterNameI = '\u0049';
		if(youFirstLetterNameM == '\u004D') {
			System.out.println("No letter M ");
		} else if(youFirstLetterNameI == '\u0049') {
			System.out.println("No letter I");
		} else {
			System.out.println("My name starts with letter A");
		}
	}
}