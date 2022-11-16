package utils;

public class ExcelUtilsDemo {
    public static void main(String[] args) {
       String projectPath = System.getProperty("user.dir");
        ExcelUtils excel=new ExcelUtils(projectPath+"/Excel/data.xlsx","Sheet1");
        ExcelUtils.getRowCount();
        ExcelUtils.getCellDataString(0,0);
        ExcelUtils.getCellDataString(0,1);
        ExcelUtils.getCellDataString(1,1);
        ExcelUtils.getCellDataString(1,0);
    }
}
