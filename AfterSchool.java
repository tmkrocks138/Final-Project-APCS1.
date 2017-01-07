import java.lang.Math;

public class AfterSchool{

    public boolean isBusy(String trait){
	boolean busy = true;
	int num = (int)(Math.random() * 10)+1;
	if (trait == "Shy"){
	    if (num % 3 == 0){
		busy = true;
	    }

	}
	else if (trait == "Friendly"){
	    busy = false;
	}
	else if(num % 3 != 0){
	    busy = false;
	}
	else{
	    busy = true;
	}
	return busy;
    }

 public void scene(String trait, boolean bff){
	boolean bee = this.isBusy(trait);
	System.out.println("After a long hard day of classes, you have finally reached the end of the day!!");
	System.out.println("Today, you have no activities to do after school");
	if(bee = true){
	    System.out.println("Because of that, you have chosen to go home on time");
	    System.out.println("You need to get a start on your homework");
	}
	
	else if (bff == false){
	System.out.println("You want to hang out with a friend since you have tie");
	System.out.println("However, your best friend is busy so you have to go home");
	}
	else{
	    System.out.println("Luckily, your best friend had nothing to do after school as well");
	    System.out.println("The two of you decided to hang out but you got to school");
	}

    }


}



