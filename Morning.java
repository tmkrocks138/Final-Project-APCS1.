import java.util.Scanner;


public class Morning{

    public boolean late;

    public boolean getLate(){
	return late;
    }

    public void scene(){
	Scanner user_input = new Scanner( System.in );	
	System.out.println("You wake up to the sound of your alarm!");
	System.out.println("You know it is too early in the morning to face Stuy");
	System.out.println("");
	System.out.println("Do you want to press your snooze button (Type yes or no)");
	String snooze = user_input.next();

	if (snooze.equals("yes")){
//	    AlarmClock a = new AlarmClock();
//	    a.setVisible(true);
	    System.out.println("");
	    System.out.println("Sadly, due to snoozing your alarm clock (and train delays)");
	    System.out.println("you got to school late");
	    late = true;
	}
	else if(snooze.equals("no")){
	    System.out.println("");
	    System.out.println("You stumble out of bed and eventually get to school on time");

	}

    }

}

