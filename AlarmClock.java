import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AlarmClock extends JFrame implements ActionListener {
    private Container pane;
    private JButton submit;

    public AlarmClock() {
	this.setTitle("Alarm Clock");
	this.setSize(310,250);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
