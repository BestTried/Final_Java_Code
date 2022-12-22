package home.work.sel;

public class ClassB extends ClassA {
	
	public void getJob() {
		System.out.println("I will always miss batch 27.");
	}
	
	
	public static void main(String[] args) {
		//we always create the current class/child class object.
		//Because we need both class properties.
		ClassB obj = new ClassB();
		obj.getJob();
		obj.getName();
		//Now, If I create parent class object with the help of child class, 
		//then we get only parent class properties.
		ClassA obj1 = new ClassB();
		obj1.getName();
		//If, I try to use child class to Parent class, then we are getting compile error.
		ClassB obj2 = (ClassB) new ClassA();
		obj2.getJob();
		
		
	}

}
