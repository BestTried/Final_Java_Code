package overLoading;

public class Dog extends Animal {
	
	public void eat()   //eat() method overridden by Dog class.
    {
        System.out.println("Dog like to eat meat");
    }
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }

}
