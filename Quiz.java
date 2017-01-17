import java.util.Scanner;


public class Quiz{
    public int score=0;
    public String ans;
    public int getScore(){
	return score;
    }

    public void Scene(String subject){
	System.out.println("Suddenly, your teacher gives you a pop quiz");
	System.out.println("There are 3 questions: ");
	if(subject.equals("Math")){

	}

    }

    public void Math(){
	Scanner user_input = new Scanner( System.in );
	System.out.println("What is 16^2");
	ans = user_input.next();
	if(ans.equals("256")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is 256");
	}
	System.out.println("");
	System.out.println("What is the measure (in degrees) of the third angle if the first two are 120 and 10");
	ans = user_input.next();
	if(ans.equals("50")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is 50");
	}
	System.out.println("");
	System.out.println("What is the sine of 90 degrees");
	ans = user_input.next();
	if(ans.equals("1")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is 1");
	}
	
	
    }
}
