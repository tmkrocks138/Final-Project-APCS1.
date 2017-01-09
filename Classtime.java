import java.util.Scanner;
public class Classtime{

    public boolean cut;
    public String where;

    public boolean getCut(){
	return cut;
    }

    public String getWhere(){
	return where;
    }
    
    public void scene(String trait, boolean friendCut){
	Scanner user_input = new Scanner( System.in );
	System.out.println("After finishing some of your classes, you hear a rumor you have a sub next period");
	System.out.println("Do you want to cut that class? (Type yes or no)");
	String cutS = user_input.next();
	if (cutS == "yes"){
	    cut = true;
	    this.cutScene(friendCut);
	}
	else if(cutS == "no"){
	    cut = false;
	    this.noCutScene();
	}
	
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
    
    public void noCutScene(){

    }

}

