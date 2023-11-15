package examPractice;

public class If_Else {
	
	//Make a program that help you to take your decision
	//weather you are going to use : car, Uber,  subway,  Bus 
	//Or stay at home.

	public static void main(String[] args) {

		String vehicle =  "";
		if (vehicle == "car") {
			System.out.println("You can go to Manhattan in $50");
			}
		else if (vehicle == "uber") {
			System.out.println("You can go to Manhattan in $40");
			}
		else if (vehicle == "Subway") {
			System.out.println("You can go to Manhattan in $25");
			}
		else if (vehicle == "Bus") {
			System.out.println("You can go to Manhattan in $30");
			}
		else {
			System.out.println("Stay  at home");
			}
		}

}
