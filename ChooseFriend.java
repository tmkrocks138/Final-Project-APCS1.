import java.lang.Math;   

public class ChooseFriend{

 /*
      a - jock
      b - slacker
      c - stc
      d - sandd
      e - nerd
     */
    
    public Friends a = new Jock();
    public Friends b = new Slacker();
    public Friends c = new STC();
    public Friends d = new SandD();
    public Friends e = new Nerd();

    public Friends[] listy = {a, b, c, d, e};

    public Friends SetBFF(){
	int rand = (int) (Math.random() * 100);
	rand = rand % 5;

	return listy[rand];
    }
}
