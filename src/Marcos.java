import javax.swing.*;
import java.awt.*;


public class Marcos extends JFrame{

    public Marcos(){
        setTitle("Prueba de Java");
        setBounds(500, 300,600, 450 );//dimenciones del panel

        JPanel cuadricula = new JPanel();//Agregando una lamina simple
        cuadricula.setLayout(new GridLayout(2,3));
        add(cuadricula);
    }
    
}
