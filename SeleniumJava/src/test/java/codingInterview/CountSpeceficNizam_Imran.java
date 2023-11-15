package codingInterview;

public class CountSpeceficNizam_Imran {

	
public static void main(String[] args) {
		
		String copaSamsu ="Tennessee";
	int oldlenth=copaSamsu.length();
	//System.out.println( oldlenth);
	
	String sid=copaSamsu.replace("e", "");
	
	int newLenth=sid.length();
	//System.out.println(newLenth);
	int result=oldlenth-newLenth;
	System.out.println("e="+result);
	}
}
