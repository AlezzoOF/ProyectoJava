import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class Marcos extends JFrame {
    private Laminas tipo, tiposMensajes, mensajes, confirmar, opcion, entrada;
    private String mensaje = "Hola";
    private Icon icono = new ImageIcon("src/m.png");
    private Object objeto = new Date();
    private Component componenteMensaje = new Lamina_Mostrar();

    public Marcos() {
        setTitle("Prueba de Java");
        // dimenciones del panel
        setBounds(500, 300, 600, 450);

        // creando una lamina simple
        JPanel cuadricula = new JPanel();
        cuadricula.setLayout(new GridLayout(2, 3));
        
        // Arreglo que contiene los nombres de los botones en esa cuadricula                                                                
        String primer[] = { "Mensaje", "Confirmar", "Opcion", "Entrada" };
        tipo = new Laminas("TIPO", primer);
        // creando el arreglo en la propia instancia
        tiposMensajes = new Laminas("Tipo de Mensaje", new String[] { 
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
        // agreagando al marco la lamina donde se muestran los botones
        cuadricula.add(tipo);
        cuadricula.add(tiposMensajes);
        cuadricula.add(mensajes);
        cuadricula.add(confirmar);
        cuadricula.add(opcion);
        cuadricula.add(entrada);

        //Constuir lamina de debajo
        JPanel lamina_inferior = new JPanel();
        //creando el boton PRINT dentro de la lamina 
        JButton boton_lamina_inferior = new JButton("Print");
        //Agregandole accion al boton
        boton_lamina_inferior.addActionListener(new PrintAction());
        lamina_inferior.add(boton_lamina_inferior);

        setLayout(new BorderLayout());
        // agregando la lamina principal al marco
        add(cuadricula, BorderLayout.CENTER);
        //agregando la lamina inferior al marco
        add(lamina_inferior, BorderLayout.SOUTH);

    }

    private class PrintAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        //     System.out.println(tipo.seleccion());

                switch(tipo.seleccion()){
                        case "Mensaje":
                                JOptionPane.showMessageDialog(Marcos.this, "message");;
                                break;
                        case "Confirmar":
                                JOptionPane.showConfirmDialog(Marcos.this, "Confirmar");
                                break;
                        case "Opcion":
                                JOptionPane.showOptionDialog(Marcos.this, "Option", "title", 0, 0, null, null, null);
                                break;
                        case "Entrada":
                                JOptionPane.showInputDialog(Marcos.this, "Entrada");
                                break;
                }
            
        }

    }

}
