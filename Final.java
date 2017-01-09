import java.lang.Math;
import java.util.Scanner;

public class Final{
/*
This is all of the parts added together
*/

    public static void main(String[] args){
	int social = 0;
	int school = 0;
	int stress = 0;
        Scanner user_input = new Scanner( System.in );

//Create a character

	/*Character c = new Character();
	c.setVisible(true);
	String trait=getTrait();
	String subject = getSubject();
	*/

	ChooseFriend cf = new ChooseFriend();
	Friends BFF = cf.SetBFF();
	BFF.setCut();
	BFF.setHangAfterSchool();

	System.out.println(BFF);	
	
	boolean bffCut = BFF.getCut(); 
	boolean bffAS = BFF.getHangAfterSchool();
	System.out.println(bffAS);
//Wake up





//Class





//After School

	AfterSchool as = new AfterSchool();
	as.scene("Friendly", bffAS);
	System.out.println("");
	System.out.println("Enter ok to continue");
	user_input.next( );
	boolean late = as.late("Friendly", bffAS);
//Homework

	Homework hw = new Homework();
	hw.scene("Friendly", late);
	String homeChoice = hw.getOption();
	hw.sleep(homeChoice);
//	System.out.println(homeChoice);
	System.out.println("Enter ok to recieve your score");
	user_input.next( );

//Score Calculation



}

}
