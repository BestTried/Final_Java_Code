package examPractice;

public class If_Else_Con {

	public static void main(String[] args) {

		int grade = 50;
		if (grade >= 90 && grade <= 100) {
			System.out.println("Your grade is :" + "A");
		}
		else if (grade >= 80 && grade <= 89) {
			System.out.println("Your grade is :" + "B");
		}
		else if (grade >= 70 && grade <= 79) {
			System.out.println("Your grade is :" + "C");
		}
		else if (grade >= 60 && grade <= 69) {
			System.out.println("Your grade is :" + "D");
		}
		else if (grade <60) {
			System.out.println("Your grade is :" + "F");
		}
		else {

		}
	}
}