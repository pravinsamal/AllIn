package inter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization {
	
	public static String  getdata(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\ALL jar\\data.xlsx");
		
		String value=WorkbookFactory.create(file).getSheet("data").getRow(row).getCell(cell).getStringCellValue();
	
		return value;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String qw=parametrization.getdata(0, 1);
		System.out.println(qw);
	}

}
