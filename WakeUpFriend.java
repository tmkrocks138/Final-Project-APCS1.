import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WakeUpFriend extends JFrame implements ActionListener {
    private Container pane;
    private JLabel info, numPokes, time;
    private JButton poke;
    private int counter, timeLeft;

    public WakeUpFriend() {
	this.setTitle("Wake up your friend!");
	this.setSize(300,300);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	counter = 0;
	timeLeft = 10;
	
	info = new JLabel("Poke your friend a few times to wake him up.");
	time = new JLabel(timeLeft + "");
	numPokes = new JLabel(counter + "");
	poke = new JButton( new ImageIcon("Sleeping.png") );

	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.PAGE_AXIS) );
	
	poke.addActionListener(this);
	poke.setActionCommand("Poked");

	pane.add(info);
	pane.add(time);
	pane.add(numPokes);
	pane.add(poke);

    }

    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	if ( event.equals("Poked") ) {
	    counter += 1;
	}	
    }
    
    public static void main(String[] args) {
	WakeUpFriend a = new WakeUpFriend();
	a.setVisible(true);
    }
}
