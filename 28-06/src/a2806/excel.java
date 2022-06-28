package a2806;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class excel {
	public static String  xl() throws EncryptedDocumentException, IOException {
	
	
	FileInputStream file=new FileInputStream("E:\\ALL jar\\data.xlsx");
	
	String value=WorkbookFactory.create(file).getSheet("userdata").getRow(0).getCell(1).getStringCellValue();
	
	return value;
	
	}

}
