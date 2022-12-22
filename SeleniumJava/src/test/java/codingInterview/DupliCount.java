package codingInterview;

public class DupliCount {
	
	public static void main(String[] args) {
		 
        //Array declaration
        int arr[] = {2, 5, 3, 1, 8, 7, 5, 3,4,4};
        
       System.out.println("Duplicate elements are"); 
 
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
 
              //if value is equal 
              if(arr[i] == arr[j]) {
                 //print the duplicate element
            	  //System.out.println("Duplicates are :"+ arr[i]);
                System.out.println(arr[i]);
              }
          }
       }

	}
}
