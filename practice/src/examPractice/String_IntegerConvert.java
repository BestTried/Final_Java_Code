package examPractice;

public class String_IntegerConvert {
	
	public static void main(String[] args) {
        String str1 = "5";
        int result = Integer.parseInt(str1);
        System.out.println(result);
 
        String str2 = "5";
        Integer result2 = Integer.valueOf(str2);
        System.out.println(result2);
    }

}
