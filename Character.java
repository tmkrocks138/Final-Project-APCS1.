import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Character extends JFrame /*implements ActionListener*/ {
    private Container paneBox, paneTitle, paneInputs;
    private JLabel title, inputName;
    private JTextField name;
    private JButton submit;

    public Character() {
	//paneBox
	this.setTitle("Make your Stuy Student");
	this.setSize(500,500);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	//title = new JLabel("Character Info");
	//title.setFont( new Font("Serif", Font.PLAIN, 18) );
        inputName = new JLabel("Name:", null, JLabel.CENTER);
	name = new JTextField(16);

	//paneTitle = this.getContentPane();
	//System.out.println(pane);
	//paneTitle.setLayout( new BoxLayout(paneTitle, BoxLayout.Y_AXIS) );

	paneInputs = this.getContentPane();
	//paneInputs.add(title);
	//paneInputs.add(inputName);
	//paneInputs.add(name);

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
