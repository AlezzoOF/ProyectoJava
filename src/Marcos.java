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
                                "Icono",
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

                // Constuir lamina de debajo
                JPanel lamina_inferior = new JPanel();
                // creando el boton PRINT dentro de la lamina
                JButton boton_lamina_inferior = new JButton("Print");
                // Agregandole accion al boton
                boton_lamina_inferior.addActionListener(new PrintAction());
                lamina_inferior.add(boton_lamina_inferior);

                setLayout(new BorderLayout());
                // agregando la lamina principal al marco
                add(cuadricula, BorderLayout.CENTER);
                // agregando la lamina inferior al marco
                add(lamina_inferior, BorderLayout.SOUTH);

        }
        
        //Clase interna para mostrar en pantalla un mensaje segun la seleccion en field tipo
        private class PrintAction implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                        // System.out.println(tipo.seleccion());

                        switch (tipo.seleccion()) {
                                case "Mensaje":
                                        JOptionPane.showMessageDialog(Marcos.this, getMensaje(),"title", getTipoDeMensaje());
                                        break;
                                case "Confirmar":
                                        JOptionPane.showConfirmDialog(Marcos.this, getMensaje(),"title", getConfirmar(), getTipoDeMensaje());
                                        break;
                                case "Opcion":
                                        JOptionPane.showOptionDialog(Marcos.this, getMensaje(), "title", 1, getTipoDeMensaje(), null, getOpcion(),
                                                        null);
                                        break;
                                case "Entrada":
                                        JOptionPane.showInputDialog(Marcos.this, getMensaje(), "title", getTipoDeMensaje(), null, getEntrada(), null);
                                        break;
                        }

                }

        }

        //Metodo que devuelve un objeto segun la seleccion de field mensaje

        public Object getMensaje(){
                 
                switch (mensajes.seleccion()) {
                        case "Cadena":
                                return mensaje;
                        case "Icono":
                                return icono;
                        case "Componente":
                                return componenteMensaje;
                        case "Otros":
                               return objeto;
                        case "Object[]":
                               return new Object[]{mensaje, icono, componenteMensaje, objeto};

                        default:
                                return null;
                }
                
        }


        //Metodo que devuelve un int segun seleccion de field Tipo de mensasjes
        public int getTipoDeMensaje(){
                switch (tiposMensajes.seleccion()) {
                        case "ERROR_MESSAGE":
                                return 0;
                        case "INFORMATION_MESSAGE":
                                return 1;
                        case "WARNING_MESSAGE":
                                return 2;
                        case "QUESTION_MESSAGE":
                               return 3;
                        case "PLAIN_MESSAGE":
                               return -1;

                        default:
                                return 0;
                }
                
        }



         //Metodo que devuelve un int segun seleccion en el field Confirmar dado la seleccion de Confirmar en el fiel TIpo
        public int getConfirmar(){
                switch (confirmar.seleccion()) {
                        case "DEFAULT_OPTION":
                                return -1;
                        case "YES_NO_OPTION":
                                return 0;
                        case "YES_NO_CANCEL_OPTION":
                                return 1;
                        case "OK_CANCEL_OPTION":
                               return 2;
                        default:
                                return -1;
                }
                
        }


           //Metodo que devuelve un arrelgo de objetos segun seleccion en el field Opcion dado la seleccion de Opcion en el fiel TIpo
        public Object[] getOpcion(){
                switch (opcion.seleccion()) {
                        case "String[]":
                                return new String[]{"azul", "amarillo", "rojo"};
                        case "Icon[]":
                                return new Icon[]{icono, icono, icono};
                        case "Object[]":
                                return new Object[]{mensaje, icono, componenteMensaje, objeto} ;
                        default:
                                return null;
                }
                
        }


        //Comprobando la seleccion del ultimo field
        public Object[] getEntrada(){
                if(entrada.seleccion().equals("Combo")){
                        return new String[]{"rojo", "verde", "violeta"};
                }
                else{
                        return null;
                }

        }
      

}
