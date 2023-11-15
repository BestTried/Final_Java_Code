
public class Rectangle implements Polygon{
	
	public void getArea(int length,int breath) {
		System.out.println("The area of the rectangle is:  " + length * breath);
		
	}
	
	public static void main(String[] args) {
		Rectangle  rec = new Rectangle();
		rec.getArea(5, 6);
	}

}
