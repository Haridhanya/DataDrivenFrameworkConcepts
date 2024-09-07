package TestNGAnnotation;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLTest {
		
	Object[][] data=null;
	
	@DataProvider(name="test")
	public Object[] datap() throws BiffException, IOException
	{
		data=getdata();
		return data;
		
	}
	
	
	@Test(dataProvider="test")
	public void data(String name,int age,String from) 
	{
		
		System.out.println(name+" "+age+" "+from);
	}
	
	public Object[][] getdata() throws BiffException, IOException
	{
	FileInputStream excel=new FileInputStream("C:\\Users\\Hari\\eclipse-workspace\\dataDrivenTesting\\src\\main\\resources\\JXLInputFile.xls");
	Workbook workbook=Workbook.getWorkbook(excel);
	Sheet sheet=workbook.getSheet(0);
	int rowCount=sheet.getRows();
	int ColumnCount=sheet.getColumns();
	Object[][] info=new Object[rowCount-1][ColumnCount];
	
	for(int i=1;i<rowCount;i++)
	{
		for(int j=0;j<ColumnCount;j++)
		{
			info[i=1][j]=sheet.getCell(j, i).getContents();
		}
	}
	return info;
	
	
	
	}
		
	}


