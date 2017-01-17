import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class Quiz extends JFrame {
    private Container pane;
    private JPanel panel1;
    private JLabel title, one, two, three, four, five;
    private String subject;
    private ButtonGroup q1, q2, q3, q4, q5;
    private JRadioButton a1, b1, c1, d1, e1;
    private JRadioButton a2, b2, c2, d2, e2;
    private JRadioButton a3, b3, c3, d3, e3;
    private JRadioButton a4, b4, c4, d4, e4;
    private JRadioButton a5, b5, c5, d5, e5;
    
    private JButton submit;

    public Quiz() {
	this.setTitle("Quiz");
	this.setSize(230,500);
	this.setLocation(500,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	//COMPONENTS
	//subject = Character.getSubject();
	subject = "Science";
	title = new JLabel( "Scantron" );
	title.setFont( new Font("Calibri", Font.PLAIN, 18) );
	
	//int ran = (int)( Math.random() * 2 + 1 );
	int ran = 1;
	String filename = subject + ran;
	Readfile r = new Readfile();
	//System.out.println(filename);
	r.openFile();
	r.readFile();
	r.closeFile();

	one = new JLabel("Question 1");
	two = new JLabel("Question 2");
	three = new JLabel("Question 3");
	four = new JLabel("Question 4");
	five = new JLabel("Question 5");
	
	a1 = new JRadioButton();
	a1.setText("A");
	b1 = new JRadioButton();
	b1.setText("B");
	c1 = new JRadioButton();
	c1.setText("C");
	d1 = new JRadioButton();
	d1.setText("D");
	e1 = new JRadioButton();
	e1.setText("E");

	a2 = new JRadioButton();
	a2.setText("A");
	b2 = new JRadioButton();
	b2.setText("B");
	c2 = new JRadioButton();
	c2.setText("C");
	d2 = new JRadioButton();
	d2.setText("D");
	e2 = new JRadioButton();
	e2.setText("E");

	a3 = new JRadioButton();
	a3.setText("A");
	b3 = new JRadioButton();
	b3.setText("B");
	c3 = new JRadioButton();
	c3.setText("C");
	d3 = new JRadioButton();
	d3.setText("D");
	e3 = new JRadioButton();
	e3.setText("E");

	a4 = new JRadioButton();
	a4.setText("A");
	b4 = new JRadioButton();
	b4.setText("B");
	c4 = new JRadioButton();
	c4.setText("C");
	d4 = new JRadioButton();
	d4.setText("D");
	e4 = new JRadioButton();
	e4.setText("E");

	a5 = new JRadioButton();
	a5.setText("A");
	b5 = new JRadioButton();
	b5.setText("B");
	c5 = new JRadioButton();
	c5.setText("C");
	d5 = new JRadioButton();
	d5.setText("D");
	e5 = new JRadioButton();
	e5.setText("E");
	
	q1 = new ButtonGroup();
	q1.add(a1);
	q1.add(b1);
	q1.add(c1);
	q1.add(d1);
	q1.add(e1);
	
	q2 = new ButtonGroup();
	q2.add(a2);
	q2.add(b2);
	q2.add(c2);
	q2.add(d2);
	q2.add(e2);
	
	q3 = new ButtonGroup();
	q3.add(a3);
	q3.add(b3);
	q3.add(c3);
	q3.add(d3);
	q3.add(e3);
	
	q4 = new ButtonGroup();
	q4.add(a4);
	q4.add(b4);
	q4.add(c4);
	q4.add(d4);
	q4.add(e4);
	
	q5 = new ButtonGroup();
	q5.add(a5);
	q5.add(b5);
	q5.add(c5);
	q5.add(d5);
	q5.add(e5);
	
	submit = new JButton("Done");
	
	//LAYOUT
	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.PAGE_AXIS) );

	//ACTION LISTENER STUFF

	//ADD COMPONENTS ONTO GUI
	pane.add(title);

	pane.add(one);
	pane.add(a1);
	pane.add(b1);
	pane.add(c1);
	pane.add(d1);
	pane.add(e1);

	pane.add(two);
	pane.add(a2);
	pane.add(b2);
	pane.add(c2);
	pane.add(d2);
	pane.add(e2);

	pane.add(three);
	pane.add(a3);
	pane.add(b3);
	pane.add(c3);
	pane.add(d3);
	pane.add(e3);

	pane.add(four);
	pane.add(a4);
	pane.add(b4);
	pane.add(c4);
	pane.add(d4);
	pane.add(e4);

	pane.add(five);
	pane.add(a5);
	pane.add(b5);
	pane.add(c5);
	pane.add(d5);
	pane.add(e5);

	pane.add(submit);
    }

    public static void main(String[] args) {
	Quiz q = new Quiz();
	q.setVisible(true);
	q.pack();
    }
}
