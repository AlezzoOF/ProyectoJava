import javax.swing.*;

public class Laminas extends JPanel {
    private ButtonGroup buttons;
    public Laminas(String titulo, String[] botones) {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));//Creando borde

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));// creando cajas de texto con items verticales
        buttons = new ButtonGroup();

        for (int i = 0; i < botones.length; i++) {
            JRadioButton boton = new JRadioButton(botones[i]);// creacion de botones
            boton.setActionCommand(botones[i]);//agregando la accion 
            add(boton);// agregando el boton a la lamina

            buttons.add(boton);// agregando el boton a el BotonGrup
            boton.setSelected(i == 0);
        }
    }

    public String seleccion(){
        ButtonModel button = buttons.getSelection();
        String accion = button.getActionCommand();
        return accion;
    }
}
