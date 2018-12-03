package com.retro.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.retro.controller.UserController;
import com.retro.dto.UserDto;
import com.retro.service.UserService;

public class WriteToExcel extends UserController {
	List<UserDto> userDt = new LinkedList<>();
	Cell cell;
	public void fetchdata(UserService userService)

	{
		userDt.addAll(userService.getAllUsers());
		System.out.println(userDt.get(1).getUserName());
		try {
			ExcelWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
@SuppressWarnings("deprecation")
public void ExcelWriter() throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\gaurkapoor\\Desktop\\Test.xlsx");
	 @SuppressWarnings("resource")
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	 
	 XSSFSheet sheet = workbook.getSheet("TestData");
	for(int i=0;i<userDt.size();i++) {
	 if(i==0) {
		 Row row = sheet.createRow(i);
		  cell = row.createCell(0);
		
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 cell.setCellValue("what is fine"); 
		  cell = row.createCell(1);
			
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 cell.setCellValue("What went well"); 
		
		 cell = row.createCell(2);
			
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 cell.setCellValue("what went wrong"); 
		 
	 }
	 else if(i>0) {
		 Row row = sheet.createRow(i);
		  cell = row.createCell(0);
		
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 cell.setCellValue(userDt.get(i).getUserName()); 
		  cell = row.createCell(1);
			
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 cell.setCellValue(userDt.get(i).getWhatWentWell()); 
		
		 cell = row.createCell(2);
			
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 cell.setCellValue(userDt.get(i).getWhatWentWrong()); 
	 }
	}
	                
	 FileOutputStream fos = new FileOutputStream("C:\\Users\\gaurkapoor\\Desktop\\Test.xlsx");
	 workbook.write(fos);
	 fos.close();
	 System.out.println("END OF WRITING DATA IN EXCEL");
}
}
