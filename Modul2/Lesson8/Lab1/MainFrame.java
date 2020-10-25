package Lesson8.Lab1;

import javax.swing.*;

public class MainFrame extends JFrame {
    private Connectionpage connectionpage;
    private Interactionpage interactionpage;

    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Student Application");
        setSize(500,500);
        setLayout(null);

        connectionpage = new Connectionpage(this);
        connectionpage.setVisible(true);
        add(connectionpage);

        interactionpage = new Interactionpage(this);
        interactionpage.setVisible(true);
        add(interactionpage);


    }

    public Connectionpage getConnectionpage() {
        return connectionpage;
    }

    public Interactionpage getInteractionpage() {
        return interactionpage;
    }


}
