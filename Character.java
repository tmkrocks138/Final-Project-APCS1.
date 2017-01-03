import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Character extends JFrame /*implements ActionListener*/ {
    private Container pane;
    private JLabel l;
    private JTextField tf;

    public Character() {
	this.setTitle("Make your Stuy Student");
	this.setSize(500,500);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.Y_AXIS) );

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
