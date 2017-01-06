import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Character extends JFrame /*implements ActionListener*/ {
    private Container pane;
    private JLabel title, inputName, inputSubjects, inputTraits;
    private JTextField name;
    private JComboBox subjects;
    private JCheckBox trait1,trait2,trait3,trait4,trait5;
    private JButton submit;

    @SuppressWarnings("unchecked")
    public Character() {
	this.setTitle("Make your Stuy Student");
	this.setSize(500,300);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	title = new JLabel("Character Info");
	title.setFont( new Font("Serif", Font.PLAIN, 18) );
        inputName = new JLabel("Name:", null, JLabel.CENTER);
	name = new JTextField(16);
	inputSubjects = new JLabel("Choose your favorite class:", null, JLabel.CENTER);
	String[] subjectList = {"Science", "Math", "History", "Computer Science"};
	subjects = new JComboBox(subjectList);
	submit = new JButton("Submit");
	inputTraits = new JLabel("Choose your traits:", null, JLabel.CENTER);
	trait1 = new JCheckBox("Trait1");
	trait2 = new JCheckBox("Trait2");
	trait3 = new JCheckBox("Trait3");
	trait4 = new JCheckBox("Trait4");
	trait5 = new JCheckBox("Trait5");
	
	
	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.Y_AXIS) );

	pane.add(title);
	pane.add(inputName);
	pane.add(name);
	pane.add(inputSubjects);
	pane.add(subjects);
	pane.add(inputTraits);
	pane.add(trait1);
	pane.add(trait2);
	pane.add(trait3);
	pane.add(trait4);
	pane.add(trait5);
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
