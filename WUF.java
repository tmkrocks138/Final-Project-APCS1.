import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WUF extends JFrame implements ActionListener {
    private Container pane;
    private JLabel info, numPokes, time;
    private JButton poke;
    private Timer timer;
    private int counter, timeLeft;

    public WUF() {
	this.setTitle("Wake up your friend!");
	this.setSize(300,300);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	counter = 0;
	timeLeft = 10;
	
	info = new JLabel("Poke your friend a few times to wake him up.");
	time = new JLabel("Time Left: " + timeLeft);
	numPokes = new JLabel(counter + "");
	poke = new JButton( new ImageIcon("Sleeping.png") );
	timer = new Timer(1000, this);

	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.PAGE_AXIS) );
	
	poke.addActionListener(this);
	poke.setActionCommand("Poked");
	timer.setActionListener("Ticked");

	pane.add(info);
	pane.add(time);
	pane.add(numPokes);
	pane.add(poke);

	timer.start();

    }

    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	if ( event.equals("Poked") ) {
	    counter += 1;
	}
	if ( event.equals("Ticked") ) {
	    timeLeft--;
	    time.setText(timeLeft+"");
	    if ( timeLeft == 1 ) {
		timer.stop();
	    }
	}
    }
    
    public static void main(String[] args) {
	WUF a = new WUF();
	a.setVisible(true);
    }
}
