package abstraction;

public abstract class AbstractTest {
	
	/*
	 Abstract method could be 0 to 100 percent in the abstract class
	 
	 How to create the abstract method in the abstract class?
	 
	 access modifier (abstract)KEYWORD (return type or void) method name and closing with the 
	 semi-colon ;
	 
	 When we create an abstract method that time we can't create an object for that abstract class.
	  
	  In order to complete this Abstract class we need an another class. 
	  
	 */



	public abstract void getEmploymentInformation(); //Incomplete method or abstract method 

	public void getName() { //complete method or concrete method

		System.out.println("Complete Method");
	}

}
