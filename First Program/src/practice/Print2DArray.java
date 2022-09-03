package practice;

public class Print2DArray {
	public static void main(String args[]) {
    int rows = 3, cols = 3;
    int arr[][] = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90} };
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print("\t" + arr[i][j]);
      }
    }
  }

}
