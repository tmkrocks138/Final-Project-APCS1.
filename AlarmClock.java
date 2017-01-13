import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AlarmClock extends JFrame implements ActionListener {
    private Container pane;
    private JLabel ring;
    private JButton snooze;
    private JLabel question;

    public AlarmClock() {
	this.setTitle("Alarm Clock");
	this.setSize(240,330);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	ring = new JLabel("RING! RING!", SwingConstants.CENTER);
	snooze = new JButton( new ImageIcon("Clock.png") );
	question = new JLabel("Do you want to sleep in?", SwingConstants.CENTER);

	pane = this.getContentPane();
	pane.setLayout( new BoxLayout(pane, BoxLayout.PAGE_AXIS) );
	
	snooze.addActionListener(this);
	snooze.setActionCommand("Snoozed");

	pane.add(ring);
	pane.add(snooze);
	pane.add(question);

    }

    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	if ( event.equals("Snoozed") ) {
	    //System.exit(0);
	}	
    }
    
    public static void main(String[] args) {
	AlarmClock a = new AlarmClock();
	a.setVisible(true);
    }
}
