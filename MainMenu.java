import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame implements ActionListener {
    private Container pane;
    private JLabel title;
    private JButton newCharacter, newGame, continueGame, options, quit;

    public MainMenu() {
	this.setTitle("Main Menu");
	this.setSize(400,200);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	//COMPONENTS
	//title = new JLabel ("Life of a Stuy Student");
	newCharacter = new JButton("Make a New Character");
	newGame = new JButton("Start a New Game");
	continueGame = new JButton("Continue Game");
	options = new JButton("Options");
	quit = new JButton("Quit");

	//LAYOUT
	pane = this.getContentPane();
	//pane.setLayout( new BoxLayout(pane, BoxLayout.Y_AXIS) );
	pane.setLayout( new BorderLayout() );

	//ACTION LISTENER STUFF
	newCharacter.addActionListener(this);
	newCharacter.setActionCommand("newCharacter");
	quit.addActionListener(this);
	quit.setActionCommand("quit");


	//ADD COMPONENTS ONTO GUI
	//pane.add(title, BorderLayout.PAGE_START);
	pane.add(newCharacter, BorderLayout.PAGE_START);
	pane.add(newGame, BorderLayout.LINE_START);
	pane.add(continueGame, BorderLayout.CENTER);
	pane.add(options, BorderLayout.LINE_END);
	pane.add(quit, BorderLayout.PAGE_END);
    }


    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	if ( event.equals("newCharacter") ) {
	    Character c = new Character();
	    
	}
	if ( event.equals("quit") ) {
	    System.exit(0);
	}
    }
    
    public static void main(String[] args) {
	MainMenu mm = new MainMenu();
	mm.setVisible(true);
    }
}
