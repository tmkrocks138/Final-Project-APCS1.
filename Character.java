import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Character extends JFrame /*implements ActionListener*/ {
    private Container pane;
    private JLabel username;
    private JButton b;
    private JTextField name;

    public Character() {
	this.setTitle("Make your Stuy Student");
	this.setSize(500,500);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	username = new JLabel("Name:", null, JLabel.CENTER);
	name = new JTextField(16);

	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.Y_AXIS) );
	pane.add(name);
	pane.add(username);

    }
    
    /**
    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	if ( event.equals() ) {
	    
	}
	if ( event.equals() ) {
	    
	}
    }
    **/
    
    public static void main(String[] args) {
	Character c = new Character();
	c.setVisible(true);
    }
}
