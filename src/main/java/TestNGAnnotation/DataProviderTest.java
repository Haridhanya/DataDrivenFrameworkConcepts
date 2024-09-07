package TestNGAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {


	//String[][] data= {{"hello","hari"},{"hari","you are awesome"}};
	
	@DataProvider(name="datap")
	public Object[][] test()
	{
		return new Object[][] 
			{{"hello","hari","dhanya",16},
			{"hari","you are awesome","nice",0}};
	}
	@Test(dataProvider="datap")
	public void fun(String s,String t,String a,int b)
	{
		System.out.println(s+" "+t+" "+a+" "+b);
	}
			     
	}


