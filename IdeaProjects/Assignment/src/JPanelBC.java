
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JPanelBC extends JPanel
{
    BufferedImageLoader loader = new BufferedImageLoader();
    BufferedImage bc;

    public JPanelBC()
    {
        try
        {
            bc = loader.loadImage("/background.jpg");
        }
        catch (Exception e) {
            System.out.println("Not");/*handled in paintComponent()*/ }
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(bc, 0,0,this);
    }
}


