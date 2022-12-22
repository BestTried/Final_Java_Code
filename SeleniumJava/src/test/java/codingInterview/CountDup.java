package codingInterview;

public class CountDup {
public static void main(String[] args) {
		
		int i = 0, j, dupCount = 0;
		int[] DupcountArr = {10, 10, 15, 25, 10, 8, 12, 10, 15, 55, 10, 60};
		
		while(i < DupcountArr.length) {
			j = i + 1;
			while(j < DupcountArr.length){		
				if(DupcountArr[i] == DupcountArr[j]) {
					dupCount++;
					break;
				}
				j++;
			}
			i++;
		}
		System.out.println("The Total Number of Duplicates  = " + dupCount);
	}

}
