package overLoading;

public class MethodOverloading {
	
	//What is the constructor? //everGreen question 
	
	//How many types of constructor?
		
	//why we require the constructor? 	
	//whenever we create the constructor value will be invoke and implicitly.
	//constructor remove the null value by default.
		
	//What is the rules of the constructor?
		//1. Same as the class name 
	//2.constructor return nothing not even void
	//3.constructor overloading is possible but not overriding isn't possible 
	//4.constructor is two types
		//*4.1 parameter 
		//*4.2 non parameter
		
		
	//method and constructor overloading is possible 
	//method overriding is possible but constructor overriding isn't possible
		
		
		MethodOverloading(int age){
			System.out.println("Alam vai age is "+ age);
		}
		
	    MethodOverloading(String name){
			System.out.println(name);
		}
		
	    
	    
	    public static void main(String[] args) {
			
	    MethodOverloading obj = new MethodOverloading(34);
	    MethodOverloading obj1 = new MethodOverloading("abcdxyz");
	    	
	    	
		}
		
		

}
