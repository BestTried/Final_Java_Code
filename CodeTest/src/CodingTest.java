
public class CodingTest {
	
	  public static void main(String[] args) {
	        CodingTest ct = new CodingTest();
	        String blogName = "java2blog";
	        String reverse = ct.CodeTest(blogName);
	        System.out.println("Reverse of java2blog is:" + reverse);
	    }
	 
		/*
		 * public String CodeTest(String orig) { if (orig.length() == 1) return orig;
		 * else return orig.charAt(orig.length() - 1) + CodeTest(orig.substring(0,
		 * orig.length() - 1));
		 * 
		 * }
		 */

}
