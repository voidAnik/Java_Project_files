import javax.swing.*;
import java.awt.*;

public class SimpleFramePaint extends JFrame {
    int x=0;
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(100+x,100,100,90);

        //g.drawString("This is a rectangle",100,90);
    }
    public SimpleFramePaint()
    {
        super("My Frame Drawings!");
        setSize(400,400);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        while (true){
            if(x==30){
                x=0;
            }
            try{
                Thread.sleep(100);
            }catch(Exception e){

            }
            x++;
            super.repaint();

        }
    }
    public static void main(String ... args)
    {
        new SimpleFramePaint();
    }
}



