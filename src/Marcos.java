import javax.swing.*;
import java.awt.*;


public class Marcos extends JFrame{
    private Laminas tipo;
    // private Laminas
    // private Laminas tipo;
    // private Laminas tipo;
    // private Laminas tipo;
    // private Laminas tipo; 

    public Marcos(){
        setTitle("Prueba de Java");
        setBounds(500, 300,600, 450 );//dimenciones del panel

        JPanel cuadricula = new JPanel();//creando una lamina simple
        cuadricula.setLayout(new GridLayout(2,3));
        

        String primer[] = {"Mensaje", "Confirmar", "Opcion", "Entrada"};//Arreglo que contiene los nombres de los botones en esa cuadricula
         

        tipo = new Laminas("TIPO", primer);
        cuadricula.add(tipo);//creando la lamina donde se muestran los botones

        add(cuadricula);//agregando la cuadricula al marco

    }
    
}
