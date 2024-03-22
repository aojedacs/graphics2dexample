package forms;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    private JPanel canvas;


    public MainFrame() {
        setTitle("Super Mario Bros 3");
        setSize(1024, 645);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Crear e instanciar las figuras
                Platform p1 = new Platform(100,400,100,200, new Color(37,144,222));
                Platform p2 = new Platform(50,500,100,100, new Color(240,148,105));
                Platform p3 = new Platform(300,500,250,100, new Color(82,217,108));
                Platform p4 = new Platform(300,500,50,100, new Color(150,220,80));



                // Dibujar las figuras
                p1.draw(g2d);
                p2.draw(g2d);
                p3.draw(g2d);
                p4.draw(g2d);
                
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                Dimension screenSize = toolkit.getScreenSize();
       		 
       		 	int screenWidth = screenSize.width;
       		 	int screenHeight = screenSize.height;
                
                g2d.setColor(new Color(33,33,33));
    	    	g2d.setStroke(new BasicStroke(3));
    	    	g2d.drawRect(0, 600, screenWidth, 20);
                g2d.setColor(new Color(251,198,182));
                g2d.fillRect(0, 600, screenWidth, 20);

  
               
            }
        };

        canvas.setBackground(new Color(179,238,254));
        add(canvas);
    }
  }
;