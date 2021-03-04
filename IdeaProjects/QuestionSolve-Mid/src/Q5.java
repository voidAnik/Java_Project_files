import org.w3c.dom.events.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q5  {
    public static JButton bt;
    static JTextField jtext;
    static JLabel jlb2;
    static int rc = 0;
    public static void main(String[] args)
    {
        jtext = new JTextField();
        jtext.setText(null);
        jtext.setBounds(80,10,100,50);
        jtext.setSize(100,50);
        jlb2 = new JLabel("Total sales: " + rc);
        jlb2.setBounds(50,80,100,50);
        bt = new JButton("Record");
        bt.setBounds(200,10,100,30);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==bt)
                {
                    try {
                        rc += Integer.parseInt(jtext.getText());
                        jtext.setText("");
                        jlb2.setText("Total Sales: " + rc);
                    }catch (Exception ex)
                    {
                        JOptionPane.showMessageDialog(null,"Please enter a valid number for sale");
                        jtext.setText(null);
                    }
                }
            }
        });

        JLabel jlb1 = new JLabel("Enter Sales:");
        jlb1.setBounds(0,10,70,30);

        JFrame frame = new JFrame();
        frame.setSize(500,200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        Container c = frame.getContentPane();
        c.setLayout(null);
        c.add(jtext);
        c.add(bt);
        c.add(jlb1);
        c.add(jlb2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
