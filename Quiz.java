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
	    this.Math();
	}
	else if(subject.equals("Science")){
	    this.Science();
	}
	else if(subject.equals("Computer Science")){
	    this.CompSci();
	}
	else if (subject.equals("History")){
	    this.History();
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

    public void Science(){
	Scanner user_input = new Scanner( System.in );
	System.out.println("Is the compound ‘HCl’ an acid or base?");
	ans = user_input.next();
	if(ans.equals("acid")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is acid");
	}
	System.out.println("");
	System.out.println("What is the constant for gravity on Earth (three significant figures)");
	ans = user_input.next();
	if(ans.equals("9.81")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is 9.81");
	}
	System.out.println("");
	System.out.println("Botany is the study of");
	ans = user_input.next();
	if(ans.equals("plants")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is plants");
	}
	
    }
    public void CompSci(){
	Scanner user_input = new Scanner( System.in );
	System.out.println("How do you comment in java");
	ans = user_input.next();
	if(ans.equals("//")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is //");
	}
	System.out.println("");
	System.out.println("In java, how do you simplify a = a + 1");
	ans = user_input.next();
	if(ans.equals("a++")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is a++");
	}
	System.out.println("");
	System.out.println("What type of number is int");
	ans = user_input.next();
	if(ans.equals("integer")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is integer");
	}
	
    }

    public void CS(){
	Scanner user_input = new Scanner( System.in );
	System.out.println("How do you comment in java");
	ans = user_input.next();
	if(ans.equals("//")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is //");
	}
	System.out.println("");
	System.out.println("In java, how do you simplify a = a + 1");
	ans = user_input.next();
	if(ans.equals("a++")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is a++");
	}
	System.out.println("");
	System.out.println("What type of number is int");
	ans = user_input.next();
	if(ans.equals("integer")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is integer");
	}
	
    }
     public void History(){
	Scanner user_input = new Scanner( System.in );
	System.out.println("What year was the Magna Carta signed");
	ans = user_input.next();
	if(ans.equals("1215")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is 1215");
	}
	System.out.println("");
	System.out.println("What was the last name of the principle author of Declaration of Independence");
	ans = user_input.next();
	if(ans.equals("Jefferson")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is Jefferson");
	}
	System.out.println("");
	System.out.println("Which modern country is the house to the Pyramids at Giza");
	ans = user_input.next();
	if(ans.equals("Egypt")){
	    score++;
	    System.out.println("Correct");
	}
	else{
	    System.out.println("Wrong, it is Egypt");
	}
	
    }
}
