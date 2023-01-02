package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\PopulationExample.xlsx");
	
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("sheet1");
		
	//	Row row=sheet.getRow(3);
	//	Cell cel=row.getCell(0);
	//    String data=cel.getStringCellValue();
	//	System.out.println(data);
	//    wb.close();
	    
	    
	    
	    
	    /////USING FOR LOOP////
		
		
	  /*  
	       int rows=sheet.getLastRowNum();
	       int cols=sheet.getRow(0).getLastCellNum();
	       
	       for(int r=0;r<rows;r++)
	       {
	    	   Row row=sheet.getRow(r);
	    	   
	    	   for(int c=0;c<cols;c++)
	    	   {
	    		   Cell cell=row.getCell(c);
	    		   switch(cell.getCellType())
	    		   {
	    		   case STRING:System.out.print(cell.getStringCellValue());break;
	    		   case NUMERIC:System.out.print(cell.getNumericCellValue());break;
	    		   case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
	                }
	    		   System.out.print(" | "); //this will divide the data by |
	    		   
	    	   }
	    	   
	    	   System.out.println(); // it will print data in new line 
	       }
	       
	       */
	       
	       
	       
	       ////	USING ITERATOR //////
	       
	       
	       
	       
    Iterator     iterator=sheet.iterator() ; // we have to import it from java.util package very imp otherwise we get error
	       
	    while(iterator.hasNext())
	    {
	    	Row row=(Row) iterator.next();
	    	Iterator cellIterator=row.cellIterator();
	   
	    	while(cellIterator.hasNext())
	    	{
	    		 Cell cell= (Cell) cellIterator.next();
	    		 switch(cell.getCellType())
	    		   {
	    		   case STRING:System.out.print(cell.getStringCellValue());break; // break is imp 
	    		   case NUMERIC:System.out.print(cell.getNumericCellValue());break;
	    		   case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
	                }
	  		   System.out.print(" | ");  //this will provide space to the data by |
	    	
	    	}
	    
	    
			   System.out.println(); 
	    
	    
	    
	    
	    }
	   
    
    
    
    
    
    
    
    wb.close();
	    
	    
	    
	    
	    
	}

}
