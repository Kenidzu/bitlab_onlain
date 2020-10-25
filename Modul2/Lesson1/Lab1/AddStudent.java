package Lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudent extends JPanel{
    private MainFrame parent;
    private JButton addButton;
    private JButton backButton;
    private JLabel label;
    private JTextField textFieldName;
    private JTextField textFieldsurname;
    private JTextField textFieldgroup;
    private JComboBox agesBox;
    private String [] faculty = new String[]{"Information Technologies","Economics","Mathematics"};
    int id = 0;


    public void showButtonsaddStudent(){
        addButton.setVisible(true);
        backButton.setVisible(true);
    }


    public AddStudent(MainFrame parent){
        this.parent = parent;
        setSize(500,500);
        setLayout(null);


        label = new JLabel("Name:");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);

        textFieldName = new JTextField("");
        textFieldName.setSize(300,30);
        textFieldName.setLocation(180,100);
        add(textFieldName);

        label = new JLabel("Surname:");
        label.setSize(300,30);
        label.setLocation(100,150);
        add(label);

        textFieldsurname = new JTextField("");
        textFieldsurname.setSize(300,30);
        textFieldsurname.setLocation(180,150);
        add(textFieldsurname);

        label = new JLabel("Facultet:");
        label.setSize(300,30);
        label.setLocation(100,200);
        add(label);

        agesBox =  new JComboBox(faculty);
        agesBox.setSize(300,30);
        agesBox.setLocation(180,200);
        add(agesBox);

        label = new JLabel("Group:");
        label.setSize(300,30);
        label.setLocation(100,250);
        add(label);

        textFieldgroup = new JTextField("");
        textFieldgroup.setSize(300,30);
        textFieldgroup.setLocation(180,250);
        add(textFieldgroup);

        addButton = new JButton("Add");
        addButton.setSize(100,30);
        addButton.setLocation(100,300);
        addButton.setVisible(false);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textFieldName.getText();
                String surname = textFieldsurname.getText();
                String faculty = (String) agesBox.getSelectedItem();
                String group = textFieldgroup.getText();
                if (!name.equals("") && !surname.equals("") && !group.equals("")){
                    Student student = new Student(id,name,surname,faculty,group);
                    textFieldName.setText("");
                    textFieldsurname.setText("");
                    textFieldgroup.setText("");
                    parent.setAllstudents(student);
                    id++;
                }
            }
        });
        add(addButton);

        backButton = new JButton("Back");
        backButton.setSize(100,30);
        backButton.setLocation(250,300);
        backButton.setVisible(false);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getAddStudentpage().setVisible(false);
                parent.getMainMenupage().setVisible(true);
            }
        });
        add(backButton);
    }
}
