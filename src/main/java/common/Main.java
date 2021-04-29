package common;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        try {
            //Workbook
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Hello");
            String[] columnHeads = {"namn", "age"};

            Row headerRow = spreadsheet.createRow(0);

            for (int i = 0; i < columnHeads.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columnHeads[i]);

            }

            ArrayList<Competitor> a = createData();
            int rownum = 1;
            for (Competitor i : a) {
                Row row = spreadsheet.createRow(rownum++);
                row.createCell(0).setCellValue(i.namn);
                row.createCell(1).setCellValue(i.age);
            }
            for (int i = 0; i < columnHeads.length; i++) {
                spreadsheet.autoSizeColumn(i);
            }
            FileOutputStream fileOut = new FileOutputStream(new File("C:hej.xlsx"));
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Excel file created");


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static ArrayList<Competitor> createData() {
        ArrayList<Competitor> a = new ArrayList();
        a.add(new Competitor("Hanna", 25));
        a.add(new Competitor("Mahdi", 35));


        return a;
    }


    























        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Enter personnummer");
        int personnummer = scan.nextInt();
        System.out.println("Enter City");
        String city = scan.nextLine();

        System.out.print(firstName +"\t" + lastName +"\t" + personnummer +"\t   " + city);
*/


}

