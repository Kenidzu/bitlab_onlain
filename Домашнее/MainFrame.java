import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends JFrame{

	public JButton button;
	public JTextField textField;
	public JLabel label, resultLabel;

	public MainFrame(){

		setSize(500,600);
		setTitle("My First APP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		label = new JLabel("YOUR NAME : ");
		label.setSize(200,30);
		label.setLocation(100,200);
		label.setFont(new Font("Arial", 1, 20));
		add(label);

		textField = new JTextField();
		textField.setSize(150,30);
		textField.setLocation(250,200);
		add(textField);

		button = new JButton("PUSH HERE");
		button.setSize(200,30);
		button.setLocation(150,300);
		add(button);

		resultLabel = new JLabel("Your name is not setted");
		resultLabel.setSize(300,30);
		resultLabel.setLocation(100,400);
		resultLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		add(resultLabel);

		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String name = textField.getText();
				resultLabel.setText("Your name is "+name);	
			}
		});


	}

}