import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Character extends JFrame /*implements ActionListener*/ {
    private Container pane;
    private JLabel title, inputName, inputSubjects, inputTraits;
    private JTextField name;
    private JComboBox subjects, traits;
    private JButton submit;

    public Character() {
	this.setTitle("Make your Stuy Student");
	this.setSize(500,200);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	title = new JLabel("Character Info");
	title.setFont( new Font("Serif", Font.PLAIN, 18) );
        inputName = new JLabel("Name:", null, JLabel.CENTER);
	name = new JTextField(16);
	inputSubjects = new JLabel("Choose your favorite class", null, JLabel.CENTER);
	//String[] subjectList = { "Science", "Math", "History", "Computer Science" };
	//subjects = new JComboBox(subjectList);
	submit = new JButton("Submit");

	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.Y_AXIS) );

	pane.add(title);
	pane.add(inputName);
	pane.add(name);
	pane.add(inputSubjects);
	pane.add(submit);

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
