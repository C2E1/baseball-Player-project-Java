/**
 * Inherits from baseballplayer
 * will have an constructor which uses an extra  parameter
 */
public class Pitcher extends BaseballPlayer{
	private float era;
	public Pitcher (int num, String l, String f, float r,float e){
		super(num,l,f,r);
		era = e;//extra parameter era
		
	}
	public void setPlayerEra(float e){//set method for era
		if(e<0 || e>1) throw new IllegalArgumentException("Invalid");
		era =e;
	}
	
	public String toString(){//tostring for pitcher which includes era
		/**
		 * @return returns a string with names of the elements in particular order
		 */
		return getPlayerNumber() +" " + getPlayerlastname() + " " + getPlayerfirstname() +"  " + "Avg:  "+ getPlayeravg() +"  " + "ERA: "+ era +"  " +"\n";
	}
}
