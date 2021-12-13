package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.io.File;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dummy {
	public static void main(String[] args) {
		String[][] sheetData;
		try {
			sheetData = ReadDataColumns(6, new String[] { "username", "password", "role", "skill" });// index starts with 0
																								// .Delete blanks
			String[] username = sheetData[0];
			String[] password = sheetData[1];
			String[] role = sheetData[2];
			String[] skill = sheetData[3];
			
			
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String[][] ReadDataColumns(int start, String[] aCols) throws Exception {
		
		String workBook = "D:\\ResurrectionJavaAug\\Resurrection_MyFrameWork2Dec2021\\src\\test\\java\\Data\\POIWORK.xlsx";
		String sheetName = "Sheet1";
		String[][] data = new String[aCols.length][];
		boolean found = false;
		Workbook wb = null;
		
		try {
			wb = WorkbookFactory.create(new File(workBook));
		} catch (Exception ex) {
			throw new Exception("Problem while reading in WorkBookFactory Method ");
		}
		Sheet sh1 = wb.getSheet(sheetName);
		if (String.valueOf(sh1) == null) {
			throw new Exception("Problem while reading sheet=>" + sheetName);
		}
		int ifirstRowNum = sh1.getFirstRowNum();// 0 based index. -1 if no row
		int iLastRowNum = sh1.getLastRowNum();// 0 based index. -1 if no row

		// Example. If first row is index 6.. then start=6
		// lastrow=8 then data is in 6,7,8
		// count of data=3 8-6+1 array should be of this size

		if (start != 0) {
			ifirstRowNum = start;
		}
		for (int iCol = 0; iCol < aCols.length; iCol++) {
			String[] tempData = new String[iLastRowNum + 1 - ifirstRowNum];
			int i = 0;
			Iterator<Cell> cells = sh1.getRow(ifirstRowNum).cellIterator();

			while (cells.hasNext()) {
				Cell cell = cells.next();
				String tempcolName = cell.getStringCellValue().trim();
				System.out.println(tempcolName);
				if (String.valueOf(tempcolName).trim().equals(aCols[iCol].trim())) {
					found = true;
					break;
				}
				i++;
			}
			if (found) {
				for (int realdata = ifirstRowNum, col = 0; realdata <= iLastRowNum; realdata++, col++) {

					System.out.println("Printing realdata" + realdata + " i=>" + i);
					String sDataweneed = sh1.getRow(realdata).getCell(i).getStringCellValue();
					System.out.println(sDataweneed);
					tempData[col] = sDataweneed;
				}
			} else {
				throw new Exception(aCols[iCol] + " not found in Worbook ");
			}
			data[iCol] = tempData;
		}
		wb.close();
		return data;
	}
}
