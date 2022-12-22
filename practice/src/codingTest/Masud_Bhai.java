package codingTest;

import java.util.Arrays;

public class Masud_Bhai {
	
	
		
		public static void removeDuplicate() {

			int[] duplicate = {20, 33, 33, 30, 20,30};

			int[] temp = new int[duplicate.length];

			//int j = 0;
			
			

			if(duplicate.length == 1 || duplicate.length==0) {

				System.out.println(duplicate.length);

			} else if (duplicate.length == 2) {

				if (duplicate[0] == duplicate[1]) {
					temp[0] = duplicate[0];
				} else {
					temp = duplicate;
				}

			}

			
			  Arrays.sort(duplicate, 0, duplicate.length);
			  
			  
			  
			  for(int i=0; i<duplicate.length-1; i++)
			  
			  if(duplicate[i]!=duplicate[i+1])
			  
			  temp[j++]=duplicate[i]; 
			  
			  if(duplicate.length!=0)
			  temp[j]=duplicate[duplicate.length-1];
			 
			for(int i:temp) {
				System.out.print(i +" ");
			}

		
		
	}
	
		public static void main(String[] args) {
			
			removeDuplicate();
		}

}
