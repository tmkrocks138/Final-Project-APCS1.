import java.lang.Math;
import java.util.Scanner;

public class Final{
/*
This is all of the parts added together
*/

    public static void main(String[] args){
        Scanner user_input = new Scanner( System.in );

//Create a character

	Character c = new Character();
	c.setVisible(true);
//	String trait=c.getTrait();
//	String subject = c.getSubject();
//System.out.println(subject);
	ChooseFriend cf = new ChooseFriend();
	Friends BFF = cf.SetBFF();
	BFF.setCut();
	BFF.setHangAfterSchool();

		System.out.println("You have been randomly assigned a best friend.");
	//Explain bff
	//System.out.println(BFF);

	if (BFF.equals(cf.getA())){
	    System.out.println("Your best friend is a jock (yes they exist at Stuy)");
		}

	if (BFF.equals(cf.getB())){
	    System.out.println("Your best friend is a bit of an 'underachiever'");
		}
	if (BFF.equals(cf.getC())){
	    System.out.println("Your best friend loves theater and is heavily involved in STC");
		}
	if (BFF.equals(cf.getD())){
	    System.out.println("Your best friend is a member of the Stuyvesant Debate Team");
		}
	if (BFF.equals(cf.getE())){
	    System.out.println("Your best friend is just your average student ...  a nerd");
		}

	System.out.println("Enter ok to continue");
	user_input.next( );
	
	boolean bffCut = BFF.getCut(); 
	boolean bffAS = BFF.getHangAfterSchool();
//System.out.println(bffAS);
        String trait=c.getTrait();
        String subject = c.getSubject();
//System.out.println(subject);


//Wake up

Morning gm = new Morning();
gm.scene();
boolean uplate = gm.getLate();



//Class


	Classtime ct = new Classtime();
	ct.scene(trait, bffCut, subject, uplate);
	boolean uCut = ct.getCut();
	String cutWhere = "3";
	if (uCut){
	    cutWhere = ct.getWhere();//1-half floor 2-Cafe
	}
	boolean sleepInClass = false;
	if (!uCut){
	    sleepInClass = ct.getSleep();
	}
	
	String wakeBuddy="NA";
	if(!uCut){
	    wakeBuddy = ct.getWakeFriend();
	}
	boolean winWakeUp = ct.getWake();
	int quizClass = ct.getQS();
	


//After School

	AfterSchool as = new AfterSchool();
	as.scene(trait, bffAS);
	System.out.println("");
	System.out.println("Enter ok to continue");
	user_input.next( );
	boolean late = as.late(trait, bffAS);
//Homework

	Homework hw = new Homework();
	hw.scene(trait, late);
	String homeChoice = hw.getOption();
	hw.sleep(homeChoice);
//	System.out.println(homeChoice);
System.out.println("");
	System.out.println("YOU SURVIVED A DAY AT STUY!!");
	System.out.println("Enter ok to get your score");
	user_input.next( );

	int relax = 0;
	int school = 0;
	int social = 0;

	if (uplate){
	    relax += 3;
	}

	else if (!uplate){
	    school += 2;
	}
	if (uCut){
	    relax += 2;
	    if(cutWhere.equals("1")){
		social += 3;
		if (bffCut){
		    social += 1;
		}
	    }
	    else if (cutWhere.equals("2")){
		school += 1;
		if (bffCut){
		    social += 1;
		    relax +=1;
		}
	    
	    }
	}

	else if (!uCut){
	    school += 2;
	    if (sleepInClass){
		relax+=1;
	    }
	    if(wakeBuddy.equals("yes")){
		social += 2;
		if(winWakeUp){
		    social += 2;
		}
	    }
	    if(quizClass > 0){
		school += 1;
	    }
	    if(quizClass == 3){
		school += 1;
	    }
	    
	}
	
	if (late){
	    social += 1;
	}
	
	else if (!late){
	    school += 1;
	}

	
	if (homeChoice.equals("1")){
	    school += 3;
	}
	else if (homeChoice.equals("2")){
	    school += 1;
	    relax += 1;
	}
	else if (homeChoice.equals("3")){
	    school += 1;
	    relax += 1;
	}
	else if (homeChoice.equals("4")){
	    school += 2;
	    relax += 1;
	    social += 2;
	}
	else if (homeChoice.equals("5")){
	    relax += 4;
	}



	System.out.println("Your relax score was "+relax+" out of 10");
	System.out.println("Your school score was "+school+" out of 10");
	System.out.println("Your social score was "+social+" out of 10");
	


System.exit(0);

}

}
