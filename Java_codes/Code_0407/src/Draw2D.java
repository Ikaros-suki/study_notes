import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * @author Ikaros
 */
public class Draw2D {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            var frame = new DrawFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}


class DrawComponent extends JComponent {
 public static final int DEFAULT_WIDTH = 400;
 public static final int DEFAULT_HEIGHT = 400;

    @Override
    public void paintComponent(Graphics g){
         var g2 = (Graphics2D) g;

        double leftX = 100;
         double topY = 100;
         double width = 200;
         double height = 150;

         var rect = new Rectangle2D.Double(leftX,topY,width,height);
         g2.setPaint(new Color(147,112,219));
         g2.draw(rect);
         g2.fill(rect);




         }
    //绘制2D图形

         @Override
         public Dimension getPreferredSize(){
         return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
         }

}

class DrawFrame extends JFrame{

    public DrawFrame()
    {
        add(new DrawComponent());
        pack();
    }
}