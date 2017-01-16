import java.io.*;
import java.util.*;

public class Readfile {
    private Scanner sc;

    public void openFile() {
	try {
	    sc = new Scanner( new File("./QuizQuestions/Science1.txt") );
	} catch(Exception e) {
	    System.out.println("file not found");
	}
    }

    public void readFile() {
	while ( sc.hasNext() ) {
	    String a = sc.nextLine();
	    System.out.println(a);
	}
    }

    public void closeFile() {
	sc.close();
    }

    public static void main(String[] args) {
	Readfile r = new Readfile();
	r.openFile();
	r.readFile();
	r.closeFile();
    }
}
