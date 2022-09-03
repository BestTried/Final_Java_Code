package test;

import java.util.Iterator;

public class RemoveDupEleFromAray {

	public static void main(String[] args) {
	
	
		int [] a = {1,1,12,3,3,3,4,5,6,6,6,7,8,9,10,11,11};	
		removeDuplicates(a);
	}
		private static void removeDuplicates (int[]a) {
			
			
			int i=1, j=0;
			
			for(i=1; i <a.length; i++) {
				if(a[i]!= a[i-1]){
					a[++j] = a[i];
					
				}
				
			}
			for(i=0;i<= j; i++) {
				System.out.print(a[i] +"  ");
				
			}
		}
}
