package practice;

public class Box {
	
	int width;
	int height;
	int depth ;
	
	public void setData (int width, int height, int depth) {
		
		this.width  = width;
		this.height = height;
		this.depth  = depth;
	}
	
	public void printBox() {
		System.out.println("Width = " + width + " , Height =" + height + ", Depth = " + depth + " , Volume =" + volume()) ;
	}
	
	public int  volume () {
		
		return width  * height * depth;
	}

}
