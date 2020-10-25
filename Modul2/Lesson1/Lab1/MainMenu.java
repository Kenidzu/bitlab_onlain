package Lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainMenu extends JPanel {
    private MainFrame parent;
    private JButton AddStudent;
    private JButton ListStudents;
    private JButton exitButton;

    public MainMenu (MainFrame parent){
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        AddStudent = new JButton("Add Student");
        AddStudent.setSize(300,30);
        AddStudent.setLocation(100,100);
        add(AddStudent);
        AddStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getMainMenupage().setVisible(false);
                parent.getAddStudentpage().setVisible(true);
                parent.getAddStudentpage().showButtonsaddStudent();
            }
        });

        ListStudents = new JButton("List Student");
        ListStudents.setSize(300,30);
        ListStudents.setLocation(100,150);
        add(ListStudents);

        ListStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getListStudentspage().generateTable(parent.getStudents());
                parent.getMainMenupage().setVisible(false);
                parent.getListStudentspage().setVisible(true);
                parent.getListStudentspage().showButtonsListStudent();

            }
        });

        exitButton = new JButton("Exit");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}
