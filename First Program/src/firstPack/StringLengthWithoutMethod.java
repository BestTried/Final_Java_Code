package firstPack;

public class StringLengthWithoutMethod {
	
	public static void main(String args[]){
		 
		  String str="This is hello world";
		  System.out.println("length of helloWorld string :"+xx(str));
		  }
		 
		public static int xx(String str){
		  int length=0;
		  char[] strCharArray=str.toCharArray();
		  for(char c:strCharArray){
		   length++;
		  }
		  return length;

		}
  }