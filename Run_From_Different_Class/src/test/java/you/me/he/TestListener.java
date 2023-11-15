package you.me.he;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(you.me.he.EmpListener.class)


public class TestListener {
	
	@Test
	public void testSuccess() {
		System.out.println("This is my success scenario test");
	}
	@Test
	public void testFailure() {
		System.out.println("This is my failure scenario test");
		Assert.assertTrue(false);
	}
	@Test
	public void testSkipped() {
		throw new SkipException("This test is skipped");
	}
}
