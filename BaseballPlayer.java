/**
 *The Baseball player class has 4 instance
 *variables. One for number,avg,firstname and last name. 
 * 
 *
 */
public  class BaseballPlayer{
	private int number;
	private String firstname;
	private String lastname;
	private float avg;
	
	
	/**
	 *Description of BaseballPlayer
	 *This class will take in four arguments from main    
	 * @param num This will be player number it must be a number between 1 and 100
	 * @param lname last name is just a string
	 * @param fname first name is just a string
	 * @param r batting average is of type float An exception is thrown if the variable is greater than 1 or less than 0
	 */
	public BaseballPlayer(int num, String l, String f, float r){
		if(r<0 || r>1) throw new IllegalArgumentException("Invalid");//condition for r
		if(num<0 || num >100) throw new IllegalArgumentException("invalid");//condition for player number
		number=num;//sets number
		firstname=f;//sets firstname
		lastname=l;//sets lastname
		avg=r;//sets avg
	}
	
	
	public void setPlayerlastname(String l){//set method for lastname
		lastname=l;		
	}
	
	public void setPlayerfirstname(String f){//set method for firstname
		firstname=f;		
	}
	public void setPlayerNumber(int num){//set method for player number
		if(num<0 || num >100) throw new IllegalArgumentException("invalid");
		number=num;
	}
	public void setPlayeravg(float r){//set methos for player avg
		if(r<0 || r>1) throw new IllegalArgumentException("Invalid");
		avg =r;
	}
	
	public String getPlayerlastname(){//getmethod
		return lastname;		
	}
	
	public String getPlayerfirstname(){//getfirstname
		return firstname;		
	}
	public int getPlayerNumber(){//getplayernumber
		return number;
	}
	public float getPlayeravg(){//getplayeravg
		return avg;
	}
	
	public String toString(){//overloaded tostring nice output for baseball player
		/**
		 * @return returns a string with names of the elements in particular order
		 */
		return number +"  " + lastname + "  " + firstname +"  " + "AVG: "+ avg +"  " + "\n";
		
	}
	   
}//baseballPlayer
