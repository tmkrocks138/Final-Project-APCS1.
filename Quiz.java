import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame {
    private Container pane;
    private JLabel title;
    private JButton submit;

    public Quiz() {
	this.setTitle("Quiz Time!");
	this.setSize(500,500);
	//this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	//COMPONENTS
	title = new JLabel("[title to be replaced]");
	submit = new JButton("Done");
	
	//LAYOUT
	pane = this.getContentPane();
	//pane.setLayout();

	//ACTION LISTENER STUFF

	//ADD COMPONENTS ONTO GUI
	pane.add(title);
	//pane.add(submit);
    }

    public static void main(String[] args) {
	Quiz q = new Quiz();
	q.setVisible(true);
    }
}
