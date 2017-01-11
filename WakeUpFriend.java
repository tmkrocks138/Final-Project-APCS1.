import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WakeUpFriend extends JFrame {
    private Container pane;
    private JLabel info, numPokes, time;
    private Timer timer;
    private JButton poke;
    private int counter, timeLeft;

    public WakeUpFriend() {
	this.setTitle("Wake up your friend!");
	this.setSize(300,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	counter = 0;
	timeLeft = 10;
	
	info = new JLabel("Poke your friend a few times to wake him up.");
	time = new JLabel(timeLeft + "");
	timer = new Timer(1000, this);
	numPokes = new JLabel(counter + "");
	poke = new JButton( new ImageIcon("Sleeping.png") );

	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.PAGE_AXIS) );

	
	
	poke.addActionListener(this);
	poke.setActionCommand("Poked");
	timer.setActionCommand("Ticked");

	pane.add(info);
	pane.add(time);
	pane.add(numPokes);
	pane.add(poke);

    }

    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	if ( event.equals("Poked") ) {
	    counter += 1;
	    numPokes.setText(counter+"");
	    //System.out.println(counter);
	}
	if ( event.equals("Ticked") ) {
	    time.setText(timeLeft+"");
	}
	    
    }
    
    public static void main(String[] args) {
	WakeUpFriend a = new WakeUpFriend();
	Timer t = new Timer();
	a.setVisible(true);
	t.start();
    }
}
