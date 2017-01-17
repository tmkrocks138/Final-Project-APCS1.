import java.util.Scanner;
import java.lang.Math;

public class Classtime{

    public boolean cut;
    public String where;
    public boolean sleep;    
    public String wakeFriend;
    public boolean wake = false;
    public int quizScore= -1;
    

    public boolean getSleep(){
	return sleep;
    }

    public boolean getWake(){
	return wake;
    }

    public boolean getCut(){
	return cut;
    }

    public String getWhere(){
	return where;
    }
    public String getWakeFriend(){
	return wakeFriend;
    }
    public int getQS(){
	return quizScore;
    }
    
    public void scene(String trait, boolean friendCut, String subject, boolean late){
	Scanner user_input = new Scanner( System.in );
	System.out.println("After finishing some of your classes, you hear a rumor you have a sub next period");
	System.out.println("Do you want to cut that class? (Type yes or no)");
	String cutS = user_input.next();
	if (cutS == "yes"){
	    cut = true;
	    this.cutScene(friendCut);
	}
	else{
	    cut = false;
	    this.noCutScene(trait, subject, late);
	    System.out.println("");
	    System.out.println("Type ok to continue");
	    user_input.next();
	    System.out.println("");
	    Quiz q = new Quiz();
	    q.Scene(subject);
	    quizScore = q.getScore();
	    
	}
	
	System.out.println("");
        System.out.println("Type ok to continue");
	user_input.next();
	System.out.println("");

    }

    public void cutScene (boolean friendCut){
	Scanner user_input = new Scanner( System.in );
	if(friendCut){
	    System.out.println("Your best friend also decided to cut this with you");
	}
	else{
	    System.out.println("Sadly, your best friend does not want to cut with you");
	}
	System.out.println("You can either go to the half floor to hang out");
	System.out.println("or go the cafeteria to study.");
	System.out.println("Type 1 to go to the half floor");
	System.out.println("Type 2 to go to the cafeteria");
	System.out.println("");
        where = user_input.next();
	System.out.println("");

	if (where.equals("1")){
	    System.out.println("You relax on the half floor but go to your later classes");
	    System.out.println("");
	}
	else if (where.equals("2")){
	    System.out.println("You start on some of your homework but go to your later classes");
	}
	
    }
    
    public void noCutScene(String trait, String subject, boolean lateToSchool){
	int num = (int)(Math.random() * 10)+1;
        Scanner user_input = new Scanner( System.in );	
        System.out.println("");
       	System.out.println("It seems to be a good idea to go to class because your normal teacher was there");
	System.out.println(subject +" class you were in was particularly boring");
	System.out.println("");
	
	if(trait == "Lazy" && !lateToSchool){
	    sleep = true;
	    System.out.println("Since you came into school on time and you are lazy, you  slowly dosed off");
	    
	}
	else if (!lateToSchool && (num % 3 == 0)){
	    sleep = true;
	    System.out.println("Since you came into school ontime, you were tired and slowly dozed off");
	}
	else{
	    sleep = false;
	    System.out.println("You somehow manage to stay awake, even if you aren't listening");
	    System.out.println("You notice that one of your friends is sleeping next to you");
	    System.out.println("Do you want to wake them up or not? (Type yes or no)");
	    System.out.println("");

	    wakeFriend = user_input.next();

	    if(wakeFriend.equals("no")){
		System.out.println("");
		System.out.println("Sadly, your friend gets yelled at. However it is better them than you");
	    }
	    else{
                WakeUpFriend w = new WakeUpFriend();
                w.setVisible(true);
           	System.out.println("Type ok to continue");
		user_input.next();
		if (Integer.parseInt(w.getClicks()) <=5){
		    System.out.println("You didn't tap them enough and they didn't wake up");
		}

		else if(Integer.parseInt(w.getClicks())<= 10){
		    System.out.println("Yay, you looked out for your friend");
		    wake = true;
		}
	
		else {
		    System.out.println("You poked them to many times and they got startled");
		    System.out.println("You both got a glare from the teacher :(");
		}
            }

	}
    }

}
