package coding_practice_with34_Batch;

import org.testng.annotations.Test;

public class Test_NG_Test {
	@Test(threadPoolSize = 4, invocationCount = 4, timeOut = 1000)
	public void testMethod() {
		System.out.println("Thread ID Is : " + Thread.currentThread().getId());
	}

}
