package Lab1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListStudents extends JPanel {
    private MainFrame parent;
    private JLabel label;
    private JButton backbutton;

    private String univer [] = {"Id","Name","Surname","Faculty","Group"};
    private JTable table;
    private JScrollPane scrollPane;

    public void showButtonsListStudent(){
        backbutton.setVisible(true);
    }

    public ListStudents(MainFrame parent){
        this.parent = parent;
        setSize(500,500);
        setLayout(null);

        label = new JLabel("List Student");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);

        backbutton = new JButton("Back");
        backbutton.setSize(300,30);
        backbutton.setLocation(100,150);
        backbutton.setVisible(false);
        backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getListStudentspage().setVisible(false);
                parent.getMainMenupage().setVisible(true);
            }
        });
        add(backbutton);

        table = new JTable();
        table.setFont(new Font("Calibri",Font.PLAIN,12));
        table.setRowHeight(30);

        scrollPane = new JScrollPane(table);
        scrollPane.setSize(300,200);
        scrollPane.setLocation(100,200);
        add(scrollPane);
    }
    public void generateTable(ArrayList<Student> students){
        Object data[][] = new Object[students.size()][univer.length];

        for(int i =0;i< students.size();i++){
            Student current = students.get(i);
            data[i][0] = current.getId();
            data[i][1] = current.getName();
            data[i][2] = current.getSurname();
            data[i][3] = current.getFaculty();
            data[i][4] = current.getGroup();
        }

        DefaultTableModel model = new DefaultTableModel(data, univer);
        table.setModel(model);

    }

}
