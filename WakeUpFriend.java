import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WakeUpFriend extends JFrame {
    private JLabel info, numPokes, time;
    private Timer timer;
    private JButton poke;
    private int counter, timeLeft;

    public WakeUpFriend() {
        setLayout( new BoxLayout(pane, BoxLayout.PAGE_AXIS) );
	
	counter = 0;
	timeLeft = 10;
	
	info = new JLabel("Poke your friend a few times to wake him up.");
	time = new JLabel(timeLeft + "");
	timer = new Timer(1000, this);
	numPokes = new JLabel(counter + "");
	poke = new JButton( new ImageIcon("Sleeping.png") );
	
        add(info);
        add(time);
        add(numPokes);
        add(poke);

	event e = new event();
	poke.addActionListener(e);

    }

    public class event implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    timerLabel.setText(timeLeft + "");

	    TimeClass tc = new TimeClass(counter);
	    timer = new Timer(1000, tc);
	    timer.start();
	}
    }
		       
	poke.addActionListener(this);
	poke.setActionCommand("Poked");
	timer.setActionCommand("Ticked");

    public class TimeClass implements ActionListener {
	int counter;

	public TimeCLass(int counter) {
	    this.counter = counter;
	}

	public void actionPerformed(ActionEvent tc) {
	    counter--;

	    if ( counter >= 1) {
		timerLabel.setText("Time left: " + counter);
	    }
	    else {
		time.stop();
		timeLabel.setText("Out of time!");
	    }
	}
    }
    
    /*
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
    */
    
    public static void main(String[] args) {
	WakeUpFriend a = new WakeUpFriend();
	Timer t = new Timer();

	this.setTitle("Wake up your friend!");
	this.setSize(300,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	a.setVisible(true);
	t.start();
    }
}
