package TestNGAnnotation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	 
		// TODO Auto-generated method stub

		@Test(priority=2)
		@Parameters("Test")
		public void Test(String s )
		{
			System.out.println("I am Test1 : "+s);
		}
	@Test(priority=1)
	@Parameters("Test1")
	public void Test1(String s)
	{
		System.out.println("I am Test2 : "+s);
	}
	@Test
	public void Test2()
	{
		System.out.println("I am Test3");
	}
	

}
