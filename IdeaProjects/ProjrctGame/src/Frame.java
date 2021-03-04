
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener
{
    public ImageIcon icon;
    public CardLayout cl=new CardLayout();
    public JPanel mainPanel,welcomePage,playPage,instructPage,scorePage;
    public JLabel welcome_label;//Labels
    public JButton bt1,bt2,bt3,pBack,iBack,sBack;
    public Font wF,bt_F;
    public Cursor cursor;
    public Frame(){
        mainPanel=new JPanel();
        icon=new ImageIcon(getClass().getResource("dual-katana.png"));
        wF=new Font("welcome_font",Font.BOLD,30);
        bt_F=new Font("welcome_font",Font.BOLD,15);
        welcome_label=new JLabel();
        bt1=new JButton("Start Game");
        bt2=new JButton("Instruction");
        bt3=new JButton("High Scores");
        cursor=new Cursor(12);
        components();
    }
    public void components()
    {

        mainPanel.setLayout(cl);
        setIconImage(icon.getImage());
        setSize(800,600);
        setLocationRelativeTo(null);
        setTitle("Katana Master");
        welcome_label.setFont(wF);
        welcome_label.setText("Welcome To Katana Master");
        welcome_label.setBounds(200,30,400,50);
        welcome_label.setForeground(Color.blue);
        bt1.setFont(bt_F);
        bt1.setBackground(Color.red);
        bt1.setCursor(cursor);
        bt1.addActionListener(this);
        bt2.setFont(bt_F);
        bt2.setBackground(Color.yellow);
        bt2.setCursor(cursor);
        bt2.addActionListener(this);
        bt3.setFont(bt_F);
        bt3.setBackground(Color.green);
        bt3.setCursor(cursor);
        bt3.addActionListener(this);
        bt1.setBounds(300,300,150,30);
        bt2.setBounds(300,350,150,30);
        bt3.setBounds(300,400,150,30);

        welcomePage=new JPanel(); //Welcome page making
        welcomePage.setLayout(null);
        welcomePage.add(welcome_label);
        welcomePage.add(bt1);
        welcomePage.add(bt2);
        welcomePage.add(bt3);

        playPage=new JPanel(); //Play page making
        playPage.setBackground(Color.green);

        pBack=new JButton("Back"); //Back button to return welcome page
        pBack.addActionListener(this);
        playPage.add(pBack);

        instructPage = new JPanel(); //Play page instruction page
        instructPage.setBackground(Color.blue);
        iBack=new JButton("Back"); //Back button to return welcome page
        iBack.addActionListener(this);
        instructPage.add(iBack);

        scorePage=new JPanel(); //Score page making
        scorePage.setBackground(Color.yellow);
        sBack=new JButton("Back"); //Back button to return welcome page
        sBack.addActionListener(this);
        scorePage.add(sBack);

        mainPanel.add(welcomePage,"welcomePage");
        mainPanel.add(playPage,"playPage");
        mainPanel.add(instructPage,"instructPage");
        mainPanel.add(scorePage,"scorePage");
        add(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1) {
            //cl.next(mainPanel);
            cl.show(mainPanel, "playPage");
        }
        if(e.getSource()==bt2)
        {
            cl.show(mainPanel,"instructPage");
        }
        if(e.getSource()==bt3) {
            cl.show(mainPanel, "scorePage");
        }
        if(e.getSource()==pBack)
        {
            cl.show(mainPanel,"welcomePage");
        }
        if(e.getSource()==iBack)
        {
            cl.show(mainPanel,"welcomePage");
        }
        if(e.getSource()==sBack)
        {
            cl.show(mainPanel,"welcomePage");
        }
    }
}
