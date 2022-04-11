import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Ikaros
 */
public class ButtonFrame2 extends JFrame{
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame2()
    {
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        buttonPanel = new JPanel();
        add(buttonPanel);
        makeButton("yellow"
                , Color.YELLOW);
        makeButton("blue"
                , Color.BLUE);
        makeButton("red"
                , Color.RED);
        makeButton("green"
                , Color.GREEN);
    }

    public void makeButton(String name, Color backgroundColor)
    {
        var button = new JButton(name);
        buttonPanel.add(button);
        button.addActionListener(event->
                buttonPanel.setBackground(backgroundColor));
    }



    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new ButtonFrame2();
            ex.setVisible(true);
            ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
        });
    }


}
