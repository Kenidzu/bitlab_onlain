package Lesson8.Lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interactionpage extends JPanel {
    private JTextField textField;
    private JButton button;
    private MainFrame parent;


    public Interactionpage(MainFrame parent) {
        this.parent = parent;
        setSize(500,500);
        setLayout(null);


        textField = new JTextField("");
        textField.setSize(300,30);
        textField.setLocation(100,150);
        add(textField);

        button = new JButton("Add");
        button.setSize(300,30);
        button.setLocation(100,200);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (!text.equals("")){
                    Main.addserver(text);
                }
                textField.setText("");
            }
        });
        add(button);


    }
}
