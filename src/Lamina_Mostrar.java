import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//Clase para pintar un rectangulo negro
public class Lamina_Mostrar extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());

        g2d.setPaint(Color.BLACK);
        g2d.fill(rectangulo);
    }

}
