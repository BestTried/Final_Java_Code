package arrays;

public class Dup_Count {
	
	public static void main(String[] args) {
        int[] xyz = {1, 2, 5, 5, 6, 6, 7, 2};
 
        for (int i = 0; i <xyz.length-1; i++){
            for (int j = i+1; j < xyz.length; j++){
                if ((xyz[i] == xyz[j]) && (i != j)){
                    System.out.println("Duplicate Element : "+xyz[j]);
                }
            }
        }
    }   

}
