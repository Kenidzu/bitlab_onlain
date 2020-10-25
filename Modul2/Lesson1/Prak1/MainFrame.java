package Lesson1.Prak1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JTextField textField1;
    private JComboBox agesBox;
    private Integer[]ages = new Integer[100];
    private JTextArea area;
    public MainFrame(){
        for (Integer i = 0; i < 100; i++) {
            ages[i] = i;
        }
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Unversitet");
        setSize(600,600);
        setLayout(null);

        label = new JLabel("Hello KazGU");
        label.setSize(300,30);
        label.setLocation(250,50);
        add(label);

        label = new JLabel("Name:");
        label.setSize(500,30);
        label.setLocation(100,100);
        add(label);

        textField = new JTextField("");
        textField.setSize(200,30);
        textField.setLocation(200,100);
        add(textField);

        label = new JLabel("Phone:");
        label.setSize(600,30);
        label.setLocation(100,200);
        add(label);

        textField1 = new JTextField("");
        textField1.setSize(200,30);
        textField1.setLocation(200,200);
        add(textField1);

        label = new JLabel("Age:");
        label.setSize(600,30);
        label.setLocation(100,300);
        add(label);

        agesBox = new JComboBox(ages);
        agesBox.setSize(200,30);
        agesBox.setLocation(200,300);
        add(agesBox);

        area = new JTextArea();
        area.setSize(350,150);
        area.setLocation(100,430);
        add(area);

        button = new JButton("ADD Contact");
        button.setSize(300, 30);
        button.setLocation(120,370);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String phone = textField1.getText();
                Integer age = (Integer) agesBox.getSelectedItem();
                if (!text.equals("") || !phone.equals("")){
                    area.append(text + " " + phone + " " + age + "\n");
                    textField.setText("");
                    textField1.setText("");
                    agesBox.setSelectedItem(0);

                }
            }
        });

        add(button);
    }

}
