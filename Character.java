import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Character extends JFrame implements ActionListener {
    private Container pane;
    private JLabel title, inputName, inputSubjects, inputTraits;
    private JTextField name;
    private JComboBox subjects, traits;
    //private JCheckBox trait1,trait2,trait3,trait4,trait5;
    private JButton submit;

    @SuppressWarnings("unchecked")
    public Character() {
	this.setTitle("Make your Stuy Student");
	this.setSize(310,250);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	//COMPONENTS
	title = new JLabel("Character Info");
	title.setFont( new Font("Serif", Font.PLAIN, 18) );
        inputName = new JLabel("Name:", null, JLabel.LEFT);
	name = new JTextField(8);
	inputSubjects = new JLabel("Choose your favorite class:", null, JLabel.LEFT);
	String[] subjectList = {"Science", "Math", "History", "Computer Science"};
	subjects = new JComboBox(subjectList);
	submit = new JButton("Submit");
	inputTraits = new JLabel("Choose your traits:", null, JLabel.LEFT);
	String[] traitList = {"Hardworking", "Shy", "Lazy", "Friendly", "Forgetful"};
	traits = new JComboBox(traitList);
	/*
	trait1 = new JCheckBox("Hardworking");
	trait2 = new JCheckBox("Shy");
	trait3 = new JCheckBox("Lazy");
	trait4 = new JCheckBox("Friendly");
	trait5 = new JCheckBox("Forgetful");
	*/
	
	//LAYOUT
	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.PAGE_AXIS) );

	//ACTION LISTENER STUFF
	submit.addActionListener(this);
	submit.setActionCommand("Submitted");

	//ADD COMPONENTS ONTO GUI
	pane.add(title);
	pane.add(inputName);
	pane.add(name);
	pane.add(inputSubjects);
	pane.add(subjects);
	pane.add(inputTraits);
	pane.add(traits);
	/*
	pane.add(trait1);
	pane.add(trait2);
	pane.add(trait3);
	pane.add(trait4);
	pane.add(trait5);
	*/
	pane.add(submit);

    }
    
    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	if ( event.equals("Submitted") ) {
	    String characterName = name.getText();
	    String subject = (String)subjects.getSelectedItem();
	    String trait = (String)traits.getSelectedItem();
	    System.out.println("Name: " + characterName + "\n" +
			       "Subject: " + subject + "\n" +
			       "Trait: " + trait);
	    System.exit(0);
	}	
    }

    public String getCharName() {
	return characterName;
    }
    public String getSubject() {
	return subject;
    }
    public String getTrait() {
	return trait;
    }
    
    public static void main(String[] args) {
	Character c = new Character();
	c.setVisible(true);
    }
}
