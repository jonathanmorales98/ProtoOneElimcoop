import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class readExcel {
    public void ReadExcel(String ruta,String SheetName) throws FileNotFoundException {
        System.out.println("entrando a la funcion" + ruta);
        File file = new File(ruta);
        FileInputStream inputStream = new FileInputStream(file);
        //XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        //XSSFSheet newSheet = newWorkbook.getSheet(SheetName);



    }
}
