package over_ride;

public class Cat extends Animal{
	
	
	
	@Override
		public void voice() {
		System.out.println("I am the Cat");
		
			super.voice();
		}
	
public static void main(String[] args) {
	

	Cat cat = new Cat();
	System.out.println(cat.sound= "meow");
	//cat.sound= "meow";
	cat.voice();
	
}
}
