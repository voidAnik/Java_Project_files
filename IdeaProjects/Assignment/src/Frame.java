
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class Frame extends JFrame implements ActionListener {

    JTable table;
    JScrollPane scroll;
    DefaultTableModel model;
    String coloum[] = {"Name", "ID", "CGPA"};
    String row[] = new String[3];

    JPanel container,display_panel, search_panel;
    JPanelBC start_panel;
    JButton bt_Add,bt_remove,bt_save,bt_search,bt_clear;
    JRadioButton bt_sn, bt_si, bt_sc;
    ButtonGroup bt_group;
    JButton dBack;
    JLabel lbName, lbId, lbCgpa;
    Font wF, lbF;
    CardLayout clay_out=new CardLayout();
    JLabel welcome_label=new JLabel();
    JTextField tfName, tfId, tfCgpa;

    ArrayList<Student> students = new ArrayList<>();
    FileWork studentsInfo = new FileWork();
    boolean have = false, per = false;

    Frame(int Width,int Height , String name){

        setSize(Width,Height);
        setLocationRelativeTo(null);
        setTitle(name);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        drawStartPage();
        drawDisplayPage();

        container = new JPanel();
        container.setLayout(clay_out);
        container.add(start_panel,"Start Page");
        container.add(display_panel,"Display Page");
        container.add(search_panel,"Search Page");

        add(container);
        studentsInfo.read(students);
        for(int i = 0; i < students.size(); i++)
        {
            row[0] = students.get(i).name;
            row[1] = students.get(i).id;
            row[2] = Double.toString(students.get(i).cgpa);
            model.addRow(row);
        }
    }

    void drawStartPage()
    {
        bt_Add = new JButton("ADD/SHOW");
        bt_Add.setBackground(Color.yellow);
        bt_Add.setBounds(300,150,150,70);
        bt_Add.addActionListener(this);

        bt_search = new JButton("SEARCH");
        bt_search.setBounds(300,250,150,70);
        bt_search.setBackground(Color.yellow);
        bt_search.addActionListener(this);

        wF=new Font("welcome_font",Font.BOLD,30);
        welcome_label.setFont(wF);
        welcome_label.setText("Welcome To Student DataBase");
        welcome_label.setBounds(155,30,450,50);
        welcome_label.setForeground(Color.RED);

        start_panel = new JPanelBC();
        start_panel.setBackground(Color.blue);
        start_panel.setLayout(null);

        start_panel.add(welcome_label);
        start_panel.add(bt_Add);
        start_panel.add(bt_search);


        search_panel = new JPanel();
        search_panel.setBackground(Color.RED);



    }
    void drawDisplayPage()
    {
        lbF = new Font("label font",Font.BOLD,17);
        dBack = new JButton("Back");
        dBack.setBounds(5,5,100,30);
        dBack.addActionListener(this);
        bt_save = new JButton("SAVE");
        bt_save.setBounds(400,60,150,50);
        bt_save.setFont(lbF);
        bt_save.setBackground(Color.RED);
        bt_save.setForeground(Color.YELLOW);
        bt_save.addActionListener(this);
        bt_clear = new JButton("Clear");
        bt_clear.setBounds(400,130,150,50);
        bt_clear.setFont(lbF);
        bt_clear.setBackground(Color.RED);
        bt_clear.setForeground(Color.YELLOW);
        bt_clear.addActionListener(this);
        bt_remove = new JButton("REMOVE");
        bt_remove.setBounds(400,200,150,50);
        bt_remove.setFont(lbF);
        bt_remove.setBackground(Color.RED);
        bt_remove.setForeground(Color.YELLOW);
        bt_remove.addActionListener(this);
        bt_sn = new JRadioButton("SORT BY NAME");
        bt_sn.setBounds(600,60,150,50);
        bt_sn.addActionListener(this);
        bt_si = new JRadioButton("SORT BY ID");
        bt_si.setBounds(600,130,150,50);
        bt_si.addActionListener(this);
        bt_sc = new JRadioButton("SORT BY CGPA");
        bt_sc.setBounds(600,200,150,50);
        bt_sc.addActionListener(this);
        bt_group = new ButtonGroup();

        lbName = new JLabel();
        lbName.setText("Name: ");
        lbName.setBounds(20,60,80,50);
        //lbName.setForeground(Color.CYAN);
        lbName.setFont(lbF);
        lbId = new JLabel();
        lbId.setText("ID: ");
        lbId.setBounds(20,130,80,50);
        lbId.setFont(lbF);
        //lbId.setForeground(Color.CYAN);
        lbCgpa = new JLabel();
        lbCgpa.setText("CGPA: ");
        lbCgpa.setBounds(20,200,80,50);
        lbCgpa.setFont(lbF);
        //lbCgpa.setForeground(Color.CYAN);

        tfName = new JTextField();
        tfName.setBounds(100,60,200,50);
        tfId = new JTextField();
        tfId.setBounds(100,130,200,50);
        tfCgpa = new JTextField();
        tfCgpa.setBounds(100,200,200,50);

        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(coloum);
        table.setModel(model);
        table.setSelectionBackground(Color.BLUE);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);

        scroll = new JScrollPane(table);
        scroll.setBounds(20,290,745,255);

        display_panel = new JPanel();
        display_panel.setBackground(Color.YELLOW);
        display_panel.setLayout(null);

        display_panel.add(dBack);
        display_panel.add(bt_save);
        display_panel.add(bt_clear);
        display_panel.add(bt_remove);
        display_panel.add(bt_sc);
        display_panel.add(bt_si);
        display_panel.add(bt_sn);
        bt_group.add(bt_sc);
        bt_group.add(bt_si);
        bt_group.add(bt_sn);

        display_panel.add(lbName);
        display_panel.add(lbId);
        display_panel.add(lbCgpa);

        display_panel.add(tfName);
        display_panel.add(tfId);
        display_panel.add(tfCgpa);
        display_panel.add(scroll);



    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt_Add) {
            clay_out.show(container, "Display Page");
        }
        if(e.getSource()==dBack) {
            clay_out.show(container, "Start Page");
        }
        if(e.getSource()== bt_save)
        {
            Student tempSt = new Student();
            if(!tfCgpa.getText().equals("") && !tfName.getText().equals("") && !tfId.getText().equals("") )
            {
                tempSt.name = tfName.getText();
                tempSt.id = tfId.getText();
                tempSt.cgpa = Double.parseDouble(tfCgpa.getText());
                per = true;
            }
            else {
                JOptionPane.showMessageDialog(null,"Missing info.Fill it!");
            }

            for(int i = 0; i < students.size(); i++)
            {
                if(tempSt.id.equals(students.get(i).id))
                {
                   JOptionPane.showMessageDialog(null,"Already have this students info!");
                    have = true;
                }
            }
            if(!have && per) {
                System.out.println("Added");
                if(!have)
                students.add(tempSt);
                have = false;
                studentsInfo.write(students);
            }
            tablePrint();
            }
        if(e.getSource() == bt_clear)
        {
            tfName.setText("");
            tfId.setText("");
            tfCgpa.setText("");
        }
        if(e.getSource() == bt_remove)
        {
            int rvRow = table.getSelectedRow();
            if(rvRow >= 0)
                model.removeRow(rvRow);
            students.remove(rvRow);
            studentsInfo.write(students);
        }
        if(e.getSource() == bt_sn)
        {
            Collections.sort(students);
            tablePrint();
            studentsInfo.write(students);
        }
        if(e.getSource() == bt_si)
        {
            Collections.sort(students,Student.idCompare);
            tablePrint();
            studentsInfo.write(students);
        }
        if(e.getSource() == bt_sc)
        {
            Collections.sort(students,Student.cgpaCompare);
            tablePrint();
            studentsInfo.write(students);
        }
        if(e.getSource() == bt_search)
        {
            Student tempStudent = new Student();
            boolean tempBool = false;
            String tempId = JOptionPane.showInputDialog(null,"Enter Students ID to search:","SEARCH:",3);
            for(int i = 0; i < students.size(); i++)
            {
                if(tempId.equals(students.get(i).id))
                {
                    tempStudent = students.get(i);
                    tempBool = true;
                }
            }
            if(tempBool)
            {
                JOptionPane.showMessageDialog(null,"Student NAME:"+tempStudent.name+
                        "\nStudent ID:"+tempStudent.id+"\nStudent CGPA:"+tempStudent.cgpa,"FOUND",2);
            }
            else
            JOptionPane.showMessageDialog(null,"No info for this  '"+tempId+"'  ID.","SORRY",0);
        }

    }
    void tablePrint()
    {
        while(model.getRowCount()>0)
        {
            model.removeRow(0);
        }

        for(int i = 0; i < students.size(); i++)
        {
            row[0] = students.get(i).name;
            row[1] = students.get(i).id;
            row[2] = Double.toString(students.get(i).cgpa);
            model.addRow(row);
        }
    }


}
