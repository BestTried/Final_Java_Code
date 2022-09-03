package test;

public class RemoveWhiteSpaceFinal {
	
	public static void main(String[] args){
        String str = "      Bangladesh   is     our Home     Country        ";
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
    }

}
