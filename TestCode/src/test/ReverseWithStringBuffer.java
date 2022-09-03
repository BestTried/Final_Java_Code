package test;

public class ReverseWithStringBuffer {

	
	public static void main(String[] args){
        String str = "BAngladesh";
 
        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);
    }
}
