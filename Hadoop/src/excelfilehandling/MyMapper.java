package excelfilehandling;

// poi-3.9.jar has to be added in the path for this program to work.
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class MyMapper extends Mapper<Text, BytesWritable, Text, Text>{

    public void map(Text key, BytesWritable value, Context context) throws IOException,InterruptedException {
    
    	///excel/work1.xls  101010 
    	
    	// To understand all the things below, we need to read the POI library's
    	 // API documentation........
    	
    	// High level representation of the workbook. This is the first object most 
    	 // users will construct whether they are reading or writing a workbook.
    	// It is also the top level object for creating a new sheet/etc.
    	HSSFWorkbook workbook = new HSSFWorkbook(new ByteArrayInputStream(value.getBytes()));
    	
    	// get the HSSFSheet object at the given index...
    	HSSFSheet sheet = workbook.getSheetAt(0);
    	
    	Iterator<Row> rowIterator = sheet.iterator();
    	while (rowIterator.hasNext()) {
			Row row = rowIterator.next();        				
			Cell currentcell = row.getCell(0);
			String CellValue = currentcell.getStringCellValue();
			context.write(key, new Text(CellValue));
		}
    	
    }

}
