package codingTestFromTeacher;

public class SecondHighestNumber {
	
	public int findSecondHighest(int[] a){
        int temp;
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[a.length - 2];
    }

    public static void main(String[] args){
    	SecondHighestNumber array = new SecondHighestNumber();
        int a[]={4,7,55,16,33,27};
        System.out.println("Second highest number in given array is" + array.findSecondHighest(a));
    }

}
