package first.test;

public class ConExam {
	
	String studentName;
	int studentAge;
	//constructor
	ConExam(String name, int age){
	studentName = name;
	studentAge = age;
	}

	
	  void display(){ 
		  System.out.println(studentName+ " "+studentAge); }
	 
	public static void main(String args[])
	{
	ConExam cons = new ConExam("Imran" , 19);
	cons.display();
	}

}
