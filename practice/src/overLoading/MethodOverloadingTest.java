package overLoading;

public class MethodOverloadingTest {// //compile time , static binding 
	
	//same method name using again again changing the parameters or
	//the change the position of the parameter and finish with in the class.
	
	public void getEmployeeInfo(long type) {
		System.out.println("EM info" + type);
	}
	
    public void getEmployeeInfo(char name) { 
		System.out.println("Employee name: "+ name);
	}
    
    public void getEmployeeInfo(int age) {
		System.out.println("Employee age " + age);
    	
	}
    
    public void getEmployeeInfo(int age, String name) {//adding additional 
		
	}
	
    public void getEmployeeInfo(String name, int age) { //changing the position
		
	}
    
    public static void main(String[] args) {
		
    	MethodOverloadingTest obj = new MethodOverloadingTest();
    	obj.getEmployeeInfo(25);
    	obj.getEmployeeInfo('a');
    	obj.getEmployeeInfo(100);
    	
    	
	}
    

}
