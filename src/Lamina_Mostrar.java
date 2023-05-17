import java.awt.Graphics;
import java.awt.Component;
import java.awt.geom.*;



import javax.swing.*;

public class Lamina_Mostrar extends JPanel{

    public Lamina_Mostrar() {

        
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(0,0,getWidth(), getHeight());
    }

   
    
}
