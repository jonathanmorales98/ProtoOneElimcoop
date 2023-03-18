import net.bytebuddy.asm.Advice;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class fileSearch extends readExcel implements ActionListener {

    public String Route;
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Entró");

        Scanner entrada = null;
        JFileChooser fileChooser = new JFileChooser();
        FileFilter fil = new FileNameExtensionFilter("Archivos excel (.xlsx)", "xlsx");
        fileChooser.setFileFilter(fil);
        fileChooser.showOpenDialog(fileChooser);
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            entrada = new Scanner(f);
            Route = ruta;
            while (entrada.hasNext()) {
                System.out.println(entrada.nextLine());
                System.out.println("La ruta principal es" + ruta);
            }
        } catch (FileNotFoundException i) {
            System.out.println(i.getMessage());
        } catch (NullPointerException i) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (Exception i) {
            System.out.println(i.getMessage());
        } finally {

            if (entrada != null) {
                entrada.close();
                System.out.println("La ruta es" + Route);
                //ReadExcel(Route);
                //Ventana2(Route);
                if (Route != null){
                    //selector.setText("Route");
                }

            }
        }

    }
}

