import javax.swing.*;
import java.awt.*;

public class Hello {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            var frame = new HelloworldFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class helloworldComponent extends JComponent {
    private static final int MSG_X = 75;
    private static final int MSG_Y = 100;

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    @Override
    public void paintComponent(Graphics g){
        g.drawString("Hello World"
                , MSG_X, MSG_Y);
        }

    @Override
    public Dimension getPreferredSize(){
         return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        }
}

class HelloworldFrame extends JFrame{

    public HelloworldFrame()
 {
         add(new helloworldComponent());
        pack();
        }
}

