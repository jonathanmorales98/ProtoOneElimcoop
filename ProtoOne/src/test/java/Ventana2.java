import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.remote.http.HttpRequest;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.remote.http.Route;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

//import .fileSearch;
public class Ventana2 extends JFrame
{
    JTextField selector;
    JPanel panel;
    JLabel texto;
    JButton boton;
    JButton seleccionar;
    JLabel labelRuta;
    JFileChooser chooser;
    FileNameExtensionFilter filter;
    public Ventana2()
    {

        selector = new JTextField(30);
        panel = new JPanel();
        texto = new JLabel();
        boton = new JButton();
        seleccionar = new JButton();
        labelRuta = new JLabel();

        this.add(panel);
        panel.add(texto);
        panel.add(boton);
        panel.add(selector);
        panel.add(seleccionar);
        panel.add(labelRuta);

        texto.setText("Bienvenido a la interfaz");
        boton.setText("Ejecutar");
        seleccionar.setText("Seleccionar ruta de excel");
        //selector.setText(Route);


        seleccionar.addActionListener(new fileSearch());
        boton.addActionListener(new WhatsApp());

    }

}