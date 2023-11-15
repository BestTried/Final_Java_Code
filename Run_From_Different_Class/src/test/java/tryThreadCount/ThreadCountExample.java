package tryThreadCount;

import org.testng.annotations.Test;

public class ThreadCountExample {
	@Test 
	public void test1() {
		System.out.println("This thread is : "+ Thread.currentThread().getId());
	}
	@Test
	public void test2() {
		System.out.println("This thread is : "+ Thread.currentThread().getId());
	}
	@Test
	public void test3() {
		System.out.println("This thread is : "+ Thread.currentThread().getId());

		
	}
	
	@Test
	public void test4() {
		System.out.println("This thread is : "+ Thread.currentThread().getId());

		
	}
	
	@Test
	public void test5() {
		System.out.println("This thread is : "+ Thread.currentThread().getId());

		
	}
	@Test
	public void test6() {
		System.out.println("This thread is : "+ Thread.currentThread().getId());

		
	}

}
