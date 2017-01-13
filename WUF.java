import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WUF extends JFrame implements ActionListener {
    private Container pane;
    private JLabel info, numPokes, time;
    private JButton poke, submit;
    private Timer timer;
    private int counter, timeLeft;

    public WUF() {
	this.setTitle("Wake up your friend!");
	this.setSize(300,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	//COMPONENTS
	counter = 0;
	timeLeft = 10;

	info = new JLabel("Poke your friend a few times to wake him up.");
	time = new JLabel("Time Left: " + timeLeft);
	numPokes = new JLabel("Clickies: " + counter);
	poke = new JButton( new ImageIcon("Sleeping.png") );
	submit = new JButton("Done!");

	//TIMER
	timer = new Timer(1000, this);
	timer.start();
	
	//LAYOUT
	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.PAGE_AXIS) );

	//ACTION LISTENER STUFF
	poke.addActionListener(this);
	poke.setActionCommand("Poked");
	timer.setActionCommand("Ticked");

	//ADD COMPONENTS ONTO GUI
	pane.add(info);
	pane.add(time);
	pane.add(numPokes);
	pane.add(poke);
	pane.add(submit);

    }

    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	if ( event.equals("Poked") && timeLeft != 0) {
	    counter += 1;
	    numPokes.setText("Clickies: " + counter);
	}
	if ( event.equals("Ticked") ) {
	    timeLeft--;
	    time.setText("Time Left: " + timeLeft);
	    if ( timeLeft == 0 ) {
		timer.stop();
		time.setText("Times up!");
	    }
	}
    }

    public String getClicks() {
	return counter+"";
    }
    
    public static void main(String[] args) {
	WUF a = new WUF();
	a.setVisible(true);
    }
}
