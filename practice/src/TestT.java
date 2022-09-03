

public class TestT {

	
	public static void main(String[] args) {
		TestT obj = new TestT();
     //obj.grade();
		int studentGrade =obj.grade(90,80);
		System.out.println(studentGrade);
		//System.out.println(english+math);
	}
     public int grade(int english,int math) {
    	 return math+english;
     }
}