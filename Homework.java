import java.util.Scanner;

public class Homework{
    private String option;
    //1-->Stay up late to finish
    //2-->Sacrafice CS and sleep early
    //3-->Sacrafice History and sleep early
    //4-->Mental Health day tomorrow


    public String getOption(){
	return option;
    }

 public void scene(String trait, boolean late){
	Scanner user_input = new Scanner( System.in );
	if(late == true){
	    System.out.println("After hanging out, you get home late.");
	}
	else if (late==false){
	    System.out.println("You get home right away after school.");
	}
	System.out.println("Sadly, you have a lot of homework :(");
	System.out.println("You finished most of it but you have CS and History left");
	System.out.println("");
	System.out.println("You could choose to do your homework, sacrifice homework,");
	System.out.println("copy a friend's homework, or sleep now and not go to school tomorrow.");
	if (trait != "Hardworking"){
	System.out.println("Type '1' to stay up late and finish it all");
	System.out.println("Type '2' to finish history, and leave CS");
	System.out.println("Type '3' to finish CS, and leave history");
	System.out.println("Type '4' to steal your friends homework");
	System.out.println("Type '5' to leave both and take a mental health day tomorrow");
	
	option = user_input.next( );
	}
	
	else{
 	System.out.println("However since you are hardworking you choose to stay up to finish it");
 	System.out.println("Enter ok to continue");
	option = "1";
	user_input.next();
	}

    }

    public void sleep(String opt){
		System.out.println("You have made your choice");
	if (opt.equals("1")){
	    System.out.println("You stay up really late but get all your homework done.");

	}
	else if (opt.equals("2")){
	    System.out.println("You finish your history homework, but you upset Mr.K");

	}
	else if (opt.equals("3")){
	    System.out.println("Yay!! You do your CS homework! Your Priorities are sorted!");

	}
	else if (opt.equals("4")){
	    System.out.println("That is academically dishonest, but you have both homeworks done");

	}
	else if (opt.equals("5")){
	    System.out.println("School is overated anyways! Why go when you could stay home?");

	}    
   }

}
