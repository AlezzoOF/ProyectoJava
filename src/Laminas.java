import javax.swing.*;
import javax.swing.border.Border;

public class Laminas extends JPanel{
    public Laminas(String titulo, String[] botones) {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));//Seteando borde con titulo pasado x parametros

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));// Creadno las cajas de texto, diciendole q sus items van en forma vertical
        ButtonGroup buttons = new ButtonGroup();

        for(int i =0; i<botones.length;i++){
            JRadioButton boton = new JRadioButton(botones[i]);//creando los botones x caja de texto, estos ban dentro de un buttonGrup
            add(boton);//agregando el boton a la lamina

            buttons.add(boton);//agregando el boton a el BotonGrup
            boton.setSelected(i==0);
        }
    }
}
