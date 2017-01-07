import java.lang.Math;

public class AfterSchool{

    boolean busy;

    public boolean isBusy(String trait){
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

}


