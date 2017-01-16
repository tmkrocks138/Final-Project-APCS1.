import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame {
    private Container pane;
    private JLabel title;
    private String subject;
    private String[] questions, answers;
    private JButton submit;

    public Quiz() {
	this.setTitle("Quiz Time!");
	this.setSize(500,500);
	this.setLocation(500,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	//COMPONENTS
	title = new JLabel(subject+" Quiz" );

	
	subject = Character.getSubject();
        if ( subject.equals("Science") ) {
	    questions = 
	}
	else if ( subject.equals("Math") ) {
	    
	}
	else if ( subject.equals("History") ) {
	    
	}
	else if ( subject.equals("Computer Science") ) {
	    
	}
	else {
	    
	}
	    
	
	
	submit = new JButton("Done");
	
	//LAYOUT
	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.Y_AXIS) );

	//ACTION LISTENER STUFF

	//ADD COMPONENTS ONTO GUI
	pane.add(title);
	
	
	pane.add(submit);
    }

    public static void main(String[] args) {
	Quiz q = new Quiz();
	q.setVisible(true);
    }
}
