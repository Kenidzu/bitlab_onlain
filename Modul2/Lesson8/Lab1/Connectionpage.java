package Lesson8.Lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

public class Connectionpage extends JPanel {
    private JTextField textFieldid;
    private JTextField textFieldport;
    private JButton buttonconnect;
    private JLabel label;
    private JLabel dontcorrect;
    private MainFrame parent;

    public Connectionpage(MainFrame parent) {
        this.parent = parent;
        setSize(500,500);
        setLayout(null);

        label = new JLabel("Id");
        label.setSize(300,30);
        label.setLocation(100,150);
        add(label);

        textFieldid = new JTextField("");
        textFieldid.setSize(300,30);
        textFieldid.setLocation(150,150);
        add(textFieldid);

        label = new JLabel("Port");
        label.setSize(300,30);
        label.setLocation(100,200);
        add(label);

        textFieldport = new JTextField("");
        textFieldport.setSize(300,30);
        textFieldport.setLocation(150,200);
        add(textFieldport);

        buttonconnect = new JButton("Connect");
        buttonconnect.setSize(100,30);
        buttonconnect.setLocation(200,250);
        buttonconnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = textFieldid.getText();
                String port = textFieldport.getText();
                if (!id.equals("") && !port.equals("")){
                    try {
                        int portt = Integer.parseInt(textFieldport.getText());
                        boolean connect = Main.connect(id,portt);
                        if (connect){
                            textFieldid.setText("");
                            textFieldport.setText("");
                            parent.getInteractionpage().setVisible(true);
                            parent.getConnectionpage().setVisible(false);
                        }else {
                            dontcorrect = new JLabel("Don't correct id maybe port");
                            dontcorrect.setSize(300,30);
                            dontcorrect.setLocation(100,300);
                            add(dontcorrect);
                        }

                    }catch (Exception e1){
                        e1.printStackTrace();
                    }

                }
            }
        });
        add(buttonconnect);

    }
}
