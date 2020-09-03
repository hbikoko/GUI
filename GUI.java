import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	int count = 0;
	JLabel myLabel; //implementing the action listener means automatically implementing a new method actionPerformed(). But actionPerformed() won't recognize the -
	JFrame myFrame; //different label and frame and stuff, so we have to declare them outside of the GUI constructor
	JButton myButton;
	JPanel myPanel;
	public GUI() {
		
		myFrame = new JFrame(); //creating a JFrame object
		
		myButton = new JButton("Click me"); //creating a button thru the JButton class
		myButton.addActionListener(this); //Action Listener reacts to user interactions like clicks. "this" just means it will listen to events from this overall GUI class
		myLabel = new JLabel("Number of clicks: 0");
		
		myPanel = new JPanel(); //there are a lot of methods you can attach to a Jpanel object, because it's a flexible class
		myPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); //Creating a border using the BorderFactory, which is a Factory class used for making borders
		myPanel.setLayout(new GridLayout(0,1)); //GridLayout class creates a GridLayout w/ the specified number of rows and columns
		myPanel.add(myButton); //adding the button to the panel
		myPanel.add(myLabel);
		
		myFrame.add(myPanel, BorderLayout.CENTER);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //telling the code when to exit the JFrame application. 
		myFrame.setTitle("Our GUI");
		myFrame.pack(); //sizes the window correctly to fit all of the other graphical subcomponents the JFrame class has
		myFrame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new GUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		myLabel.setText("Number of clicks: " + count); //this way, each time we click the button, the count variable will increase (hence the count++)-
		//and when the count variable increases, the change will be reflected in the text
	}
}
