package utils;

public class ExcelDataProvider {
    public static void main(String[] args) {
        String excelPath = "C:\\Users\\AshaWaghadure\\IdeaProjects\\SaleniumFramework\\Excel\\data.xlsx";
        testData(excelPath,"Sheet1");
    }
    public  static void testData(String excelPath, String sheetName) {

        ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
        int rowCount = ExcelUtils.getRowCount();
        int colCount = ExcelUtils.getColCount();
        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
               String cellData= ExcelUtils.getCellDataString(i,j);
               //double cellData1=ExcelUtils.getCellDataNumber(i,j);
            }
        }
    }
}
