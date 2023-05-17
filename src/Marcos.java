import javax.swing.*;
import java.awt.*;

public class Marcos extends JFrame {
    private Laminas tipo, tiposMensajes, mensajes, confirmar, opcion, entrada;

    public Marcos() {
        setTitle("Prueba de Java");
        setBounds(500, 300, 600, 450);// dimenciones del panel

        JPanel cuadricula = new JPanel();// creando una lamina simple
        cuadricula.setLayout(new GridLayout(2, 3));

        String primer[] = { "Mensaje", "Confirmar", "Opcion", "Entrada" };// Arreglo que contiene los nombres de los
                                                                          // botones en esa cuadricula
        tipo = new Laminas("TIPO", primer);
        tiposMensajes = new Laminas("Tipo de Mensaje", new String[] { // creando el arreglo en la propia instancia
                "ERROR_MESSAGE",
                "INFORMATION_MESSAGE",
                "WARNING_MESSAGE",
                "QUESTION_MESSAGE",
                "PLAIN_MESSAGE"
        });
        mensajes = new Laminas("Mensaje", new String[] {
                "Cadena",
                "Icocno",
                "Componente",
                "Otros",
                "Object[]"
        });
        confirmar = new Laminas("Confirmar", new String[] {
                "DEFAULT_OPTION",
                "YES_NO_OPTION",
                "YES_NO_CANCEL_OPTION",
                "OK_CANCEL_OPTION"
        });
        opcion = new Laminas("Opcion", new String[] {
                "String[]",
                "Icon[]",
                "Object[]"
        });
        entrada = new Laminas("Entrada", new String[] {
                "Campo de texto",
                "Combo"
        });
        cuadricula.add(tipo);// creando la lamina donde se muestran los botones
        cuadricula.add(tiposMensajes);
        cuadricula.add(mensajes);
        cuadricula.add(confirmar);
        cuadricula.add(opcion);
        cuadricula.add(entrada);

        add(cuadricula);// agregando la cuadricula al marco

    }

}
