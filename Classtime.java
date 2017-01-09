import java.util.Scanner;
public class Classtime{

    public boolean cut;

    public boolean getCut(){
	return cut;
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

    }
    
    public void noCutScene(){

    }

}

