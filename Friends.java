//Abstract Friends
public abstract class Friends {
    boolean cut;
    boolean hangAfterSchool;
    int timeHome;
    boolean Facebook;
    String FacebookMessage;
   
    abstract void setCut();
    abstract void setTimeHome();
 abstract void setHangAfterSchool();
    abstract void setFacebook();
    abstract void setFacebookMessage();

    public boolean getCut(){
	return cut;
    }
    public boolean getHangAfterSchool(){
	return hangAfterSchool;
    }
    public int getTimeHome(){
	return timeHome;
    }
    public boolean getFacebook(){
	return Facebook;
    }
    public String getFacebookMessage(){
	return FacebookMessage;
    }
}

