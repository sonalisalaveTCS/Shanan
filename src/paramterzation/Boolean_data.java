package paramterzation;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean_data {
	public static void main(String[] args)throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Documents\\sonali.xlsx");
		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		
		
	}

}
