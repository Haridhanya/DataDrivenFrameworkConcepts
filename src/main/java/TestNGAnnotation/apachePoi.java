package TestNGAnnotation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class apachePoi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\Hari\\eclipse-workspace\\dataDrivenTesting\\src\\main\\resources\\apachePoiTest.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(file);
        //from workbook get the sheet
       XSSFSheet sh=wb.getSheetAt(0);
       //from sheet get the rows and column through iterator interface
       Iterator it=sh.rowIterator();//iterator through rows
       while(it.hasNext())
       {
    	   XSSFRow row=(XSSFRow) it.next();
    	   Iterator cellit=row.cellIterator();
    	   while(cellit.hasNext())
    	   {
    		   XSSFCell cell=(XSSFCell) cellit.next();
    		   System.out.print(cell.toString());
    		   System.out.print("|");
    	   }
    	  System.out.println("\n");
       }
		
	}

}
