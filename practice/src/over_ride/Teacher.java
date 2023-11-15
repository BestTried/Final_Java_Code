package over_ride;

public class Teacher extends Person {
	
	String qualification;
	
	@Override
	void displayInformation() {
	

		super.displayInformation();
		System.out.println("I am in eacher Class");
	}
	
	public static void main(String[] args) {
	    Teacher  teach = new Teacher();
	    
	    //teach.displayInformation();
	    teach.name = "Hamidul Islam";
	    teach.age = 55;
	    teach.qualification = "MS In ISWR";
	    teach.displayInformation();
	    teach.qualification= "BS";
	}
	
	
	
}
