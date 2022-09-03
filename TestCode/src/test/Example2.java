package test;

public class Example2 extends Example1{
	
	
		void show(){
		System.out.println("method2");
		}
		
		public static void main(String args[]){
			Example1 a= new Example1();
			a.show(); //method1
			
			
			  Example2 b= new Example2(); 
			  b.show(); //method2
			 		}

}


